# Enterprise Order Processing System

## 📌 Overview
The Enterprise Order Processing System is an end-to-end enterprise-style backend project that demonstrates how legacy systems (AS400/Synon) integrate with modern applications using Informatica-style ETL, Spring Boot services, and Python automation.

The project simulates real-world enterprise architecture where batch data from legacy systems is transformed, validated, and ingested into modern REST APIs.

---

## 🏗️ High-Level Architecture

AS400 / Synon (Simulated)  
→ Informatica ETL (Simulated)  
→ Spring Boot Batch APIs  
→ Python Automation & Testing  

---

## 🛠️ Technology Stack

- **AS400 / Synon (Simulated)** – Legacy batch processing
- **Informatica (Simulated ETL)** – Source-to-target data integration
- **Java 17**
- **Spring Boot**
- **Maven**
- **Python 3**
- **Git & GitHub**

---

## 📂 Project Structure


# Enterprise Order Processing System

## 📌 Overview
The Enterprise Order Processing System is an end-to-end enterprise-style backend project that demonstrates how legacy systems (AS400/Synon) integrate with modern applications using Informatica-style ETL, Spring Boot services, and Python automation.

The project simulates real-world enterprise architecture where batch data from legacy systems is transformed, validated, and ingested into modern REST APIs.

---

## 🏗️ High-Level Architecture

AS400 / Synon (Simulated)  
→ Informatica ETL (Simulated)  
→ Spring Boot Batch APIs  
→ Python Automation & Testing  

---

## 🛠️ Technology Stack

- **AS400 / Synon (Simulated)** – Legacy batch processing
- **Informatica (Simulated ETL)** – Source-to-target data integration
- **Java 17**
- **Spring Boot**
- **Maven**
- **Python 3**
- **Git & GitHub**

---

## 📂 Project Structure

# Enterprise Order Processing System

## 📌 Overview
The Enterprise Order Processing System is an end-to-end enterprise-style backend project that demonstrates how legacy systems (AS400/Synon) integrate with modern applications using Informatica-style ETL, Spring Boot services, and Python automation.

The project simulates real-world enterprise architecture where batch data from legacy systems is transformed, validated, and ingested into modern REST APIs.

---

## 🏗️ High-Level Architecture

AS400 / Synon (Simulated)  
→ Informatica ETL (Simulated)  
→ Spring Boot Batch APIs  
→ Python Automation & Testing  

---

## 🛠️ Technology Stack

- **AS400 / Synon (Simulated)** – Legacy batch processing
- **Informatica (Simulated ETL)** – Source-to-target data integration
- **Java 17**
- **Spring Boot**
- **Maven**
- **Python 3**
- **Git & GitHub**

---

## 📂 Project Structure

enterprise-order-processing-system/
├── legacy-as400/
│ ├── order_master.txt
│ ├── customer_master.txt
│ └── synon_flow.md
│
├── informatica/
│ ├── etl_job.py
│ ├── mappings/
│ │ └── order_mapping.md
│ └── workflows/
│ └── daily_order_load.md
│
├── spring-boot-api/
│ ├── controller/
│ ├── service/
│ ├── dto/
│ └── resources/
│
├── python-automation/
│ └── api_health_check.py
│
└── README.md

---

## 🟢 AS400 / Synon (Legacy Simulation)

### What is simulated
- DB2/400 tables using **fixed-width flat files**
- Batch-oriented processing
- Synon-style business logic

### Files
- `order_master.txt` – Order data
- `customer_master.txt` – Customer data
- `synon_flow.md` – Synon business flow documentation

### Example Legacy Record
00001ORD0012026011700100NEW


---

## 🟣 Informatica ETL (Simulation)

### Informatica Concepts Covered
- Source → Target mapping
- Transformations (Expression, Filter, Decode)
- Batch workflows
- Error handling & restart-safe logic

### Key Components
- `order_mapping.md` – Mapping document
- `daily_order_load.md` – Workflow definition
- `etl_job.py` – ETL execution engine (Python)

### ETL Responsibilities
- Read AS400 fixed-width files
- Transform and validate records
- Skip invalid legacy data
- Load batch data into Spring Boot APIs

---

## 🔵 Spring Boot Application

### Architecture
- REST Controllers
- Service Layer
- DTO-based data transfer
- Batch ingestion endpoint

### Available APIs
- `GET /orders`
- `GET /orders/{id}`
- `POST /batch/orders`

### Batch API Purpose
Used by Informatica ETL to ingest transformed batch data.

---

## 🐍 Python Automation & Testing

### Automation Coverage
- API health checks
- Integration testing
- Batch validation

### Script
- `api_health_check.py`

### Sample Output
Orders API is UP
Order by ID API is UP

---

## 🧪 Testing Strategy

- Manual API testing using browser and curl
- Automated testing using Python
- End-to-end integration testing:
  AS400 → Informatica → Spring Boot

---

## ▶️ How to Run the Project

### Start Spring Boot

cd spring-boot-api
mvn spring-boot:run

Run Informatica ETL

cd informatica
python etl_job.py

Run Python Automation

cd python-automation
source venv/bin/activate
python api_health_check.py
