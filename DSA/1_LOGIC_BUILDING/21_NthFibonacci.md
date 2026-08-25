# Nth Fibonacci [Leetcode-509: Easy]

- Given a positive integer n, find the nth Fibonacci number.

**Fibonacci series:** 
- The Fibonacci series is a sequence where a term is the sum of previous two terms. 
- The first two terms of the Fibonacci sequence are 0 followed by 1. 
- The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21......

**Example:**
```text
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).

Example 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
Example 2:

Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
Example 3:

Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
```

**Program:** JAVA 

```java
public class Main{

    public static int getFibonacci(int n){

        int first = 0;
        int second = 1;

        if (n == 0)   return 0;
        if (n == 1)   return 1;
        
        for (int i = 2; i <= n; i++){

            int num = first + second;
            first = second;
            second = num;
                       
        }

        return second;
    }

    public static void main(String[] args){

        int n = 5;
        System.out.print(getFibonacci(n));
    }
}
```

**Complexity:**
- Time: O(n)
- Space: O(1)

**Little Better Approch For Larger Num:** Use `long` insteed of `int`

- In Java, int can store values from -2,147,483,648 to 2,147,483,647.
- In the Fibonacci sequence, F(47) = 2,971,215,073, which is greater than the maximum value of int.
- Therefore, using int, we can safely calculate only up to F(46).
- To calculate larger Fibonacci numbers, use long, which can store values up to 9,223,372,036,854,775,807.
- With long, Fibonacci numbers can be safely calculated up to F(92).

```java
public static long getFibonacci(int n){

        long first = 0;
        long second = 1;

        if (n == 0)   return 0;
        if (n == 1)   return 1;
        
        for (int i = 2; i <= n; i++){

            long num = first + second;
            first = second;
            second = num;
                       
        }

        return second;
    }
```
---