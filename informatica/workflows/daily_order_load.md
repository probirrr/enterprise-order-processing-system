# INFORMATICA WORKFLOW: DAILY_ORDER_LOAD

## Workflow Type
- Batch Workflow

## Tasks
1. Start Task
2. Session Task: Load Orders
   - Mapping: order_mapping
   - Source: ORDER_MASTER
   - Target: Spring Boot API
3. Error Handling Task
4. End Task

## Schedule
- Daily (End of Business Day)

## Restart Strategy
- Restart from failed session

