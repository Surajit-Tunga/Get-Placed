# SQL using MySQL

**Tutorial:** [Apna College](https://youtu.be/hlGoQC332VM?si=COu2ve4DKUbd61C_)

## Database:

- A database is a collection of dara in a format that can be easily accessed and can be updated.
- To manage our DB we use DBMS (Database Management System) to perform tusk like Insert, Delete, Update and Read.

### Types of Databases:

- Database is two types: 1. Relational DB , 2. Non-Relational DB.

#### 1. Relational Database (RDBMS):

- Data is stored in the form of **tables** (rows and columns).
- Tables can be related to each other using **keys** (Primary Key, Foreign Key).
- Uses **SQL (Structured Query Language)** to store, retrieve, and manage data.
- Suitable for structured data with predefined schemas.

**Examples:** MySQL, PostgreSQL, Oracle Database, Microsoft SQL Server

#### 2. Non-Relational Database (NoSQL):

- Data is **not stored only in tables**. It can be stored as **documents, key-value pairs, graphs, or column families**.
- Designed to handle unstructured or semi-structured data.
- Provides high scalability and flexibility.

**Examples:** MongoDB, Redis

---

## SQL: 

- SQL stands for Structured Query Language.
- SQL was originally developed at **IBM** in the early 1970s by **Donald D. Chamberlin** and **Raymond F. Boyce**.
- It was initially called **SEQUEL (Structured English Query Language)**.
- Due to a trademark issue, the name was later changed to **SQL (Structured Query Language)**.
- It is a programming Language used to interact with relational databases
- It is used to perform CURD (Create, Read, Update, Delete) Operations.

--- 

## MySQL Installation: 

**Step 1:** 

- Go to [MySQL](https://www.mysql.com/)
- Click **Downloads**.
- Scroll down and click **MySQL Community (GPL) Downloads**.
- Click **MySQL Installer for Windows**.
- Download the installer as per your system.

**Step 2:** Run the downloaded installer.

**Step 3:** Select **Full** setup type.

**Step 4:** Click **Next** then **Execute** ×2 to download and install the required components.

**Step 5:** Click **Next** ×4.

**Step 6:** Create a **root password**. 

**Step 7:**  then click **Next** x3.

**Step 8:** Click **Execute**, then **Next**, and  **Finish**.

**Setp 9:** Connect to server: Give pass word next-> execute->Finish.

**Step 10:** Finaly Next and Finsish.

**Step 11:** Open MySQL Workbench, click on the "+" icon and create new connection.  Now click on that connection to wirte MySQL codes.

---

## Database Structure:

- In MySQL or RDBMS data is stored in form of table (one or multiple).

- A **Table** is the basic unit of a relational database. It stores related data in the form of **rows** and **columns**.

### Example: `Students` Table

| StudentID | Name   | Age | Department |
|-----------|--------|-----|------------|
| 101       | Rahul  | 20  | CSE        |
| 102       | Priya  | 21  | ECE        |
| 103       | Aman   | 19  | IT         |

### Components of a Table

#### 1. Column (Field / Attribute)
- A **Column** represents a specific property of the data.
- Each column stores one type of information.

**Example:** `StudentID`, `Name`, `Age`, `Department`

#### 2. Row (Record / Tuple)
- A **Row** represents one complete record in the table.

**Example:**

| StudentID | Name  | Age | Department |
|-----------|-------|-----|------------|
| 101       | Rahul | 20  | CSE        |

#### 3. Cell
- A **Cell** is the intersection of a row and a column.
- It stores a single value.

**Examples:**
- `Rahul` → Cell in the **Name** column.
- `20` → Cell in the **Age** column.

---

## Creating our First Database:

- Open connection in MySQL workbench write code in the "query" tab. 

**To create a database:**

```sql
CREATE DATABASE DB_NAME;
```
**To delete a database:**

```sql
DROP DATABASE DB_NAME;
```

### Create a Table:

**Select the database first:**

```sql
USE DB_NAME;
```
**Syntax to Create a Table:**

```sql
CREATE TABLE TABLE_NAME (
    COL_NAME1 DATATYPE CONSTRAINT,
    COL_NAME2 DATATYPE CONSTRAINT,
    COL_NAME3 DATATYPE CONSTRAINT,
)
```
**Example: STUDENT Table in COLLAGE DB:** 

```sql
CREATE DATABASE COLLAGE;

USE COLLAGE;

CREATE TABLE STUDENT (
ID INT PRIMARY KEY,
NAME VARCHAR(50),
AGE INT NOT NULL
);
```

---

## SQL Datatypes:

- It defines the type of values that can be stored in a column.

| Data Type | Description | Example Usage |
|-----------|-------------|---------------|
| `CHAR` | Fixed-length string (0–255 characters). | `CHAR(50)` |
| `VARCHAR` | Variable-length string (0–255 characters). | `VARCHAR(50)` |
| `BLOB` | Binary Large Object, stores binary data (up to 65,535 bytes). | `BLOB(1000)` |
| `INT` | Integer value (`-2,147,483,648` to `2,147,483,647`). | `INT` |
| `TINYINT` | Small integer (`-128` to `127`). | `TINYINT` |
| `BIGINT` | Large integer (`-9,223,372,036,854,775,808` to `9,223,372,036,854,775,807`). | `BIGINT` |
| `BIT` | Stores bit values (`1` to `64` bits). | `BIT(2)` |
| `FLOAT` | Decimal number with precision up to **23 digits**. | `FLOAT` |
| `DOUBLE` | Decimal number with precision from **24 to 53 digits**. | `DOUBLE` |
| `BOOLEAN` | Stores boolean values (`0` or `1`, `FALSE` or `TRUE`). | `BOOLEAN` |
| `DATE` | Stores dates in `YYYY-MM-DD` format (`1000-01-01` to `9999-12-31`). | `DATE` |
| `YEAR` | Stores a 4-digit year (`1901` to `2155`). | `YEAR` |

> **Note:** `CHAR(N)` always reserves space for **N characters**, regardless of the input length, whereas `VARCHAR(N)` can store up to **N characters** but uses space only for the actual input.

> **Note:** `BIT(1)` stores **1 bit** (0 or 1), while `BIT(2)` stores **2 bits**, allowing values from `00` to `11` (0 to 3).


> **Note:** `SIGNED` allows both **negative and positive** values (e.g., `-128` to `127` for `TINYINT`), whereas `UNSIGNED` allows **only positive** values (including `0`), increasing the maximum positive range (e.g., `0` to `255`).

---

## SQL Commands: 

| Category | Full Form | Purpose | Commands |
|----------|-----------|---------|----------|
| **DDL** | Data Definition Language | Defines and modifies the database structure. | `CREATE`, `ALTER`, `DROP`, `TRUNCATE`, `RENAME` |
| **DML** | Data Manipulation Language | Inserts, updates, and deletes data in tables. | `INSERT`, `UPDATE`, `DELETE` |
| **DQL** | Data Query Language | Retrieves data from the database. | `SELECT` |
| **DCL** | Data Control Language | Controls user access and permissions. | `GRANT`, `REVOKE` |
| **TCL** | Transaction Control Language | Manages database transactions. | `COMMIT`, `ROLLBACK`, `SAVEPOINT` |

---

## Database Commands:

| Command | Description | Syntax / Example |
|---------|-------------|------------------|
| `CREATE DATABASE` | Creates a new database. | `CREATE DATABASE DB_NAME;` |
| `CREATE DATABASE IF NOT EXISTS` | Creates a database only if it does not already exist. | `CREATE DATABASE IF NOT EXISTS DB_NAME;` |
| `DROP DATABASE` | Deletes an existing database. | `DROP DATABASE DB_NAME;` |
| `DROP DATABASE IF EXISTS` | Deletes the database only if it exists. | `DROP DATABASE IF EXISTS DB_NAME;` |
| `SHOW DATABASES` | Displays all databases in the MySQL server. | `SHOW DATABASES;` |
| `USE` | Selects a database to work with. | `USE DB_NAME;` |
| `SHOW TABLES` | Displays all tables in the currently selected database. | `SHOW TABLES;` |

**Example:**

```sql
-- Create a new database
CREATE DATABASE CollegeDB;

-- Create the database only if it does not exist
CREATE DATABASE IF NOT EXISTS CollegeDB;

-- Display all databases
SHOW DATABASES;

-- Select the database
USE CollegeDB;

-- Display all tables in the selected database
SHOW TABLES;

-- Delete the database
DROP DATABASE CollegeDB;

-- Delete the database only if it exists
DROP DATABASE IF EXISTS CollegeDB;
```

---

## Table Commands:


| Command | Description | Syntax |
|---------|-------------|--------|
| `CREATE TABLE` | Creates a new table. | `CREATE TABLE TABLE_NAME ( COLUMN_NAME1 DATATYPE CONSTRAINT, COLUMN_NAME2 DATATYPE CONSTRAINT, ... );` |
| `DROP TABLE` | Deletes an existing table. | `DROP TABLE TABLE_NAME;` |
| `DROP TABLE IF EXISTS` | Deletes a table only if it exists. | `DROP TABLE IF EXISTS TABLE_NAME;` |
| `TRUNCATE TABLE` | Removes all rows from a table while keeping its structure. | `TRUNCATE TABLE TABLE_NAME;` |
| `ALTER TABLE` | Modifies the structure of an existing table. | `ALTER TABLE TABLE_NAME ADD / MODIFY / DROP COLUMN ...;` |
| `RENAME TABLE` | Renames an existing table. | `RENAME TABLE OLD_TABLE_NAME TO NEW_TABLE_NAME;` |
| `DESCRIBE` / `DESC` | Displays the structure of a table. | `DESC TABLE_NAME;` or `DESCRIBE TABLE_NAME;` |
| `SHOW TABLES` | Displays all tables in the selected database. | `SHOW TABLES;` |

> Alter is used to make changes in the Schema.

**Example:**

```sql
-- Select the database
USE CollegeDB;

-- Create a new table
CREATE TABLE Student (
    StudentID INT PRIMARY KEY,
    Name VARCHAR(100),
    Age INT,
    Department VARCHAR(50)
);

-- Display all tables
SHOW TABLES;

-- Display the structure of the table
DESC Student;
-- or
DESCRIBE Student;

-- Rename the table
RENAME TABLE Student TO Students;

-- Add a new column
ALTER TABLE Students
ADD Email VARCHAR(100);

-- Modify an existing column
ALTER TABLE Students
MODIFY Name VARCHAR(150);

-- Rename a Column name
ALTER TABLE Students
RENAME COLUMN Name TO StudentName;

-- Drop a column
ALTER TABLE Students
DROP COLUMN Email;

-- Remove all records but keep the table structure
TRUNCATE TABLE Students;

-- Delete the table
DROP TABLE Students;



-- Delete the table only if it exists
DROP TABLE IF EXISTS Students;
```

**Use of `SELECT` in Table:**

```sql
-- Display all records from the table
SELECT * FROM Students;

-- Display specific columns
SELECT StudentID, Name FROM Students;

-- Display students from a specific department
SELECT * FROM Students
WHERE Department = 'CSE';

-- Display students older than 20
SELECT * FROM Students
WHERE Age > 20;
```

**DML Commands in Table:**

```sql
-- Select the database
USE CollegeDB;

-- Create the Students table
CREATE TABLE Students (
    StudentID INT PRIMARY KEY,
    Name VARCHAR(100),
    Age INT,
    Department VARCHAR(50)
);

-- INSERT (Add Records)
INSERT INTO Students (StudentID, Name, Age, Department)
VALUES
(101, 'Rahul', 20, 'CSE'),
(102, 'Priya', 21, 'ECE'),
(103, 'Aman', 19, 'IT');

-- SELECT (Read Records)
SELECT * FROM Students;

-- UPDATE (Modify Records)
UPDATE Students
SET Age = 22
WHERE StudentID = 102;

-- DELETE (Remove Records)
DELETE FROM Students
WHERE StudentID = 103;

-- Display the final table
SELECT * FROM Students;
```

### Practice Question_1:

```text
Create a databse for your company named XYZ.
1. Create a table to store employee info(id,name,salary).
2. Add data into DB
3. Select an view all table data
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
```
> Table, Database names are case sensitive. 

--- 

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

## Joins in SQL:

- Join is used to combine rows from two or more table based on a related column between them. 

### Types of Join:

| JOIN Type | Description |
|---|---|
| `INNER JOIN` | Returns only the rows that have matching values in both tables. |
| `LEFT JOIN` | Returns all rows from the left table and matching rows from the right table. |
| `RIGHT JOIN` | Returns all rows from the right table and matching rows from the left table. |
| `FULL OUTER JOIN` | Returns all rows from both tables, whether they match or not. |
| `CROSS JOIN` | Returns every possible combination of rows from both tables. |
| `SELF JOIN` | Joins a table with itself. |

**Example**

```sql
-- Crate two tables

CREATE TABLE STUDENT (
    ID INT PRIMARY KEY,
    NAME VARCHAR(50),
    DEPT_ID INT
);

CREATE TABLE DEPARTMENT (
    ID INT PRIMARY KEY,
    NAME VARCHAR(50)
);

INSERT INTO STUDENT VALUES
(1, 'Rahul', 1),
(2, 'Priya', 2),
(3, 'Amit', 1),
(4, 'Rohan', 3);

INSERT INTO DEPARTMENT VALUES
(1, 'CSE'),
(2, 'ECE'),
(4, 'ME');
```
Tables Before JOIN: 

```text
STUDENT

ID	NAME	DEPT_ID
1	Rahul	1
2	Priya	2
3	Amit	1
4	Rohan	3

DEPARTMENT

ID	NAME
1	CSE
2	ECE
4	ME
```

1. **Inner join:**
```sql
SELECT STUDENT.NAME, DEPARTMENT.NAME AS DEPARTMENT
FROM STUDENT
INNER JOIN DEPARTMENT
ON STUDENT.DEPT_ID = DEPARTMENT.ID;
```
Output:

| STUDENT | DEPARTMENT |
| ------- | ---------- |
| Rahul   | CSE        |
| Priya   | ECE        |
| Amit    | CSE        |

2. **Left Join:**
```sql
SELECT STUDENT.NAME, DEPARTMENT.NAME AS DEPARTMENT
FROM STUDENT
LEFT JOIN DEPARTMENT
ON STUDENT.DEPT_ID = DEPARTMENT.ID;
```
Output:

| STUDENT | DEPARTMENT |
| ------- | ---------- |
| Rahul   | CSE        |
| Priya   | ECE        |
| Amit    | CSE        |
| Rohan   | NULL       |

3. **Right Join:**
```sql
SELECT STUDENT.NAME, DEPARTMENT.NAME AS DEPARTMENT
FROM STUDENT
RIGHT JOIN DEPARTMENT
ON STUDENT.DEPT_ID = DEPARTMENT.ID;
```
Output:

| STUDENT | DEPARTMENT |
| ------- | ---------- |
| Rahul   | CSE        |
| Priya   | ECE        |
| Amit    | CSE        |
| NULL    | ME         |

4. **FULL OUTER JOIN:**
- MySQL does not directly support `FULL OUTER JOIN`. Use `LEFT JOIN` + `RIGHT JOIN` with `UNION`.

```sql
SELECT STUDENT.NAME, DEPARTMENT.NAME AS DEPARTMENT
FROM STUDENT
LEFT JOIN DEPARTMENT
ON STUDENT.DEPT_ID = DEPARTMENT.ID

UNION

SELECT STUDENT.NAME, DEPARTMENT.NAME AS DEPARTMENT
FROM STUDENT
RIGHT JOIN DEPARTMENT
ON STUDENT.DEPT_ID = DEPARTMENT.ID;
```
Output:

| STUDENT | DEPARTMENT |
| ------- | ---------- |
| Rahul   | CSE        |
| Priya   | ECE        |
| Amit    | CSE        |
| Rohan   | NULL       |
| NULL    | ME         |

5. **Cross Join:**
```sql
SELECT STUDENT.NAME, DEPARTMENT.NAME AS DEPARTMENT
FROM STUDENT
CROSS JOIN DEPARTMENT;
```
Output:

| STUDENT | DEPARTMENT |
| ------- | ---------- |
| Rahul   | CSE        |
| Rahul   | ECE        |
| Rahul   | ME         |
| Priya   | CSE        |
| Priya   | ECE        |
| Priya   | ME         |
| Amit    | CSE        |
| Amit    | ECE        |
| Amit    | ME         |
| Rohan   | CSE        |
| Rohan   | ECE        |
| Rohan   | ME         |

6. **Self Join:**
```sql
SELECT A.NAME AS STUDENT_1, B.NAME AS STUDENT_2
FROM STUDENT A
JOIN STUDENT B
ON A.DEPT_ID = B.DEPT_ID
AND A.ID < B.ID;
```
Output:

| STUDENT_1 | STUDENT_2 |
| --------- | --------- |
| Rahul     | Amit      |

### UNION:

- `UNION` is used to combine the reult-set of of two or more `SELECT` statements.

**Syntex:**
```sql
SELECT COL FROM TABLE_A
UNION
SELECT COL FROM TABLE_B;
```
---

## SQL Sub Queries:

- A Subquery or Inner query or a Nested query is a query within another SQL query

### Example:

**Q. Find students whose age is greater than the average age of all students.**

```sql
SELECT NAME, AGE
FROM STUDENT
WHERE AGE > (
    SELECT AVG(AGE)
    FROM STUDENT
);
```

1. Inner query → SELECT AVG(AGE) FROM STUDENT
                 ↓
2. Gets the average age
                 ↓
3. Outer query → finds students whose AGE is greater than that average

**Q. Find max marks of their department ECE.**

```sql
SELECT MAX(MARKS) FROM (
SELECT * FROM STUDENT WHERE DEPT = "ECE") AS TEMP;
```
> A subquery used in FROM must have an alias such as AS `TEMP`.

---

## MySQL Views:

- A view is a virtual table based on the result-set of an statement.
- Helps in access management.

```sql
CREATE VIEW VIEW1 AS SELECT ID, NAME FROM STUDENT;

SELECT * FROM VIEW1;
```

---

<!-- ## After It — To Do:

- [ ] ACID Properties
- [ ] Transactions (`COMMIT`, `ROLLBACK`, `SAVEPOINT`)
- [ ] Normalization (1NF, 2NF, 3NF, BCNF)
- [ ] Functional Dependency
- [ ] ER Model & ER Diagrams
- [ ] Indexing
- [ ] Concurrency Control
- [ ] Serializability
- [ ] Deadlocks
- [ ] `CASE`
- [ ] `EXISTS` & Correlated Subqueries
- [ ] CTE (`WITH`)
- [ ] Window Functions
- [ ] String Functions
- [ ] Date/Time Functions
- [ ] Numeric Functions
- [ ] Query Optimization & `EXPLAIN`
- [ ] Stored Procedures
- [ ] Triggers
- [ ] Database Security & Privileges
- [ ] Distributed Databases — Basics -->