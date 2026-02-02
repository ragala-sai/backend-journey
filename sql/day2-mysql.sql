-- Day 2: MySQL Basics

CREATE DATABASE college_db;

USE college_db;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(50)
);

INSERT INTO students VALUES
(1, 'Sai', 'sai@gmail.com'),
(2, 'Ravi', 'ravi@gmail.com');

SELECT * FROM students;
