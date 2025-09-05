
# 📝 Task Manager API

![Java](https://img.shields.io/badge/Java-17-orange?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?logo=springboot)
![Maven](https://img.shields.io/badge/Maven-3.8+-blue?logo=apachemaven)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)

A simple **Task CRUD (TODO App)** built with **Java Spring Boot** and **Hibernate**.  
It allows you to create, read, update, and delete tasks easily, ideal for learning the basics of building REST APIs with Spring Boot.

---
## 🚀 Technologies Used

- **Java 17+**
- **Spring Boot 3+**
- **Hibernate / JPA**
- **Maven**
- **H2 Database** (in-memory for testing)
- **Lombok** (to reduce boilerplate)
- **Jakarta Validation** (for input validation)
---

## 📂 Project Structure
```plaintext
src/main/java/com/example/todo
│── controller/        → REST endpoints
│── service/           → Business logic
│── repository/        → Data access with JPA
│── model/             → Entities (Task)
│── TodoApplication.java → Main application class
```
---

## 📌Available endpoints

### 🔹 Create a Task
```http
POST /tasks
Content-Type: application/json
```

**Request Body**
```json
{
  "title": "Learn Spring Boot",
  "description": "Practice CRUD operations with Hibernate",
  "done": false
}
```
### 🔹 Get all Tasks
```http
GET /tasks
```

### 🔹 Get Task by ID
```http
GET /tasks/{id}
```
### 🔹 Update a task
```http
PUT /tasks/{id}
Content-Type: application/json
```

**Request Body**
```json
{
  "title": "Learn Spring Boot",
  "description": "Practice CRUD operations with Hibernate",
  "done": false
}
```
### 🔹 Delete Task by ID
```http
GET /tasks/{id}
```
---
## ⚡ How to Run the Project
### 🔹 Clone the repository
```bash
git clone https://github.com/yourusername/todo-api.git
cd todo-api
```

### 🔹 Build and run with Maven
```bash
./mvnw spring-boot:run
```

### 🔹 The API will be available at
```plaintext
http://localhost:8080
```

---
## 🗄️ In-Memory Database (H2)

This project uses **H2 Database** by default.  
Access the H2 console at:

```plaintext
http://localhost:8080/h2-console
```

**Database Configuration**
```plaintext
Driver Class: org.h2.Driver
JDBC URL: jdbc:h2:mem:testdb
User: sa
Password: (empty)
```

---

## ✅ Future Improvements

- Authentication with JWT
- API documentation with Swagger
- Unit and integration tests

---

## 👨‍💻 Author

**Christian Lorenzo Castellanos George**  
💼 Technical Lead | 📱 Full Stack Developer  
🔗 [LinkedIn](https://www.linkedin.com/in/christian-george-476268175/) | [GitHub](https://github.com/christianG1)

---

✨ Built with ❤️ to learn and share knowledge.
