# Swap Two Numbers:

- Given two numbers a and b, the task is to swap them.

**Examples:**
```java
Input: a = 2, b = 3
Output: 3 2

Input: a = 20, b = 0
Output: 0 20

Input: a = 10, b = 10
Output: 10 10 
```
## Solution:

``` java
public class SwapTwo {
    public static void main(String[] args){
        int a = 6;
        int b = 8;

        System.out.println("Before Swap:");
        System.out.println(a);
        System.out.println(b);

        // Using Third Varible
        int c = b;
        b=a;
        a=c;

        System.out.println("After Swap:");
        System.out.println(a);
        System.out.println(b);
        
    }
}
```
- Output:

```text
Before Swap:
6
8
After Swap:
8
6
```
---

## Without Using Third Variable:

```java
public class SwapTwo {
    public static void main(String[] args){
        int a = 6;
        int b = 8;

        System.out.println("Before Swap:");
        System.out.println(a);
        System.out.println(b);

        b = a+b; 
        a= b-a;
        b=b-a;

        System.out.println("After Swap:");
        System.out.println(a);
        System.out.println(b);
        
    }
}
```
---