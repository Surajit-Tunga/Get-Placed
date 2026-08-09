# Database:

- A database is a collection of dara in a format that can be easily accessed and can be updated.
- To manage our DB we use DBMS (Database Management System) to perform tusk like Insert, Delete, Update and Read.

## Types of Databases:

- Database is two types: 1. Relational DB , 2. Non-Relational DB.

### 1. Relational Database (RDBMS):

- Data is stored in the form of **tables** (rows and columns).
- Tables can be related to each other using **keys** (Primary Key, Foreign Key).
- Uses **SQL (Structured Query Language)** to store, retrieve, and manage data.
- Suitable for structured data with predefined schemas.

**Examples:** MySQL, PostgreSQL, Oracle Database, Microsoft SQL Server

### 2. Non-Relational Database (NoSQL):

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