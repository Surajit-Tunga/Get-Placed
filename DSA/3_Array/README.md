# Array & Matrix

## Introduction:
- An array is a collection of items of the same variable type.
- Here items stored at contiguous memory locations & can be accessed randomly.

### Array Terminologies:

- **Array Element:** These are the items stored in an array.
- **Array Index:** Elements are accessed by there indexes. For most of the programming languages array index start from `0`.

### Memory representation of Array:

```text
Memory Address
      ↓
+---------+---------+---------+---------+---------+
|   10    |   20    |   30    |   40    |   50    |
+---------+---------+---------+---------+---------+
| Index 0 | Index 1 | Index 2 | Index 3 | Index 4 |
+---------+---------+---------+---------+---------+
 1000      1004      1008      1012      1016
```

### Declaration of Array: JAVA

```java
// This array will store integer type element
int arr[];     

// This array will store char type element
char arr[];   

// This array will store float type element
float arr[];
```

### Initialization of Array: JAVA

```java
int arr[] = { 1, 2, 3, 4, 5 };
char arr[] = { 'a', 'b', 'c', 'd', 'e' };
float arr[] = { 1.4f, 2.0f, 24f, 5.0f, 0.0f };
```

### Types of Array: 

```text
                           Types of Arrays
                                 │
          ┌──────────────────────┴──────────────────────┐
          │                                             │
   On the Basis of Size                     On the Basis of Dimensions
          │                                             │
     ┌────┴────┐                              ┌──────────┴──────────┐
     │         │                              │                     │
 Fixed Size  Dynamic Size             One-Dimensional       Multi-Dimensional
                                                                    │
                                                         ┌──────────┴──────────┐
                                                         │          │          │
                                                      2D Array  3D Array... ..nD Array
```

#### Examples (JAVA):

**1. Fixed Size Array**

- Memory is allocated once during declaration.
- The size **cannot be increased or decreased** after creation.

```java
int[] arr = new int[5];

arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
arr[3] = 40;
arr[4] = 50;
```

```text
+----+----+----+----+----+
| 10 | 20 | 30 | 40 | 50 |
+----+----+----+----+----+
  0    1    2    3    4
```

**2. Dynamic Array**

- Size can **grow or shrink** during execution.
- Internally allocates a larger array when capacity is full.
- Java provides `ArrayList` as a dynamic array.

```java
import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
```

```text
Capacity = 5

+----+----+----+----+----+
| 10 | 20 | 30 | 40 | 50 |
+----+----+----+----+----+

After adding another element...

Capacity = 10 (Resized)

+----+----+----+----+----+----+----+----+----+----+
| 10 | 20 | 30 | 40 | 50 | 60 |    |    |    |    |
+----+----+----+----+----+----+----+----+----+----+
```

**3. One-Dimensional (1D) Array**

```java
int[] arr = {10, 20, 30, 40, 50};
```

```text
Index →   0    1    2    3    4
         +----+----+----+----+----+
Array →  | 10 | 20 | 30 | 40 | 50 |
         +----+----+----+----+----+
```

**4. Two-Dimensional (2D) Array**

- Stores elements in **rows and columns** and is accessed using **row** and **column** indices.

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

```text
          Column
            0    1    2
         +----+----+----+
Row 0    |  1 |  2 |  3 |
         +----+----+----+
Row 1    |  4 |  5 |  6 |
         +----+----+----+
Row 2    |  7 |  8 |  9 |
         +----+----+----+
```

---