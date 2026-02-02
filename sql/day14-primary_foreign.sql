CREATE DATABASE company_db;

USE company_db;

CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);

CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES departments(department_id)
);

INSERT INTO departments VALUES
(1, 'IT'),
(2, 'HR');

INSERT INTO employees VALUES
(101, 'Sai', 1),
(102, 'Ravi', 2);

SELECT * FROM departments;
SELECT * FROM employees;
