# Express a number as sum of consecutive numbers

- Given a positive integer n, find whether it can be represented as the sum of two or more consecutive positive integers.

**Examples:**
```text
Input: n = 10 
Output: true
Explanation: 10 can be expressed as: 1 + 2 + 3 + 4 = 10.

Input: n = 8
Output: false
Explanation: 8 cannot be expressed as the sum of two or more consecutive positive integers.

Input: n = 24
Output: true
Explanation: 24 can be expressed as: 7 + 8 + 9 = 24.
```

**Solution:** JAVA

```java
public class Main {

    public static boolean checkConsecutiveSum(int n) {

      for (int i = 1; i < n; i++) {

        int num = 0;

        for (int j = i; j < n; j++) {

            num += j;

            if (num == n) {
                return true;
            }

            if (num > n) {
                break;
            }
        }
      }

      return false;
    }

    public static void main(String[] args){
        System.out.print(checkConsecutiveSum(24));
    }
}
```
**Complexity:** 

- Time: O(n2)
- Space: O(1)

---