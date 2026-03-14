Spring Boot Online Shopping CRUD

A simple Online Shopping Web Application built using Spring Boot that demonstrates CRUD (Create, Read, Update, Delete) operations for managing products in an online store.

Tech Stack

- Java
- Spring Boot
- Maven
- MySQL
- Spring Data JPA

Features

- Add new products
- View product list
- Update product details
- Delete products
- RESTful API endpoints
- Database integration with MySQL

Project Structure

src/main/java
 ├── controller
 ├── service
 ├── repository
 └── Model

Getting Started

Prerequisites

- Java 17+
- Maven
- MySQL

Setup

1. Clone the repository

git clone https://github.com/yourusername/online-shopping-crud.git

2. Navigate to the project directory

cd springboot-shopping-crud

3. Configure database in "application.properties"

spring.datasource.url=jdbc:mysql://localhost:3306/shopping_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

4. Run the application

./mvnw spring-boot:run

API Example

Create Product

POST /products

Get All Products

GET /products

Update Product

PUT /products/{id}

Delete Product

DELETE /products/{id}

Author

Tvenkatesh006
