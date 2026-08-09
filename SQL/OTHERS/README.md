# 5. OTHER QUERIES:

| Type | Syntax / Term | Use | Syntax / Example |
|---|---|---|---|
| Conditional | `CASE` | Returns a value based on conditions | `CASE WHEN condition THEN result ELSE result END` |
| Conditional | `IF()` | Returns one of two values based on a condition | `IF(condition, value_if_true, value_if_false)` |
| NULL Handling | `IFNULL()` | Replaces `NULL` with another value | `IFNULL(value, replacement)` |
| NULL Handling | `COALESCE()` | Returns the first non-NULL value | `COALESCE(value1, value2, ...)` |
| Subquery | `EXISTS` | Checks whether a subquery returns any row | `WHERE EXISTS (SUBQUERY)` |
| Subquery | `NOT EXISTS` | Checks whether a subquery returns no rows | `WHERE NOT EXISTS (SUBQUERY)` |
| Subquery | Correlated Subquery | Subquery depends on the outer query | `WHERE COL OPERATOR (SUBQUERY)` |
| String Function | `CONCAT()` | Combines strings | `CONCAT(str1, str2, ...)` |
| String Function | `UPPER()` | Converts text to uppercase | `UPPER(str)` |
| String Function | `LOWER()` | Converts text to lowercase | `LOWER(str)` |
| String Function | `LENGTH()` | Returns string length | `LENGTH(str)` |
| String Function | `SUBSTRING()` | Extracts part of a string | `SUBSTRING(str, start, length)` |
| String Function | `TRIM()` | Removes leading/trailing spaces | `TRIM(str)` |
| String Function | `REPLACE()` | Replaces part of a string | `REPLACE(str, old, new)` |
| String Function | `LEFT()` | Returns characters from the left | `LEFT(str, n)` |
| String Function | `RIGHT()` | Returns characters from the right | `RIGHT(str, n)` |
| Date/Time Function | `NOW()` | Returns current date and time | `NOW()` |
| Date/Time Function | `CURDATE()` | Returns current date | `CURDATE()` |
| Date/Time Function | `CURTIME()` | Returns current time | `CURTIME()` |
| Date/Time Function | `YEAR()` | Extracts year from a date | `YEAR(date)` |
| Date/Time Function | `MONTH()` | Extracts month from a date | `MONTH(date)` |
| Date/Time Function | `DAY()` | Extracts day from a date | `DAY(date)` |
| Date/Time Function | `DATEDIFF()` | Finds difference between two dates | `DATEDIFF(date1, date2)` |
| Date/Time Function | `DATE_ADD()` | Adds time to a date | `DATE_ADD(date, INTERVAL value unit)` |
| Date/Time Function | `DATE_SUB()` | Subtracts time from a date | `DATE_SUB(date, INTERVAL value unit)` |
| Numeric Function | `ROUND()` | Rounds a number | `ROUND(number, decimals)` |
| Numeric Function | `CEIL()` | Rounds a number upward | `CEIL(number)` |
| Numeric Function | `FLOOR()` | Rounds a number downward | `FLOOR(number)` |
| Numeric Function | `ABS()` | Returns absolute value | `ABS(number)` |
| Numeric Function | `MOD()` | Returns remainder | `MOD(number, divisor)` |
| Numeric Function | `POWER()` | Calculates power | `POWER(number, power)` |
| Numeric Function | `SQRT()` | Calculates square root | `SQRT(number)` |
| Set Operator | `UNION` | Combines result sets and removes duplicates | `QUERY1 UNION QUERY2` |
| Set Operator | `UNION ALL` | Combines result sets including duplicates | `QUERY1 UNION ALL QUERY2` |
| CTE | `WITH` | Creates a temporary named result for a query | `WITH TEMP AS (SUBQUERY) SELECT ...` |
| Window Function | `ROW_NUMBER()` | Gives a unique number to each row | `ROW_NUMBER() OVER (...)` |
| Window Function | `RANK()` | Gives ranking with gaps | `RANK() OVER (...)` |
| Window Function | `DENSE_RANK()` | Gives ranking without gaps | `DENSE_RANK() OVER (...)` |
| Window Function | `LAG()` | Gets a value from the previous row | `LAG(COL) OVER (...)` |
| Window Function | `LEAD()` | Gets a value from the next row | `LEAD(COL) OVER (...)` |
| Window | `OVER()` | Defines the window for a window function | `FUNCTION() OVER (...)` |
| Window | `PARTITION BY` | Divides rows into groups for window functions | `OVER (PARTITION BY COL)` |
| Alias | `AS` | Gives a temporary name to a column/table | `COL AS ALIAS` |