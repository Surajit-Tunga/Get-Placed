# KEYS, CONSTRAINTS & CLAUSES:

## Keys:

- Keys in SQL are attributes/columns used to uniquely identify records and establish relationships between tables.

### Primary Key:

- It is a unique id.
- It is a column or set of columns in a table that uniquely identifies each row.
- There can be only 1 Primary key and it should not be null.
- Eg. `Employee_id`, `Roll_Num`.

**Example:**

```sql
CREATE TABLE Employee (
    Employee_ID INT PRIMARY KEY,
    Name VARCHAR(50),
    Department VARCHAR(50),
    Salary INT
);

INSERT INTO Employee (Employee_ID, Name, Department, Salary)
VALUES
(101, 'Rahul', 'IT', 50000),
(102, 'Amit', 'HR', 45000),
(103, 'Priya', 'Finance', 55000);
```

| Employee_ID (Primary Key) | Name  | Department | Salary |
| ------------------------: | ----- | ---------- | -----: |
|                       101 | Rahul | IT         |  50000 |
|                       102 | Amit  | HR         |  45000 |
|                       103 | Priya | Finance    |  55000 |

> Here, `Employee_ID` is the **Primary Key** because every employee has a unique `Employee_ID`, and it cannot be `NULL`.

For example, this is **not allowed**:

```sql
INSERT INTO Employee (Employee_ID, Name, Department, Salary)
VALUES (101, 'John', 'IT', 40000);
```

Because `Employee_ID = 101` already exists.

**Example with two column combined as PK:**

```SQL
CREATE TABLE ENROLLMENT (
    STUDENT_ID INT,
    COURSE_ID INT,
    MARKS INT,
    PRIMARY KEY (STUDENT_ID, COURSE_ID)
);
```

### Foreign Key:

- A foreign key is a coloumn or a set of column in a table that refers to the primary key of another table.
- There can be multiple Foreign Keys.
- Foreign Keys can have duplicate & null values.

**Example:**

Here, `Department_ID` in the `Employee` table is a **Foreign Key** that refers to `Department_ID` (Primary Key) in the `Department` table.

```sql
CREATE TABLE Department (
    Department_ID INT PRIMARY KEY,
    Department_Name VARCHAR(50)
);

CREATE TABLE Employee (
    Employee_ID INT PRIMARY KEY,
    Name VARCHAR(50),
    Department_ID INT,
    FOREIGN KEY (Department_ID) REFERENCES Department(Department_ID)
);
```

Department Table:

| Department_ID (Primary Key) | Department_Name |
| --------------------------: | --------------- |
|                           1 | IT              |
|                           2 | HR              |
|                           3 | Finance         |

Employee Table:

| Employee_ID (Primary Key) | Name  | Department_ID (Foreign Key) |
| ------------------------: | ----- | --------------------------: |
|                       101 | Rahul |                           1 |
|                       102 | Amit  |                           1 |
|                       103 | Priya |                           2 |
|                       104 | John  |                        NULL |

Here, `Department_ID` in the **Employee** table is a Foreign Key.

* `1` appears multiple times → **Duplicate values are allowed**.
* `NULL` is allowed → **unless `NOT NULL` is specified**.
* `Department_ID = 1` refers to the `IT` department in the `Department` table.
* `Department_ID = 2` refers to the `HR` department.

The Foreign Key also prevents inserting a value that does not exist in the referenced table:

```sql
INSERT INTO Employee (Employee_ID, Name, Department_ID)
VALUES (105, 'Sam', 10);
```

❌ This will fail because `Department_ID = 10` does not exist in the `Department` table.

> **Note:** There are several other types of keys in SQL, such as **Unique Key, Candidate Key, Super Key, Alternate Key, and Composite Key**.

#### Cascading on FK:

- `On Delete Cascade` When we create a FK with this option, it deletes the referencing rows in the child table when referenced is Deleted in the parent table which has a primary key.
- `On Update Cascade` When we create a FK with this option, it Updates the referencing rows in the child table when referenced is Updated in the parent table which has a primary key.

Example:

```sql
CREATE TABLE DEPARTMENT (
    ID INT PRIMARY KEY,
    NAME VARCHAR(50)
);

CREATE TABLE STUDENT (
    ID INT PRIMARY KEY,
    NAME VARCHAR(50),
    DEPT_ID INT,
    FOREIGN KEY (DEPT_ID)
        REFERENCES DEPARTMENT(ID)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);
```

### Practice Question_2:

```text
Continue after Practice set 1.
1. Add a new table JOB_Profile with JOB_ID and JOB_NAME.
2. JOB_ID is Primary key Here and Make it Foreign Key in the Previous Employee Table.
3. Update Null Values in the Employee Table.
```
**Solution:**

```sql
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
```

---

## Constraints in SQL:

- SQL constraints are used to specify rules for dara in a table.

| Constraint       | Description                                               | Example                                          |
| ---------------- | --------------------------------------------------------- | ------------------------------------------------ |
| `NOT NULL`       | Prevents `NULL` values                                    | `Name VARCHAR(50) NOT NULL`                      |
| `UNIQUE`         | Ensures all values are unique                             | `Email VARCHAR(100) UNIQUE`                      |
| `PRIMARY KEY`    | Uniquely identifies each row                              | `ID INT PRIMARY KEY`                             |
| `FOREIGN KEY`    | Links two tables and maintains referential integrity      | `FOREIGN KEY (DeptID) REFERENCES Department(ID)` |
| `CHECK`          | Ensures values satisfy a condition                        | `Age INT CHECK (Age >= 18)`                      |
| `DEFAULT`        | Assigns a value when none is provided                     | `Country VARCHAR(50) DEFAULT 'India'`            |
| `AUTO_INCREMENT` | Automatically generates sequential numeric values (MySQL) | `ID INT AUTO_INCREMENT`                          |

### Practice Question_3:

```text
Create a database named `CollegeDB` and create the following tables.

1. STUDENT Table

Create a `STUDENT` table with:

- `StudentID` → automatically generated and primary key
- `Name` → cannot be `NULL`
- `Age` → must be `18` or above
- `Country` → default value should be `'India'`
- `DepartmentID` → foreign key referencing `DEPARTMENT`

2. DEPARTMENT Table

Create a `DEPARTMENT` table with:

- `DepartmentID` → primary key
- `DepartmentName` → cannot be `NULL` and must be unique

3. Insert Data

Insert at least **5 students** belonging to different departments.

Make sure:

- At least one student uses the default `Country`.
- `StudentID` is generated automatically.

```

**Solution:**

```sql
--  CREATE & USE DATABASE COLLAGEDB
CREATE DATABASE IF NOT EXISTS COLLAGEDB;
USE COLLAGEDB;

-- CREATE DEPT TABLE

CREATE TABLE DEPERTMENT (
ID INT PRIMARY KEY,
NAME VARCHAR(50) NOT NULL
);

-- CREATE STUDENT TABLE
CREATE TABLE STUDENT (
STUDENT_ID INT AUTO_INCREMENT PRIMARY KEY,
NAME VARCHAR(50) NOT NULL,
AGE INT CHECK(AGE>=18),
COUNTRY VARCHAR(50) DEFAULT 'INDIA',
DEPT_ID INT,
FOREIGN KEY (DEPT_ID) REFERENCES DEPERTMENT (ID)
);

-- INSERT DATA
INSERT INTO DEPERTMENT (ID, NAME) VALUES 
(1, 'ECE'), (2, 'CSE'), (3, 'EE');
INSERT INTO STUDENT (NAME, AGE, COUNTRY, DEPT_ID) VALUES 
('Rahul', 20, 'INDIA', 1),
('Priya', 21, 'INDIA', 2),
('Amit', 19, 'INDIA', 3),
('Sneha', 22, 'INDIA', 1),
('Arjun', 20, 'INDIA', 2),
('Ananya', 19, 'INDIA', 3),
('Rohan', 23, 'INDIA', 1),
('Kavya', 21, 'INDIA', 2),
('Vikram', 22, 'INDIA', 3),
('Neha', 20, 'INDIA', 1);

-- DEFAULT INDIA

INSERT INTO STUDENT (NAME, AGE, DEPT_ID) VALUES 
('SURAJIT', 21, 1);

-- VIEW ALL DATA

SELECT * FROM STUDENT;
SELECT * FROM DEPERTMENT;
```
---

## SELECT Statement & Clauses:

| Syntax / Term | Type | Description | Example |
|---|---|---|---|
| `SELECT` | Clause | Retrieves data from a table | `SELECT NAME FROM STUDENT;` |
| `*` | Operator / Wildcard | Selects all columns | `SELECT * FROM STUDENT;` |
| `FROM` | Clause | Specifies the table to retrieve data from | `SELECT * FROM STUDENT;` |
| `DISTINCT` | Keyword | Removes duplicate values from the result | `SELECT DISTINCT DEPT_ID FROM STUDENT;` |
| `AS` | Keyword / Alias | Gives a temporary alias to a column/table | `SELECT NAME AS STUDENT_NAME FROM STUDENT;` |
| `WHERE` | Clause | Filters rows based on a condition | `SELECT * FROM STUDENT WHERE AGE > 20;` |
| `AND` | Logical Operator | All conditions must be true | `WHERE AGE > 18 AND DEPT_ID = 1` |
| `OR` | Logical Operator | At least one condition must be true | `WHERE DEPT_ID = 1 OR DEPT_ID = 2` |
| `NOT` | Logical Operator | Reverses a condition | `WHERE NOT DEPT_ID = 1` |
| `IN` | Comparison Operator | Matches any value in a list | `WHERE DEPT_ID IN (1, 2, 3)` |
| `NOT IN` | Comparison Operator | Excludes values in a list | `WHERE DEPT_ID NOT IN (1, 2)` |
| `BETWEEN` | Comparison Operator | Checks whether a value is within a range (inclusive) | `WHERE AGE BETWEEN 18 AND 25` |
| `NOT BETWEEN` | Comparison Operator | Checks whether a value is outside a range | `WHERE AGE NOT BETWEEN 18 AND 25` |
| `LIKE` | Pattern Matching Operator | Searches for a pattern | `WHERE NAME LIKE 'A%'` |
| `NOT LIKE` | Pattern Matching Operator | Excludes a pattern | `WHERE NAME NOT LIKE 'A%'` |
| `%` | Wildcard | Represents zero or more characters with `LIKE` | `LIKE 'A%'` |
| `_` | Wildcard | Represents exactly one character with `LIKE` | `LIKE '_A%'` |
| `IS NULL` | NULL Operator | Checks for `NULL` values | `WHERE COUNTRY IS NULL` |
| `IS NOT NULL` | NULL Operator | Checks for non-`NULL` values | `WHERE COUNTRY IS NOT NULL` |
| `=` | Comparison Operator | Checks equality | `WHERE AGE = 20` |
| `!=` / `<>` | Comparison Operator | Checks inequality | `WHERE AGE != 20` |
| `>` | Comparison Operator | Greater than | `WHERE AGE > 20` |
| `<` | Comparison Operator | Less than | `WHERE AGE < 20` |
| `>=` | Comparison Operator | Greater than or equal to | `WHERE AGE >= 20` |
| `<=` | Comparison Operator | Less than or equal to | `WHERE AGE <= 20` |
| `ORDER BY` | Clause | Sorts the result | `ORDER BY AGE` |
| `ASC` | Keyword | Sorts in ascending order | `ORDER BY AGE ASC` |
| `DESC` | Keyword | Sorts in descending order | `ORDER BY AGE DESC` |
| `LIMIT` | Clause | Restricts the number of rows returned | `LIMIT 5` |
| `OFFSET` | Clause | Skips a specified number of rows | `LIMIT 5 OFFSET 10` |
| `GROUP BY` | Clause | Groups rows having the same values | `GROUP BY DEPT_ID` |
| `HAVING` | Clause | Filters grouped results | `HAVING COUNT(*) > 2` |
| `COUNT()` | Aggregate Function | Counts rows or non-NULL values | `SELECT COUNT(*) FROM STUDENT;` |
| `SUM()` | Aggregate Function | Calculates the total | `SELECT SUM(MARKS) FROM STUDENT;` |
| `AVG()` | Aggregate Function | Calculates the average | `SELECT AVG(AGE) FROM STUDENT;` |
| `MIN()` | Aggregate Function | Finds the minimum value | `SELECT MIN(AGE) FROM STUDENT;` |
| `MAX()` | Aggregate Function | Finds the maximum value | `SELECT MAX(AGE) FROM STUDENT;` |

**General Order to Write:**

```text
`SELECT` → `FROM` → `WHERE` → `GROUP BY` → `HAVING` → `ORDER BY` → `LIMIT` → `OFFSET`
```
Example:

```sql
SELECT DEPT_ID, AVG(AGE) AS AVG_AGE
FROM STUDENT
WHERE AGE >= 18
GROUP BY DEPT_ID
HAVING AVG(AGE) > 20
ORDER BY AVG_AGE DESC
LIMIT 3
OFFSET 1;
```
--- 