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

-- Modify the table (Add a new column)
ALTER TABLE Students
ADD Email VARCHAR(100);

-- Modify the table (Modify an existing column)
ALTER TABLE Students
MODIFY Name VARCHAR(150);

-- Rename a Column name
ALTER TABLE Students
RENAME COLUMN Name TO StudentName;

-- Drop a column
ALTER TABLE Students
DROP COLUMN Email;

--add a column
ALTER TABLE Students
ADD COLUMN Email VARCHAR(100);

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

--- 

