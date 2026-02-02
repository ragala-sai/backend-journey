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







