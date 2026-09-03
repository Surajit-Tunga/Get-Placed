# Program to find Closest to n and Divisible by m:

- Given two integers n and m (m != 0). Find the number closest to n and divisible by m. If there is more than one such number, then output the one having maximum absolute value.

**Examples:** 
```java
Input: n = 13, m = 4
Output: 12
Explanation: 12 is the closest to 13, divisible by 4.

Input: n = -15, m = 6
Output: -18
Explanation: Both -12 and -18 are closest to -15, but -18 has the maximum absolute value.
```
## Solution:

```java
public class ClosestDivisible {

    public static int closestNum (int n, int m){
        int p = n/m;
        int n1 = p*m;
        int n2;
        if ((n*m)>0) {
            n2 = n1+m;
        } else {
            n2=n1-m;
        }

        if (Math.abs(n-n1)<Math.abs(n-n2)){
            return n1;
        } else if (Math.abs(n-n2)<Math.abs(n-n1)){
            return n2;
        } else {
            if (Math.abs(n1)<Math.abs(n2)){
                return n2;
            } else {
                return n1;
            }
        }
    }
    public static void main(String[] args){
        int n= 10;
        int m=6;
        System.out.print(closestNum(n,m));
    }
}
```
- Output:

```text
12
```
---