# AS400 / SYNON ORDER PROCESSING FLOW

## Source Files
- ORDER_MASTER (order_master.txt)
- CUSTOMER_MASTER (customer_master.txt)

## Synon Business Logic (Simulated)
1. Read ORDER_MASTER sequentially (batch)
2. Validate Order ID
3. Validate Customer existence
4. Transform order status
   - NEW  -> CREATED
   - PROC -> PROCESSING
   - COMP -> COMPLETED
5. Write valid records to downstream system
6. Reject invalid records

## Processing Type
- Batch oriented
- Fixed-width records
- End-of-day processing

