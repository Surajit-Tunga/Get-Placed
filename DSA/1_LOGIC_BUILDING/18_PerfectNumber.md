# Perfect Number

- A number is a perfect number if it is equal to the sum of its proper divisors, that is, the sum of its positive divisors excluding the number itself. Find whether a given positive integer n is perfect or not.

**Example:**
```text
Input: n = 15
Output: false
Explanation: Divisors of 15 are 1, 3 and 5. Sum of divisors is 9 which is not equal to 15.

Input: n = 6
Output: true
Explanation: Divisors of 6 are 1, 2 and 3. Sum of divisors is 6.
```
**Program:** JAVA

```java
public class Main{

    public static boolean checkPerfect(int n){

        int sum = 0;

        for (int i = 1; i < n; i++) {

            if (n % i == 0){
                sum = sum + i;
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {

        int n = 6;

        System.out.println(checkPerfect(n));
    }
}
```

**Complexity:**

- Time: O(n)
- Space: O(1)

### Optimized Way:

- For every divisor i, there is a corresponding divisor n/i.

```java

    public static boolean checkPerfect(int n){

        int sum = 1;

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0){
                sum = sum + i;  

                if(i != n/i) {
                    sum = sum + n/i;  
                }
            }
        }

        return sum == n;
    }
```

**Complexity:**

- Time: O(sqrt(n))
- Space: O(1)

--- 