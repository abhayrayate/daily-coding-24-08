# DataJPA-One-To-Many-App

This is a Spring Boot application demonstrating **One-to-Many relationship** using **Spring Data JPA** and **Oracle Database**. The project shows how to perform basic **CRUD operations** with JPA entities and their relationships.

## Features

- Spring Boot application with JPA and Hibernate
- One-to-Many relationship between `Employee` and `Address`
- CRUD operations:
  - Insert Employee with multiple Addresses
  - Delete Employee (cascade delete on related addresses)
  - Retrieve Employee and associated Addresses
- Oracle Database integration
- Console-friendly output for entity data

## Technologies Used

- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- Hibernate ORM
- Oracle Database
- Maven
- Lombok (optional for getters/setters)

## Entity Structure

### Employee

| Field      | Type    | Description                  |
|------------|---------|------------------------------|
| empId      | Integer | Primary Key                  |
| empName    | String  | Employee Name                |
| empSalary  | Double  | Employee Salary              |
| addr       | List<Address> | One-to-Many relationship |

### Address

| Field    | Type    | Description                  |
|----------|---------|------------------------------|
| addId    | Integer | Primary Key                  |
| city     | String  | City Name                    |
| state    | String  | State Name                   |
| country  | String  | Country Name                 |
| emp      | Employee | Many-to-One relationship to Employee |

---

## Database Configuration

Configure Oracle database connection in `application.yml`:

```yaml
spring:
  application:
    name: 14-DataJPA-One-To-Many-App
  datasource:
    url: jdbc:oracle:thin:@localhost:1521:orcl
    username: system
    password: tiger
    driver-class-name: oracle.jdbc.OracleDriver
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
