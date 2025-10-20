
# 🚀 Task 1 - Server Management App

[![Java](https://img.shields.io/badge/Java-17-blue?logo=java)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-brightgreen?logo=springboot)](https://spring.io/projects/spring-boot)
[![MongoDB](https://img.shields.io/badge/MongoDB-6.0-green?logo=mongodb)](https://www.mongodb.com/)
[![Docker](https://img.shields.io/badge/Docker-24.0-blue?logo=docker)](https://www.docker.com/)
  

---

## 🛠 Prerequisites

Before running the app, ensure you have:

- Java
- Maven
- Spring Boot
- MongoDB
- Docker

---

## 📦 Dependencies

- `spring-boot-starter-web`
- `spring-boot-starter-data-mongodb`
- `spring-boot-maven-plugin`

---

## ▶️ Running the Application


1. Open `/task1` in your preferred IDE (VS Code).  
2. Wait for dependencies and pre-build tasks to finish.  
3. Build the project:

```bash
mvn clean install
```
![mv clean install](https://github.com/Varshith34/KaiburrVarshith/blob/7ae8c608b7e66f993cee49554d0624e480538389/mvncleaninstall.png)
![mv clean install2](https://github.com/Varshith34/KaiburrVarshith/blob/cc8d2ef4253e77568767351cca661be51270bf65/mvncleaninstall2.png)

## 🐳 Docker Setup

`Dockerfile` example:

```dockerfile
FROM openjdk:8-alpine
EXPOSE 8080
ADD target/demo.jar demo.jar
ENTRYPOINT ["java", "-Dspring.data.mongodb.uri=mongodb://mongod:27017/servers", "-jar", "/demo.jar"]
```

## 🧪 Testing the APIs

### Postman

Import and run this collection to test all endpoints:

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/5ff40fbad3968a1b28b0)

> Works with `http://127.0.0.1:8080/servers/`.

### Web UI Forms

> Instructions for using the web interface are in **Task 3**.

### Screenshots
![ss](https://github.com/Varshith34/KaiburrVarshith/blob/2fbcc3a8a225e2470dfd08b173e7cdca34832470/screenshots/KaiburrProof1.png)
![ss](https://github.com/Varshith34/KaiburrVarshith/blob/28a46520e70d9a3c58e7b2213b2a171278156e72/screenshots/KaiburrProof2.png)
![ss](https://github.com/Varshith34/KaiburrVarshith/blob/28a46520e70d9a3c58e7b2213b2a171278156e72/screenshots/KaiburrProof3.png)
![ss](https://github.com/Varshith34/KaiburrVarshith/blob/28a46520e70d9a3c58e7b2213b2a171278156e72/screenshots/KaiburrProof4.png)

