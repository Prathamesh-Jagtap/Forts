# Spring Boot Web Application

This project is a Spring Boot application with a simple user authentication system. It includes features like user registration and login, with password encryption using `BCryptPasswordEncoder`. The application uses MySQL for data storage and is styled with HTML, CSS and JS for the frontend.

---

# Features

1. **User Registration:**
   - Register a new user with a name, roll number, and password.
   - Passwords are encrypted using `BCryptPasswordEncoder`.

2. **User Authentication:**
   - Login with a username and password.
   - Passwords are validated against the encrypted hash in the database.

3. **Landing Page:**
   - A landing page that displays a popup sign-in form after 3 seconds.

4. **Sign-In and Sign-Up Pages:**
   - User-friendly forms for login and registration.

5. **home Page:**
   - Displays list of Forts of Shri Chhatrapati Shivaji Maharaj on click on drop down button which is in navbar.
   - on Click forts name displays the fort image with information
   

---

## Tech Stack

### Backend
- **Framework:** Spring Boot
- **Database:** MySQL community
- **Security:** Spring Security (for password encryption)
- **ORM:** Hibernate with Spring Data JPA

### Frontend
- **HTML**
- **CSS**
- **JavaScript**

---

## Setup Instructions

### Prerequisites
- Java 17 or higher
- Maven
- MySQL community server
- IDE (IntelliJ, Eclipse)

### Steps to Run the Application

1. **Clone the Repository:**
   ```bash
   git clone <repository-url>
   cd <project-directory>
   ```

2. **Create a MySQL database:**
  ```bash
  CREATE DATABASE Forts_App_DB;
  USE Forts_App_DB;
  ```
3. **Build and Run the application:**
    ```bash
   mvn clean install
   mvn spring-boot:run
   ```
5. **open Browser and hit url http://localhost:8080/ to test the endpoints**
    

