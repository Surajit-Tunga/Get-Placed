# Print Hollow Rectangle Pattern:

- Given two integers n and m, print a hollow rectangle star pattern of the given n rows and m columns. In this pattern, stars (*) are printed on the boundary of the rectangle, while the inner area contains spaces.

**Solution:** JAVA

```java
public class Main {

    public static void main(String[] args) {

        int n = 5;
        int m = 15;

        for(int i = 1; i <= n; i ++){

            for(int j = 1; j <= m; j ++){

                if( i == 1 || i == n || j == 1 || j == m){

                   System.out.print("*");
                } else {

                    System.out.print(" ");
                } 
            }

            System.out.println("");
        }
    }
}
```

**Output:** 

```text
***************
*             *
*             *
*             *
***************
```

**Complexity:**

- Time: O(n2)
- Spcae: O(1)
---