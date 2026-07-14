# COMPLEXITY ANALYSIS

- Analysis of Algorithms is a fundamental aspect of computer science that involves evaluating performance of algorithms and programs. Efficiency is measured in terms of time and space.

## Why Analysis is Important?

- Algorithm analysis is an important part of computational complexity theory, which provides theoretical estimation for the required resources of an algorithm to solve a specific computational problem. Analysis of algorithms is the determination of the amount of time and space resources required to execute it.

  - To predict the behavior of an algorithm for large inputs (Scalable Software).
  - It is much more convenient to have simple measures for the efficiency of an algorithm than to implement the algorithm and test the efficiency every time a certain parameter in the underlying computer system changes.
  - More importantly, by analyzing different algorithms, we can compare them to determine the best one for our purpose.

---

##  Asymptotic Analysis:

- Asymptotic analysis evaluates an algorithm’s performance based on input size, ignoring actual running time. It measures the order of growth of time or space; for example, linear search grows linearly, while binary search grows logarithmically.

- **Why Use It?**
- Compare algorithms fairly.
- Independent of hardware.
- Predict performance for large inputs.
- Select the most efficient algorithm.

---

## Asymptotic Notations:

- **Big O Notation (O):** Represents the **Upper Bound (Worst Case)**. It describes the maximum time an algorithm can take.

- Example:

```
Linear Search

1 2 3 4 5 6 7 8 9
                ↑
            Search 9

O(n)
```

- **Big Omega Notation (Ω):** Represents the **Lower Bound (Best Case)**. It describes the minimum time an algorithm can take.

- Example:

```
Linear Search

1 2 3 4 5

↑
Search 1

Ω(1)
```
- **C. Big Theta Notation (Θ):** Represents the **Tight Bound (Average/Exact Case)**. It describes the exact asymptotic growth when the upper and lower bounds are the same.

- Example:

```java
for(int i = 0; i < n; i++) {
    System.out.println(i);
}
```

```
Θ(n)
```

### Difference Between O, Ω and Θ

| Notation | Meaning | Represents |
|----------|----------|------------|
| **O(f(n))** | Upper Bound | Worst Case |
| **Ω(f(n))** | Lower Bound | Best Case |
| **Θ(f(n))** | Tight Bound | Exact Growth |

---

## Time Complexity

- **Time Complexity** is the amount of time an algorithm takes to execute as a function of the input size (**n**).
- It does **not** measure the actual execution time in seconds. Instead, it measures how the running time **grows** as the input size increases.
- Time complexity is expressed using **Asymptotic Notations** such as **Big O (O)**, **Big Omega (Ω)**, and **Big Theta (Θ)**.

- **Common Time Complexities:**

| Complexity | Name | Example |
|------------|------|---------|
| **O(1)** | Constant | Array Access |
| **O(log n)** | Logarithmic | Binary Search |
| **O(n)** | Linear | Linear Search |
| **O(n log n)** | Linearithmic | Merge Sort, Heap Sort |
| **O(n²)** | Quadratic | Bubble Sort |
| **O(n³)** | Cubic | Triple Nested Loops |
| **O(2ⁿ)** | Exponential | Recursive Fibonacci |
| **O(n!)** | Factorial | Generate All Permutations |

- Examples:

#### O(1)

```java
int x = arr[5];
```

#### O(n)

```java
for(int i = 0; i < n; i++) {
    System.out.println(arr[i]);
}
```

#### O(n²)

```java
for(int i = 0; i < n; i++) {
    for(int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}
```

---

## Space Complexity

- **Space Complexity** is the total amount of memory required by an algorithm during execution as a function of the input size (**n**).
- It includes:
  - **Input Space** – Memory required to store the input.
  - **Auxiliary Space** – Extra memory used by the algorithm (temporary variables, arrays, recursion stack, etc.).

> **Space Complexity = Input Space + Auxiliary Space**

- **Examples:**

#### O(1) Space

```java
int sum = 0;

for(int i = 0; i < n; i++)
    sum += arr[i];
```

Uses only one extra variable.

**Space Complexity:** `O(1)`

---

#### O(n) Space

```java
int[] temp = new int[n];
```

Creates an additional array of size **n**.

**Space Complexity:** `O(n)`

---

#### O(n) Recursive Space

```java
void print(int n){
    if(n == 0)
        return;

    print(n - 1);
}
```

The recursion stack stores **n** function calls.

**Space Complexity:** `O(n)`

---

## Order of Growth

- **Order of Growth** describes how an algorithm's time or space complexity increases as the input size (**n**) grows.
- It focuses only on the **dominant term**, ignoring constants and lower-order terms.
- Algorithms with a lower order of growth are generally more efficient for large inputs.

### Growth Order (Best → Worst)

```
O(1)
   ↓
O(log n)
   ↓
O(n)
   ↓
O(n log n)
   ↓
O(n²)
   ↓
O(n³)
   ↓
O(2ⁿ)
   ↓
O(n!)
```

- Examples:

| Algorithm | Order of Growth | Growth Type |
|-----------|-----------------|-------------|
| Array Access | **O(1)** | Constant |
| Binary Search | **O(log n)** | Logarithmic |
| Linear Search | **O(n)** | Linear |
| Merge Sort | **O(n log n)** | Linearithmic |
| Bubble Sort | **O(n²)** | Quadratic |
| Matrix Multiplication (Naive) | **O(n³)** | Cubic |
| Recursive Fibonacci | **O(2ⁿ)** | Exponential |
| Generate Permutations | **O(n!)** | Factorial |

---

## Example: Understanding Time Complexity, Space Complexity & Order of Growth

- Consider the following Java program:

```java
public class Example {

    public static void printArray(int[] arr) {

        int sum = 0;                  // (1)

        for (int i = 0; i < arr.length; i++) {   // (2)
            sum += arr[i];            // (3)
        }

        System.out.println(sum);      // (4)
    }

}
```

Suppose:

```
n = arr.length
```

---

### Step 1: Time Complexity

Count how many times each statement executes.

| Statement | Executions |
|-----------|------------|
| `int sum = 0;` | 1 |
| `for` loop initialization | 1 |
| Loop condition (`i < n`) | n + 1 |
| `sum += arr[i]` | n |
| `i++` | n |
| `println()` | 1 |

Total operations:

```
T(n) = 1 + 1 + (n + 1) + n + n + 1

T(n) = 3n + 4
```

Ignore constants and lower-order terms:

```
Time Complexity = O(n)
```

**Reason:** The loop runs **n** times.

---

### Step 2: Space Complexity

Extra memory used by the algorithm:

```java
int sum;
int i;
```

Only two integer variables are created.

No extra array or list is allocated.

```
Space Complexity = O(1)
```

This is called **Constant Space**.

---

### Step 3: Order of Growth

Order of Growth tells us how the algorithm grows as **n** increases.

From the time complexity:

```
T(n) = 3n + 4
```

Ignore:

- Constant `3`
- Constant `4`

Keep only the dominant term:

```
n
```

Therefore,

```
Order of Growth = O(n)
```

As the input doubles, the running time roughly doubles.

---

### Final Analysis

| Metric | Result | Reason |
|--------|--------|--------|
| Time Complexity | **O(n)** | One loop runs n times |
| Space Complexity | **O(1)** | Only two extra variables |
| Order of Growth | **Linear (O(n))** | Running time increases linearly with n |

---

- Another Example:

```java
public class Example {

    public static void printPairs(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                System.out.println(arr[i] + " " + arr[j]);

            }
        }

    }

}
```

### Time Complexity

Outer loop

```
n
```

Inner loop

```
n
```

Total operations

```
T(n)=n × n
```

```
Time Complexity = O(n²)
```

---

### Space Complexity

Only variables:

```java
int i;
int j;
```

```
Space Complexity = O(1)
```

---

### Order of Growth

```
T(n)=n²
```

Dominant term:

```
n²
```

```
Order of Growth = O(n²)
```

---

### Key Difference

| Concept | What it Measures |
|---------|------------------|
| **Time Complexity** | How execution time grows with input size |
| **Space Complexity** | How memory usage grows with input size |
| **Order of Growth** | The dominant growth rate (Big O) of time or space after ignoring constants and lower-order terms |

> **Remember:** In most DSA questions, **Order of Growth** and **Time Complexity** are effectively the same because both are expressed using the dominant Big O term.

---

## Optimization and Order of Growth

- In Data Structures and Algorithms (DSA), an **optimized algorithm** is one that uses **less execution time**, **less memory**, or both.
- Companies generally prefer solutions with a **lower time complexity** because they perform better for large inputs.
- A **better (lower) Order of Growth** usually means the algorithm is **more optimized**.

> **Note:** A lower order of growth generally indicates a more optimized algorithm for large inputs. However, an algorithm may trade time for memory (or vice versa), so both **Time Complexity** and **Space Complexity** should be considered.

---

- **Example 1: Linear Search vs Binary Search**

### Linear Search

```java
public static int linearSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == key)
            return i;
    }
    return -1;
}
```

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`
- **Order of Growth:** Linear

---

### Binary Search (Sorted Array)

```java
public static int binarySearch(int[] arr, int key) {

    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {

        int mid = (low + high) / 2;

        if (arr[mid] == key)
            return mid;

        if (arr[mid] < key)
            low = mid + 1;
        else
            high = mid - 1;
    }

    return -1;
}
```

- **Time Complexity:** `O(log n)`
- **Space Complexity:** `O(1)`
- **Order of Growth:** Logarithmic

### Which is Better?

| Algorithm | Time | Space | Growth Type |
|-----------|------|-------|-------------|
| Linear Search | O(n) | O(1) | Linear |
| Binary Search | O(log n) | O(1) | Logarithmic |

✅ **Binary Search is more optimized** because `O(log n)` grows much slower than `O(n)`.

---

- **Example 2: Sum of First n Numbers**

### Method 1 (Using Loop)

```java
int sum = 0;

for (int i = 1; i <= n; i++) {
    sum += i;
}
```

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---

### Method 2 (Using Formula)

```java
int sum = n * (n + 1) / 2;
```

- **Time Complexity:** `O(1)`
- **Space Complexity:** `O(1)`

### Which is Better?

| Method | Time | Space | Growth Type |
|--------|------|-------|-------------|
| Loop | O(n) | O(1) | Linear |
| Formula | O(1) | O(1) | Constant |

✅ **Formula method is more optimized** because it executes in constant time.

---

## What Companies Prefer

If two programs produce the same correct output:

| Option 1 | Option 2 | Preferred |
|----------|----------|-----------|
| O(n²) | O(n log n) | ✅ O(n log n) |
| O(n) | O(log n) | ✅ O(log n) |
| O(n) | O(1) | ✅ O(1) |

> **Notes**
> - Lower **Time Complexity** → Faster algorithm.
> - Lower **Space Complexity** → Uses less memory.
> - Lower **Order of Growth** → Better scalability for larger inputs.
> - In general, **a lower Order of Growth indicates a more optimized algorithm**.

---
