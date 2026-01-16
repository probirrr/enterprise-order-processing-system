import requests

BASE_URL = "http://localhost:8080"

def check_orders_api():
    response = requests.get(f"{BASE_URL}/orders")
    if response.status_code == 200:
        print("Orders API is UP")
    else:
        print("Orders API FAILED with status:", response.status_code)

def check_order_by_id():
    response = requests.get(f"{BASE_URL}/orders/101")
    if response.status_code == 200:
        print("Order by ID API is UP")
    else:
        print("Order by ID API FAILED with status:", response.status_code)

if __name__ == "__main__":
    check_orders_api()
    check_order_by_id()
