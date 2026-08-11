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

### Accessing an Array: JAVA

```java
// 1D Array
arrayName[index];

// 2D Array
arrayName[row][column];
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

## Operations on Array:

- Array operations are the basic actions performed on an array to store, access, modify, organize, and manage its elements.

### Traversal in Array: 

- To visit all elements of an array to perform some operations.
- Types: Two type: 1. Linear Traversal (tarting from the first element and moving to the last element.) 2. Reverse Traversal (tarting from the last element and moving towards the first element.)

**Example Program JAVA:**

```java
public class Main {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int n = arr.length; //5

        // To Print all Elements

        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
    }
}
```
**Output:**

```
12345
```
**Complexity Analysis:**

| Operation | Complexity |
|-----------|------------|
| **Time Complexity** | **O(n)** |
| **Space Complexity** | **O(1)** |

- The loop visits each of the `n` elements exactly **once**, so the time complexity is `O(n)`.
- No extra data structure is used; only the loop variable `i` and `n` are stored, so the auxiliary space complexity is `O(1)`.

**Using While Loop:**

```java
public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int i = 0;

        while (i<n){
            System.out.print(arr[i]);
            i++;
        }
    }
}
```

**Using ForEach Loop:**

```java
public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        
        for (int value: arr){
            System.out.print(value);
        }
    }
}
```

**Problem: Sum of Elements:**

```java
public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int sum =0;
        
        for(int i =0; i<n; i++) {
            sum+= arr[i];
        }
        System.out.print("Sum of Elements:" + sum);
    }
}
```
**Output:**

```text
Sum of Elements:15
```
**Complexity Analysis:**

| Complexity | Value |
|------------|-------|
| **Time Complexity** | **O(n)** |
| **Space Complexity** | **O(1)** |

- **Time Complexity:** `O(n)` because the loop traverses all `n` elements of the array exactly once.
- **Space Complexity:** `O(1)` because only a constant amount of extra memory (`sum`, `n`, and `i`) is used.

---

### Insertions:

- Adding a new element to the array.

#### Insert Element at the Beginning of an Array:

- Given an array of integers, the task is to insert an element at the beginning of the array.
```text
Input: arr[] = [10, 20, 30, 40], ele = 50
Output: [50, 10, 20, 30, 40]
```
**Program:**

```java
public class Main{
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,0};
        int n = arr.length -1;
        int ele = 50;

        System.out.println("Before Insertion");
        for (int i = 0; i<n; i++){
            System.out.println(arr[i] + " ");
        }

        System.out.println("After Insertion");
        // Step 1: Shift all elements to the right.
        for (int i = n-1; i >= 0; i--) {
            arr[i+1]=arr[i];
        }
        // Step 2: Insert new element.
        arr[0] = ele;

        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

    }
}
```

**Output:**

```text 
Before Insertion
10 
20 
30 
40 
After Insertion
50 
10 
20 
30 
40 
```

**Complexity Analysis:**

| Operation | Complexity |
|-----------|------------|
| **Time Complexity** | **O(n)** |
| **Space Complexity** | **O(1)** |

- **Time Complexity:** `O(n)`
  - Printing the array before insertion takes **O(n)**.
  - Shifting all elements to the right takes **O(n)**.
  - Printing the array after insertion takes **O(n)**.
  - Therefore, the total time complexity is **O(n + n + n) = O(3n) = O(n)**.

- **Space Complexity:** `O(1)`
  - Only a constant amount of extra memory (`n` and loop variable `i`) is used.
  - No additional array or data structure is created.

---

#### Insert Element at a Given Position in an Array:

- Given an array of integers, the task is to insert an element at a given position in the array.
```text
Input: arr[] = [10, 20, 30, 40], pos = 2, ele = 50
Output: [10, 50, 20, 30, 40]
```

**Program:**

```java
public class Main{
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,0};
        int n = arr.length -1;
        int pos = 2;
        int index = pos-1;
        int ele = 50;

        System.out.println("Before Insertion");
        for (int i = 0; i<n; i++){
            System.out.println(arr[i] + " ");
        }

        System.out.println("After Insertion");
        // Step 1: Shift all elements to the right.
        for (int i = n-1; i >= index; i--) {
            arr[i+1]=arr[i];
        }
        // Step 2: Insert new element.
        arr[index] = ele;

        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

    }
}
```

**Output:**

```text
Before Insertion
10 
20 
30 
40  
After Insertion
10 
50 
20 
30 
40  
```

**Complexity Analysis:**

| Operation | Complexity |
|-----------|------------|
| **Time Complexity** | **O(n)** |
| **Space Complexity** | **O(1)** |

---

#### Insert Element at the End of an Array:

- Given an array of integers, the task is to insert an element at the end of the array.
```text
Input: arr[] = [10, 20, 30, 40], ele = 50
Output: [10, 20, 30, 40, 50]
```

**Program:**

```java
public class Main{
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,0};
        int n = arr.length -1;
        int ele = 50;
       
        System.out.println("Before Insertion");
        for (int i = 0; i<n; i++){
            System.out.println(arr[i] + " ");
        }

        System.out.println("After Insertion");

        arr[n] = ele;

        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

    }
}
```

**Output:**

```text
Before Insertion
10 
20 
30 
40 
After Insertion
10 
20 
30 
40 
50
```

**Complexity Analysis:**

| Operation | Complexity |
|-----------|------------|
| **Time Complexity** | **O(1)** |
| **Space Complexity** | **O(1)** |

---

### Deletion:

- Deleting an element from the array.

#### Delete an Element from the Beginning of an Array:

- Given an array of integers, the task is to delete an element from the beginning of the array.
```text
Input: arr[] = [10, 20, 30, 40]
Output: [20, 30, 40]

Input: arr[] = [20]
Output: []
```

**Program:**

```java
public class Main{
    public static void main(String[] args){
        int arr[] = {10,20,30,40};
        int n = arr.length;
               
        System.out.println("Before Deletion");
        for (int i = 0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
        
        for (int i = 0; i<n-1; i++){
            arr[i]=arr[i+1];
        }

        n--;
        System.out.println("After Deletion");
        for (int i = 0; i<n; i++){
            System.out.println(arr[i] + " ");
        }

    }
}
```

**Output:**

```
Before Deletion
10 
20 
30 
40 
After Deletion
20 
30 
40 
```

**Complexity Analysis:**

| Operation | Complexity |
|-----------|------------|
| **Time Complexity** | **O(n)** |
| **Space Complexity** | **O(1)** |

#### Delete an Element from a Given Position in an Array:
- Given an array of integers, the task is to delete an element from a given position in the array.
```text
Input: arr[] = [10, 20, 30, 40], pos = 1
Output: [20, 30, 40]

Input: arr[] = [10, 20, 30, 40], pos = 2
Output: [10, 30, 40]

Input: arr[] = [10, 20, 30, 40], pos = 4
Output: [10, 20, 30]
```

**Program:**

```java
public class Main{
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50,60};
        int n = arr.length;
        int pos = 3;
        int index = pos-1;
               
        System.out.println("Before Deletion");
        for (int i = 0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
        
        for (int i = index; i<n-1; i++){
            arr[i]=arr[i+1];
        }

        n--;
        System.out.println("After Deletion");
        for (int i = 0; i<n; i++){
            System.out.println(arr[i] + " ");
        }

    }
}
```

**Output:**

```
Before Deletion
10 
20 
30 
40 
50 
60 
After Deletion
10 
20 
40 
50 
60 
```

**Complexity Analysis:**

| Operation | Complexity |
|-----------|------------|
| **Time Complexity** | **O(n)** |
| **Space Complexity** | **O(1)** |

#### Delete First Occurrence of Given Element from an Array:
- Given an array of integers, the task is to delete a given element from the array. If there are multiple occurrences of the element, we need to remove only its first occurrence.
```text
Input: arr[] = [10, 20, 30, 40], ele = 20
Output: [10, 30, 40]

Input: arr[] = [10, 20, 30, 40], ele = 25
Output: [10, 20, 30, 40]

Input: arr[] = [10, 20, 20, 20 30], ele = 20
Output: [10, 20, 20, 30]
```

**Program:**

```java
public class Main{
    public static void main(String[] args){
        int arr[] = {10,20,30,40,30,60};
        int n = arr.length;
        int ele = 30;
        int index = -1;
               
        System.out.println("Before Deletion");
        for (int i = 0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
        for (int i = 0; i<n; i++){
            if(arr[i]==ele){
                index = i;
                break;
            }
        }       
        
        if (index != -1) {
            for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
        }

        System.out.println("After Deletion");
        for (int i = 0; i<n; i++){
            System.out.println(arr[i] + " ");
        }

    }
}
```

**Output:**

```text
Before Deletion
10 
20 
30 
40 
30 
60 
After Deletion
10 
20 
40 
30 
60 
```
**Complexity Analysis:**

```
| Operation | Complexity |
|-----------|------------|
| **Time Complexity** | **O(n)** |
| **Space Complexity** | **O(1)** |
```

#### Remove All Occurrences of an Element & give final num of elements after deletion in an Array:
- Given an integer array arr[] and an integer ele the task is to the remove all occurrences of ele from arr[] in-place and return the number of elements which are not equal to ele. If there are k number of elements which are not equal to ele then the input array arr[] should be modified such that the first k elements should contain the elements which are not equal to ele and then the remaining elements.

```text 
Input: arr[] = [3, 2, 2, 3], ele = 3
Output: 2
Explanation: The answer is 2 because there are 2 elements which are not equal to 3 and arr[] will be modified such that the first 2 elements contain the elements which are not equal to 3 and remaining elements can contain any element. So, modified arr[] = [2, 2, _, _]

Input: arr[] = [0, 1, 3, 0, 2, 2, 4, 2], ele = 2
Output: 5
Explanation: The answer is 5 because there are 5 elements which are not equal to 2 and arr[] will be modified such that the first 5 elements contain the elements which are not equal to 2 and remaining elements can contain any element. So, modified arr[] = [0, 1, 3, 0, 4, _, _, _]
```

**Program:**

```java
public class Main{
    public static void main(String[] args){
        int arr[] = {10,20,30,40,30,60};
        int n = arr.length;
        int ele = 30;
        int index = 0;
               
        System.out.println("Before Deletion");
        for (int i = 0; i<n; i++){
            System.out.println(arr[i] + " ");
        }

        for (int i = 0; i<n; i++){
            if (arr[i]!=ele){
                arr[index] = arr[i];
                index++;
            }
        }  

        n = index;

        System.out.println("Num of Element:" + n);    
        
        
        System.out.println("After Deletion");
        for (int i = 0; i<n; i++){
            System.out.println(arr[i] + " ");
        }

    }
}
```

**Output:**

```text
Before Deletion
10 
20 
30 
40 
30 
60 
Num of Element:4
After Deletion
10 
20 
40 
60  
```
**Complexity Analysis:**

```
| Operation | Complexity |
|-----------|------------|
| **Time Complexity** | **O(n)** |
| **Space Complexity** | **O(1)** |
```

#### Delete an Element from the end of an array
- Given an array of integers, the task is to delete an element from the end of the array.
```text
Input: arr[] = [10, 20, 30, 40]
Output: [10, 20, 30]

Input: arr[] = [20]
Output: []
```

**Program:**
```java
public class Main{
    public static void main(String[] args){
        int arr[] = {10,20,30,40};
        int n = arr.length;
               
        System.out.println("Before Deletion");
        for (int i = 0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
        
        n--;
        System.out.println("After Deletion");
        for (int i = 0; i<n; i++){
            System.out.println(arr[i] + " ");
        }

    }
}
```
**Output:**
```text
Before Deletion
10 
20 
30 
40 
After Deletion
10 
20 
30 
```

**Complexity Analysis:**

| Operation | Complexity |
|-----------|------------|
| **Time Complexity** | **O(1)** |
| **Space Complexity** | **O(1)** |

> Program Time Complexity: O(n), because the program contains two O(n) printing loops.
> Deletion Operation Complexity: O(1), because deleting from the end only requires n--.

--- 