# Introduction to Bitwise Algorithms:

- Bitwise operators are special operators in programming that work directly on binary bits (0 and 1). 
- Since computers store all data in binary form, bitwise operations help us manipulate data at the lowest level using operations like AND, OR, XOR, NOT, and bit shifting.

## Bitwise Operators:

- The main bitwise operators are: AND (&), OR (|), XOR (^), NOT (~), Left Shift (<<), Right Shift (>>).

**Bitwise AND:**

```text
Truth Table:

1 & 1 = 1
1 & 0 = 0
0 & 1 = 0
0 & 0 = 0

Example:

  0101   (5)
& 0011   (3)
------
  0001   (1)
```

**Bitwise OR:**

```text
Truth Table:

1 | 1 = 1

1 | 0 = 1

0 | 1 = 1

0 | 0 = 0

Example:

  0101   (5)
| 0011   (3)
------
  0111   (7)
```

**Bitwise XOR:**

```text
Truth Table:

1 ^ 1 = 0

1 ^ 0 = 1

0 ^ 1 = 1

0 ^ 0 = 0

Example:

  0101   (5)
^ 0011   (3)
------
  0110   (6)
```

**Bitwise NOT:** 

```text
Truth Table:

~1 = 0

~0 = 1

Example:

~ 0101  
------
  1010
```

**Left Shift:**

```text
Example:

  0101   (5)
<< 1
------
  1010   (10)
```

**Right Shift:**

```text
Example:

  1010   (10)
>> 1
------
  0101   (5)
```
---

## Bitwise Operators in JAVA:

| Operator | Name                 | Syntax    | Example    | Output |
| -------- | -------------------- | --------- | ---------- | -----: |
| `&`      | Bitwise AND          | `a & b`   | `5 & 3`    |    `1` |
| `\|`     | Bitwise OR           | `a \| b`  | `5 \| 3`   |    `7` |
| `^`      | Bitwise XOR          | `a ^ b`   | `5 ^ 3`    |    `6` |
| `~`      | Bitwise NOT          | `~a`      | `~5`       |   `-6` |
| `<<`     | Left Shift           | `a << n`  | `5 << 1`   |   `10` |
| `>>`     | Right Shift          | `a >> n`  | `10 >> 1`  |    `5` |
| `>>>`    | Unsigned Right Shift | `a >>> n` | `10 >>> 1` |    `5` |

---

## Problems on Bitwise Algorithm:

### Set a bit in the Number:



