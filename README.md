# 🛒 E-Commerce Management System Backend

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-Backend-success)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)
![REST API](https://img.shields.io/badge/REST-API-green)
![Maven](https://img.shields.io/badge/Maven-Build-red)
![GitHub](https://img.shields.io/badge/GitHub-Version%20Control-black)

---

## 📌 Project Information

| Property               | Details                                                |
| ---------------------- | ------------------------------------------------------ |
| **Project Name**       | E-Commerce Management System Backend                   |
| **Project Type**       | Internship Project                                     |
| **College**            | Karmaveer Bhaurao Patil College of Engineering, Satara |
| **Internship Program** | Symbiosis Powered by Capgemini                         |
| **Technology**         | Java Spring Boot, MySQL                                |
| **Architecture**       | Layered Architecture                                   |

---

# 👨‍💻 Team Information

| Role              | Member Name    |
| ----------------- | -------------- |
| Backend Developer | Sushant Shinde |
| Backend Developer | Part Patil     |
| Guide / Mentor    | Mahajan Mungal |

---

# 📖 Project Overview

## Description

The **E-Commerce Management System Backend** is a scalable enterprise-level REST API application developed using **Java Spring Boot**. The system manages users, companies, products, categories, orders, payments, shipping, reviews, customer support, and organizational hierarchies.

The application is designed using industry-standard software engineering practices and follows a clean layered architecture for better maintainability, scalability, and code reusability.

---

# 🏗️ System Architecture

```text
Client
   │
   ▼
Controller Layer
   │
   ▼
Service Layer
   │
   ▼
Service Implementation Layer
   │
   ▼
Repository Layer
   │
   ▼
MySQL Database
```

---

# 🚀 Technology Stack

## Backend Technologies

* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate ORM
* REST APIs
* Maven

## Database

* MySQL

## Development Tools

* IntelliJ IDEA
* Eclipse IDE
* Postman
* Git
* GitHub

## Additional Libraries

* Lombok
* Jakarta Persistence API
* Spring Web
* Spring Validation

---

# 📊 Project Statistics

| Component               | Count                                      |
| ----------------------- | ------------------------------------------ |
| Entities                | 31                                         |
| Repositories            | 31                                         |
| Service Interfaces      | 155                                        |
| Service Implementations | 155                                        |
| Controllers             | 31                                         |
| Database Tables         | 33                                         |
| REST APIs               | 100+                                       |
| Relationships           | OneToOne, OneToMany, ManyToOne, ManyToMany |

---

# 🏛️ Layer-Wise Architecture

## 1️⃣ Entity Layer

### Purpose

* Represents database tables
* Uses JPA annotations
* Maintains entity relationships

### Examples

* User
* Product
* Category
* SubCategory
* Order
* Invoice
* Address
* Company

### Common Annotations

```java
@Entity
@Table
@Id
@GeneratedValue
@OneToMany
@ManyToOne
```

---

## 2️⃣ Repository Layer

### Purpose

* Database communication
* CRUD operations
* Query execution

### Example

```java
public interface ProductRepository
extends JpaRepository<Product, Long> {
}
```

### Responsibilities

* Save Data
* Fetch Data
* Update Data
* Delete Data

---

## 3️⃣ Service Layer

### Purpose

Defines business operations and application workflows.

### Common Services

#### Create Service

```java
addData()
```

#### Fetch Service

```java
fetchById()
```

#### Fetch All Service

```java
fetchAll()
```

#### Update Service

```java
updateData()
```

#### Delete Service

```java
deleteById()
```

---

## 4️⃣ Service Implementation Layer

### Purpose

Contains the actual business logic implementation.

### Example

```java
@Service
public class ProductCreateServiceImpl
implements ProductCreateService {

    @Autowired
    private ProductRepository repository;

    @Override
    public Product addData(Product product) {
        return repository.save(product);
    }
}
```

---

## 5️⃣ Controller Layer

### Purpose

* Exposes REST APIs
* Handles HTTP requests
* Returns JSON responses

---

# 🔥 REST API Testing Using Swagger UI

> 📷 Add your Swagger UI Screenshot here

### Features Tested

* POST APIs
* GET APIs
* PUT APIs
* DELETE APIs
* JSON Request Validation
* JSON Response Validation
* API Documentation

---

# 🗄️ Database Modules

The project contains **33 major tables** with interconnected relationships.

---

## Master Data

1. Roles
2. Country
3. Category
4. Company Type
5. Owner
6. Payment Mode

---

## Location Hierarchy

```text
Country
 └── State
      └── District
            └── Taluka
                  └── Town
```

---

## Company Management

```text
Owner
 └── Company
      ├── Manager
      ├── Department
      ├── Employee
      ├── Brand
      └── Address
```

---

## Product Management

```text
Category
 └── SubCategory
      └── Product
           └── ProductReview
```

---

## Customer Management

```text
User
 ├── Feedback
 ├── CustomerQuery
 └── Orders
```

---

## Order Management

```text
Orders
 ├── Card
 ├── UPI
 ├── COD
 ├── Invoice
 ├── Tracking
 └── ShippingDetails
```

---

## Support Management

```text
CustomerQuery
      └── CompanyResponse
```

---

# ⚙️ Core Functionalities

## 👤 User Management

* User Registration
* User Login
* Role Assignment
* Address Management

## 🏢 Company Management

* Company Creation
* Company Type Management
* Department Management
* Employee Management

## 📦 Product Management

* Category Management
* SubCategory Management
* Brand Management
* Product Management
* Product Reviews

## 🛍️ Order Management

* Place Orders
* Payment Processing
* Invoice Generation
* Shipping Management
* Order Tracking

## 🎧 Customer Support

* Feedback Submission
* Customer Queries
* Company Responses

---

# ✨ Key Features

✅ Layered Architecture

✅ RESTful APIs

✅ MySQL Integration

✅ Spring Data JPA

✅ Hibernate ORM

✅ Dependency Injection

✅ Entity Relationships

✅ Modular Service Structure

✅ Scalable Design

✅ Maintainable Codebase

---

# 🔮 Future Enhancements

* Spring Security + JWT Authentication
* Role-Based Access Control (RBAC)
* Email Notifications
* Payment Gateway Integration
* AWS Cloud Deployment
* Docker Containerization
* Microservices Architecture
* Swagger API Documentation Enhancement

---

# 📈 Learning Outcomes

Through this project, the team gained practical experience in:

* Enterprise Backend Development
* REST API Design
* Spring Boot Architecture
* Database Design & Relationships
* Hibernate ORM
* Dependency Injection
* Repository Pattern
* Layered Software Architecture
* Git & GitHub Version Control
* Real-world E-Commerce Workflow Implementation

---

# 🎯 Conclusion

The **E-Commerce Management System Backend** is a comprehensive enterprise-level Spring Boot application designed using industry-standard architecture principles.

The project demonstrates strong expertise in:

* Java 17
* Spring Boot
* REST APIs
* Spring Data JPA
* Hibernate ORM
* MySQL Database Design
* Layered Architecture

With **31 Entities**, **31 Repositories**, **155 Service Interfaces**, **155 Service Implementations**, **31 Controllers**, and **100+ REST APIs**, the system successfully implements a complete E-Commerce workflow ranging from user registration to order tracking and customer support management.

---

## 📜 Internship Acknowledgement

This project was developed as part of the **Symbiosis Powered by Capgemini Internship Program** under the guidance of **Mahajan Mungal**, while pursuing B.Tech in Computer Science & Engineering at **Karmaveer Bhaurao Patil College of Engineering, Satara**.

---

### ⭐ If you found this project useful, don't forget to star the repository!
