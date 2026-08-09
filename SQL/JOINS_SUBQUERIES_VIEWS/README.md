# JOINS, SUBQUERIES & VIEWS:

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