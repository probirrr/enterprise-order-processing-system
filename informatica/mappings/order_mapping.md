# INFORMATICA MAPPING: ORDER_MASTER → SPRING BOOT API

## Source
- ORDER_MASTER (legacy-as400/order_master.txt)

## Target
- Spring Boot Order Service (POST /batch/orders)

## Transformations

### Expression Transformation
- Trim all fields
- Convert order_date from YYYYMMDD to YYYY-MM-DD

### Lookup Transformation
- Validate customer_id against CUSTOMER_MASTER

### Decode Transformation
| Source Status | Target Status |
|--------------|--------------|
| NEW          | CREATED      |
| PROC         | PROCESSING  |
| COMP         | COMPLETED   |

### Filter Transformation
- Reject records with invalid amount
- Reject records with missing order_id

## Load Type
- Batch load
- End-of-day processing

