# Factorial of a Number:

Given a non-negative integers n, compute the factorial of the given number. Factorial of n is defined as n * (n -1) * (n - 2) * ... * 1. For n = 0, the factorial is defined as 1.
**Example:**
```text
Input: n = 5
Output: 120
Explanation: 5! = 5 * 4 * 3 * 2 * 1 = 120

Input: n = 4
Output: 24
Explanation: 4! = 4 * 3 * 2 * 1 = 24

Input: n = 0
Output: 1

Input: n = 1
Output: 1
```
**Progarm:** JAVA

```java
public class Main{
    public static int CalFact(int n){
        int ans = 1;
        for (int i = 2; i<=n; i++){
            ans = ans*i;
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.print(CalFact(5));
    }
}
```

**Output:**
```
120
```
**Complexity:**
- Time: O(n)
- Space: O(1)

### Using Recursion:

**Progarm:** JAVA

```java
public class Main{
    public static int CalFact(int n){
        if (n == 0 || n == 1)
            return 1;
        return n*CalFact(n-1);
    }

    public static void main(String[] args){
        System.out.print(CalFact(5));
    }
}
```

**Output:**
```
120
```
**Complexity:**
- Time: O(n)
- Space: O(n)

> In recursion, every function call is stored in the call stack until the base case is reached.
---