# Program to find Sum of Digits:

- Given a number n, find the sum of its digits.

**Examples:** 
```text
Input: n = 687
Output: 21
Explanation: The sum of its digits are: 6 + 8 + 7 = 21

Input: n = 12
Output: 3
Explanation: The sum of its digits are: 1 + 2 = 3
```
## Solution:

```java
public class SumOfDigits {
   static int Sum (int n) {
        int ans = 0;
        while (n!=0){
            int  last = n%10;
            ans+=last;
            n = n/10;
        }
        
        return ans;
        
    }
    public static void main(String[] args){
        System.out.println(Sum(1234));  //10
    }
}

```

## Using Recusion:

```java
public class SumOfDigits {
   static int Sum (int n) {
    if (n==0){
        return 0;
    }
    return n%10 + Sum(n/10);
    }
    public static void main(String[] args){
        System.out.println(Sum(1234));  //10
    }
}
```
