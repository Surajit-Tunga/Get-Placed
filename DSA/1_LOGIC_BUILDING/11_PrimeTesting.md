# Check for Prime Number:

**Problem:**
- Given a number n, check whether it is a prime number or not.
> Note: A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.

```text
Input: n = 7
Output: true
Explanation: 7 is a prime number because it is greater than 1 and has no divisors other than 1 and itself.

Input: n = 25
Output: false
Explanation: 25 is not a prime number because it is divisible by 5 (25 = 5 × 5), so it has divisors other than 1 and itself.

Input: n = 1
Output: false
Explanation: 1 has only one divisor (1 itself), which is not sufficient for it to be considered prime.
```
**Solution:** JAVA

```java
import java.util.Scanner;

public class PrimeTest {
    // Method to test Prime
    public static boolean isPrime (int n){
        // Eliminate numbers less then 1 and 1 itself.
        if (n<=1) {
            return false;
        }

        // Check Divisibility from 2 to n-1
        for (int i =2; i<n; i++) {
            if (n%i==0) {
                return false;
            }
        }

        // If both filter passed then return ture.
        return true;
    }

    // Main Method

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num:");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}
```

**Output:**

```text 
Enter a Num:8
False

Enter a Num:7
True
```
---