# Spring Boot 3 REST Web Application

This is a Spring Boot web application that provides basic authentication and allows authenticated users to query a user's first name based on their phone number.

## Requirements

- Java 17 or higher
- Maven 3.8 or higher
- Spring Boot 3.3.0

## Features

- Basic authentication
- REST endpoint to query user's first name based on phone number
- H2 in-memory database for user data

## Setup

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/spring-boot-3-rest-app-demo.git
cd your-repo
```

### 2. Run the Application Using Visual Studio Code
- Open the project folder in Visual Studio Code.
- Make sure you have the "Spring Boot Extension Pack" installed.
- Open the DemoApplication.java file and click on the Run or Debug icon at the top-right corner of the editor
- Alternatively, open the terminal in Visual Studio Code and run:

```bash
./mvnw spring-boot:run
```
### 3. Access the Application
- The application will be available at: http://localhost:8080
- H2 Console: http://localhost:8080/h2-console
- JDBC URL: jdbc:h2:mem:usersdb
  - Username: sa
  - Password: (leave it blank)


## Enpoints

### 1. User Authentication
- To authenticate, use Basic Authentication with a username and password stored in the H2 database.
- The passwords can be decrypted using the following site: https://bcrypt-generator.com/

### 2. Get User's First Name by Phone Number

- GET `/user/getFirstName/{phoneNumber}`

```
Example URL: http://localhost:8080/user/getFirstName/2122236874  
Response: Uchenna
```