# Swap Two Numbers without third variable:

- Given two numbers a and b, the task is to swap them.

**Examples:**
```text
Input: a = 2, b = 3
Output: 3 2

Input: a = 20, b = 0
Output: 0 20

Input: a = 10, b = 10
Output: 10 10 
```

### Using Bitwise XOR

**Idea:**
```
Let us understand with an example, a = 10, b = 20

Store the XOR of a and b in a, a = a ^ b = 10 ^ 20 = 30
Get the original value of a and store it in b, b = a ^ b = 30 ^ 20 = 10
Get the original value of b and store it in a, a = a ^ b = 30 ^ 10 = 20
Final result: a = 20, b = 10
```

**Solution:**

```java
public class Main {
    public static void main(String[] args) {
        int a = 10, b = 20;
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println(a + " " + b);
    }
}
```

**Complexity:**

- Time: O(1)
- Space: O(1)

---