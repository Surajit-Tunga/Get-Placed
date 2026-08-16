# Pair Cube Count:

- Given n, count all 'a' and 'b' that satisfy the condition a^3 + b^3 = n. Where (a, b) and (b, a) are considered two different pairs
**Examples:** 
```text
Input: n = 9
Output: 2
Explanation: 1^3 + 2^3 = 9 and 2^3 + 1^3 = 9

Input: n = 28
Output: 2
Explanation: 1^3 + 3^3 = 28 and 3^3 + 1^3 = 28
```
**Program:** JAVA

```java
public class Main{
    public static int countPairCube (int n){
        
        int count=0;

        for (int a = 1; a<=n; a++){
            for (int b = 1; b<=n; b++){
                if(a*a*a+b*b*b==n){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args ){
        
        int n =9;

        System.out.print(countPairCube(n));
    }
}
```

**Complexity:**

- Time: O(n^2)
- Space: O(1)

**Better Approch:**

```java
public class Main{
    public static int countPairCube (int n){
        
        int count=0;

        for (int a=1; a<=Math.cbrt(n); a++){
            int aCube = a*a*a;
            int diff = n-aCube;

            int cbrtDiff = (int) Math.cbrt(diff);

            if (cbrtDiff*cbrtDiff*cbrtDiff==diff){
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args ){
        
        int n =9;

        System.out.print(countPairCube(n));
    }
}
```

- Time: O(n^1/3)
- Space: O(1)

---
