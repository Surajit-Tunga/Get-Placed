-- Create a databse for your company named XYZ.
-- 1. Create a table to store employee info(id,name,salary).
-- 2. Add data into DB
-- 3. Select an view all table data 


-- Create DB XYZ and use it.
CREATE DATABASE IF NOT EXISTS XYZ;

USE XYZ;

-- Create a table to store employee info(id,name,salary).
CREATE TABLE EMPLOYEE (
ID INT PRIMARY KEY,
NAME VARCHAR(50),
SALARY INT NOT NULL
);

-- Add data into DB
INSERT INTO EMPLOYEE (ID, NAME, SALARY) VALUES
(1,"SURAJIT", 100000),
(2,"SURAJ", 100000),
(3,"JIT", 100000);

-- Select and view all table data
SELECT * FROM EMPLOYEE;

USE XYZ;

-- Create a table to store job profile info(job_id,job_title).
CREATE TABLE JOB_PROFILE (
JOB_ID INT PRIMARY KEY,
JOB_TITLE VARCHAR(50)
);

-- Add data into JOB_PROFILE table.
INSERT INTO JOB_PROFILE (JOB_ID, JOB_TITLE) VALUES (1, "CEO"), (2,"CTO"), (3, "INTERN");

SELECT * FROM JOB_PROFILE;

-- Add a foreign key constraint to the EMPLOYEE table.
ALTER TABLE EMPLOYEE 
ADD JOB_ID INT,
ADD FOREIGN KEY (JOB_ID) REFERENCES JOB_PROFILE(JOB_ID);

-- Update the EMPLOYEE table to set the JOB_ID for each employee.
UPDATE EMPLOYEE SET JOB_ID = 1 WHERE ID = 1;
UPDATE EMPLOYEE SET JOB_ID = 2 WHERE ID = 2;
UPDATE EMPLOYEE SET JOB_ID = 3 WHERE ID = 3;

SELECT * FROM EMPLOYEE; 
