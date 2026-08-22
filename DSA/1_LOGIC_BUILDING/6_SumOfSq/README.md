# Program for Sum of squares of first n natural numbers:

- Given a positive integer n, we have to find the sum of squares of first n natural numbers. 
**Examples:** 
```text
Input : n = 2
Output: 5
Explanation: 1^2+2^2 = 5

Input : n = 8
Output: 204
Explanation :  1^2 + 2^2 + 3^2 + 4^2 + 5^2 + 6^2 + 7^2 + 8^2 = 204 
```
## Solution:

```java
import java.util.Scanner;

public class SumOfSq {
    public static int CalSum(int n){
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum = sum + (i*i);
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        System.out.print(CalSum(n));
        sc.close();
    }
}
```
- Output:

```text
Enter a Number:3
14
```
---
## Another Approch (Expected to do):

```java
import java.util.Scanner;

public class SumOfSq {
    public static int CalSum(int n){
        int sum = (n*(n+1)*(2*n+1))/6;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        System.out.print(CalSum(n));
        sc.close();
    }
}
```
---