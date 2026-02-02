USE college_db;

-- Update student email
UPDATE students
SET email = 'sai_updated@gmail.com'
WHERE id = 1;

-- Delete a student
DELETE FROM students
WHERE id = 2;

-- Verify changes
SELECT * FROM students;
