# Fraud Transaction Producer

This Spring Boot microservice simulates user transactions and publishes them to a Kafka topic named `transactions`.

## Features
- REST API to send transaction data
- Kafka producer integration
- Simple transaction model with id, user, amount, location, timestamp, and IP address

## How to Run
1. Start Kafka and Zookeeper locally.
2. Run this Spring Boot application.
3. Use Postman or any HTTP client to send POST requests to `/api/transactions`.

## Example Request

```json
{
  "transactionId": "TXN1001",
  "userId": "user123",
  "amount": 1000,
  "location": "Delhi",
  "timestamp": "2025-06-21T22:00:00",
  "ipAddress": "192.168.1.2"
}
Technology Stack
Java 17+

Spring Boot

Apache Kafka

Maven

yaml
Copy
Edit

7. Save the file (Ctrl + S or File → Save).
