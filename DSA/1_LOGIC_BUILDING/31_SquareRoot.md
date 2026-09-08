# Program for Square Root of Integer

- Given a positive integer n, find its square root. If n is not a perfect square, then return floor of √n.

**Examples:**
```text
Input: n = 4
Output: 2
Explanation: The square root of 4 is 2.

Input: n = 11
Output: 3
Explanation: The square root of 11 lies in between 3 and 4 so floor of the square root is 3.
```

**Solution:** JAVA

```java
public class Main {

    public static int getSqRoot(int n) {

        int value = 0;

        for (int i =  1; i*i <= n; i++) {
            
            value = i;
            if(i*i == n) return value;
        }

        return value;
    }

    public static void main(String[] args) {

        int n = 11;
        System.out.println(getSqRoot(n));
    }
}
```

**Complexity:** 

- Time: O(sqrt(n))
- Space: O(1)

---