SELECT emp.emp_id, emp.emp_name, dept.department_name
FROM employees emp
INNER JOIN departments dept
ON emp.department_id = dept.department_id;
SELECT emp.emp_name, dept.department_name
FROM employees emp
LEFT JOIN departments dept
ON emp.department_id = dept.department_id;
SELECT emp.emp_name, dept.department_name
FROM employees emp
RIGHT JOIN departments dept
ON emp.department_id = dept.department_id;
SELECT emp.emp_name, dept.department_name
FROM employees emp
LEFT JOIN departments dept
ON emp.department_id = dept.department_id
UNION
SELECT emp.emp_name, dept.department_name
FROM employees emp
RIGHT JOIN departments dept
ON emp.department_id = dept.department_id;
