from datetime import datetime
import requests

SOURCE_FILE = "../legacy-as400/order_master.txt"
TARGET_API = "http://localhost:8080/batch/orders"

STATUS_MAP = {
    "NEW": "CREATED",
    "PROC": "PROCESSING",
    "COMP": "COMPLETED"
}

def parse_record(line):
    if len(line.strip()) < 28:
        return None

    try:
        return {
            "orderId": line[0:5].strip(),
            "orderCode": line[5:11].strip(),
            "orderDate": datetime.strptime(line[11:19], "%Y%m%d").date().isoformat(),
            "amount": int(line[19:24]),
            "status": STATUS_MAP.get(line[24:28].strip(), "UNKNOWN")
        }
    except Exception:
        print("Invalid record skipped:", line.strip())
        return None


def run_etl():
    orders = []

    with open(SOURCE_FILE) as f:
        for line in f:
            record = parse_record(line)
            if record:
                orders.append(record)

    if not orders:
        print("No valid records to load")
        return

    response = requests.post(TARGET_API, json=orders)

    if response.status_code == 200:
        print("ETL Load Successful")
    else:
        print("ETL Load Failed:", response.text)


if __name__ == "__main__":
    run_etl()

