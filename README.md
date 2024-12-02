# Task Management System

## Overview
Task Management System is a microservice-based application designed for efficient task assignment and management. The system includes features for administrators to manage tasks and for users to accept and submit tasks. The application is secure, scalable, and built with modern technologies to provide a seamless user experience.

---

## Features

### **Admin Functions**
- Perform CRUD operations for tasks.
- Assign tasks to students.
- View and manage task submissions.

### **User Functions**
- Accept missions assigned by the admin.
- Submit tasks for review.

### **Authentication and Authorization**
- Secure authentication using **JSON Web Tokens (JWT)**.
- Role-based authorization to control access based on user roles.

### **Account Registration**
- User registration functionality with email option.

### **Microservice Architecture**
- Utilized microservices to separate functionalities for improved scalability and maintainability.

### **Service Discovery and Load Balancing**
- Managed with **Eureka** for efficient service routing.

### **Routing**
- Implemented routing through **Spring Cloud Gateway**.

### **Responsive User Interface**
- Developed a modern, responsive frontend using:
  - **ReactJS**
  - **TailwindCSS**
  - **Material UI (MUI)**
  - **Redux** for state management.

---

## Technologies Used

### **Backend**
- **Languages:** Java
- **Frameworks:** Spring Boot, Spring Security
- **APIs:** RESTful APIs
- **Authentication:** JWT
- **Database:** MySQL
- **Service Discovery and Routing:** Eureka, Spring Cloud Gateway

### **Frontend**
- **Languages:** JavaScript
- **Libraries and Tools:** ReactJS, TailwindCSS, MUI, Redux

---

## Installation and Setup

### Prerequisites
1. **Backend:**
   - Java 17+
   - Maven
   - MySQL database

2. **Frontend:**
   - Node.js
   - npm/yarn

---

### Backend Setup
1. Clone the backend repository:  
   ```bash
   git clone <Backend Repository Link>
   cd backend
2. Configure the database in application.properties
3. Run the application:
   ```bash
   mvn spring-boot:run
### Frontend Setup
1. Clone the frontend repository:
   ```bash
   git clone https://github.com/leduc432003/TaskManagementFrontend.git
   cd frontend
3. Install dependencies:
   ```bash
   npm install
5. Start the development server:
   ```bash
   npm start

## Project Structure
### Microservices
1. User Service: Manages user accounts and roles.
2. Task Service: Handles CRUD operations for tasks.
3. Submission Service: Tracks task submissions.
4. Gateway Service: Routes and load balances requests.
5. Eureka Server: Service discovery.
