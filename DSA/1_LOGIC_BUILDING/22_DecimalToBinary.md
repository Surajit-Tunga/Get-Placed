# Decimal to Binary Conversion Program:

- Given a non negative number n, the task is to convert the given number into an equivalent binary representation.

**Examples:** 
```text
Input: n = 12
Output: "1100"

12/2 = 6 : R-0    ^
6/2 = 3  : R-0    |
3/2 = 1  : R-1    |
1/2 = 0  : R-1   Stop after getting 1

Input: n = 33
Output: "100001"

```

**Program:** JAVA

```java
public class Main {

    public static int getBinary(int n){
        
        int result = 0;
        int place = 1;

        while (n>0){

            int num = n%2;
            result = result + num * place;
            place = place*10;
            n = n/2;
        }

        return result;
    }

    public static void main(String[] args){

        System.out.println(getBinary(12));
    }
}
```

**Complexity:** 
- Time: O(log(n)) 
- Space: O(1)
---