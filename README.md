# backend-journey

my java + spring boot learning journey

# Backend Journey



Day 1:

\- Installed JDK 17

\- Installed IntelliJ IDEA

\- Created GitHub account

\- Installed Git

\- First GitHub commit

## Day 1 – Commands Used



\### Java Verification

java -version



\### Navigation

cd OneDrive

cd Desktop

cd backend-journey



\### Git Commands

git clone https://github.com/ragala-sai/backend-journey.git

git status

git add README.md

git commit -m "DAY 1 : Environment setup completed"

git push



\### Git Configuration

git config --global user.email "222015654+ragala-sai@users.noreply.github.com"

git config --global user.name "ragala-sai"

git config --global --list



\### Commit Fix

git commit --amend --reset-author

git push



## Day 3 – Git Commands Used



git status

git add .

git commit -m "Day 3: added dummy Java project"

git push



\## Day 4 – Java Commands Used



javac Student.java

java Student



\## Day 5 – Core Java (Methods \& Static)



\### Topics Covered

\- Methods

\- Parameters

\- Return types

\- static keyword

\- Why main() is static



\### Practice File

\- core-java/Day5Methods.java



\## Day 6 – Constructors \& Method Overloading



\### Topics Covered

\- Constructor basics

\- Default constructor

\- Parameterized constructor

\- Constructor rules

\- Constructor overloading

\- Method overloading



\### Key Learnings

\- Constructor has the same name as the class

\- Constructor has no return type

\- Constructor is called automatically when object is created

\- Constructors can be overloaded

\- Method overloading depends on method parameters, not return type



\### Practice File

\- core-java/Day6Constructors.java

## Day 7 – Inheritance, Method Overriding \& Polymorphism (Core Java)



\### Topics Covered

\- Inheritance in Java

\- Method Overriding

\- `super` keyword

\- Runtime Polymorphism

\- Parent reference holding Child object



\### Key Concepts Learned



\- Java does \*\*not support multiple inheritance\*\* using classes to avoid ambiguity.

\- \*\*Method Overriding\*\* allows a child class to provide its own implementation of a parent method.

\- Method call is decided at \*\*runtime\*\* based on the object type.

\- `super` keyword is used to access parent class methods and variables.

\- Using `super.methodName()` allows executing \*\*both parent and child logic\*\*.



\### Example

```java

Parent obj = new Child();

obj.show(); // Calls Child's show() at runtime

## Day 8 – Abstraction & Interfaces

### Topics Learned
- Abstraction in Java
- Abstract classes
- Interfaces
- Runtime Polymorphism
- instanceof keyword

### Key Points
- Abstract classes cannot be instantiated
- Interfaces support multiple inheritance
- Runtime polymorphism uses method overriding
- instanceof checks object type at runtime

## Day 9 – Exception Handling

### Topics Learned
- What is exception
- Types of errors
- try-catch-finally
- Multiple catch blocks
- throw vs throws

### Key Points
- try contains risky code
- catch handles exception
- finally always executes
- throw is used to create exception manually
- throws declares exception to caller

## Day 10 – Collections (List & Map)

### Topics Learned
- Java Collections Framework
- List (ArrayList)
- Map (HashMap)

### Key Points
- List allows duplicates and maintains order
- Map stores key–value pairs
- HashMap keys are unique

## Day 11 – Streams & Lambda

### Topics Learned
- Lambda expressions
- Java Streams
- filter, map, forEach

### Key Points
- Lambda reduces boilerplate code
- Streams work on collections
- Streams do not modify original data


## Day 12 – Mini Project (Advanced Student Management)

### Project Description
Enhanced console-based student management system using Core Java.

### Features
- Add, view, search, delete students
- Stream-based search
- Exception handling for user input

### Concepts Used
- ArrayList
- Streams & Optional
- Lambda expressions
- Exception handling

## Day 13 – SQL UPDATE & DELETE

- Used UPDATE to modify records
- Used DELETE to remove records
- Learned importance of WHERE clause

## Day 14 – Primary Key & Foreign Key (SQL)

### Topics Covered
- Primary Key
- Foreign Key
- Table relationships
- Referential integrity

### Concepts
- **Primary Key** uniquely identifies a row and cannot be NULL or duplicate.
- **Foreign Key** creates a relationship between two tables and enforces valid data.

### Tables Practiced
- `departments` (Primary Key: department_id)
- `employees` (Foreign Key: department_id → departments.department_id)

### Key Learning
- Parent table data must exist before inserting into child table.
- Invalid foreign key insertion results in an error.
- Used heavily in real-world databases and Spring Boot applications.

## Day 15 – SQL JOINs

### Topics Covered
- INNER JOIN
- LEFT JOIN
- RIGHT JOIN
- FULL JOIN (using UNION)

### Key Learning
- JOINs combine data from multiple tables.
- INNER JOIN returns only matching records.
- LEFT JOIN keeps all left table rows.
- FULL JOIN is not directly supported in MySQL.

## Day 16 – HTML Basics

### Topics Covered
- HTML structure
- Head and Body tags
- Input elements

### Key Learning
- HTML defines structure of web pages.
- Input elements collect user data.
- HTML runs directly in the browser.

## Day 17 – HTML Forms

### Topics Covered
- Form tag
- GET vs POST
- Input names
- Buttons

### Key Learning
- Forms send data to backend.
- POST is preferred for sensitive data.
- name attribute is mandatory.

## Day 18 – HTML Tables & Form Flow

### Topics Covered
- HTML tables
- Table rows and headers
- Form submission flow

### Key Learning
- Tables display data.
- Forms send data to backend.
- HTML connects frontend to Spring Boot.

## Day 19 – Introduction to Spring Boot

### Topics Covered
- What is Spring Boot
- Problems with traditional Spring
- Auto configuration
- Embedded server

### Key Learning
- Spring Boot simplifies backend development.
- It eliminates XML and manual configuration.
- Embedded Tomcat removes server setup.

## Day 20 – Spring Boot Project Setup

### Spring Boot Project Creation
- Created Spring Boot project using IntelliJ IDEA
- Used Spring Initializr (start.spring.io)
- Selected:
  - Java
  - Maven
  - Spring Boot 3.5.x
  - Packaging: Jar
  - Java version: 17

### Project Details Used
Group: com.sai  
Artifact: studentapi  
Name: student-api  
Package: com.sai.studentapi

### Dependencies Added
- Spring Web
- Spring Data JPA
- Spring Boot DevTools

### First Run
Ran StudentApiApplication.java  
Embedded Tomcat server started on port 8080

### Temporary Fix Applied
Disabled datasource auto configuration (DB not configured yet):

application.properties:
spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration

### Concepts Learned
- What is Spring Boot
- Spring Initializr
- Maven project structure
- Embedded Tomcat
- application.properties role
- Auto-configuration concept






