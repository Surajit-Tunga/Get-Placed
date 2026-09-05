# Print Right Half Pyramid Star Pattern:

- Given an integer N, print a right half pyramid star pattern with N rows. The first row has 1 star, the second row has 2 stars, and each next row has one more star than the previous row. The Nth row has N stars, and all stars are left aligned.

**Solution:**

```java
public class Main {

    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n; i ++) {
            
            for(int j = 1; j <= i; j++){
                
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}
```
**Output:**

```text
* 
* * 
* * * 
* * * * 
```

**Complexity:**

- Time: O(n2)
- Space: O(1)

---