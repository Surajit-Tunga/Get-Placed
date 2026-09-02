# Digital Root:

- Given a number n, find the digital root of n. Digital Root of a number is the recursive sum of its digits until we get a single digit number.

**Examples:**
```text
Input: n = 1
Output:  1
Explanation: Digital root of 1 is 1.

Input: n = 99999
Output: 9
Explanation: The sum of digits of 99999 is 45 which is not a single digit number, hence the sum of digits of 45 is 9 which is a single digit number.
```

**Solution:** JAVA

```java
public class Main{

    public static int getDigitalRoot(int num){

        int res = 0;

        while ( num > 0  || res > 9) {

            if ( num == 0){
                num = res;
                res = 0;
            }

            res += num%10;
            num /=10;
        }

        return res;

    }

    public static void main(String[] args) {
        
        int num = 11111;

        System.out.println(getDigitalRoot(num));
    }
}
```

**Complexity:** 

- Time: O(d) d is digit of the number
- Space: O(1)

### Other approch using formula:

**Idea:**
```text
A number and the sum of its digits always leave the same remainder when divided by 9. For example, 572 → 5 + 7 + 2 = 14 → 1 + 4 = 5, and both 572 and 5 have the same remainder modulo 9.
Repeatedly summing the digits (finding the digital root) does not change this remainder.
Therefore, for any non-zero number, the digital root is simply n % 9.
The only exception is when n is a non-zero multiple of 9. In this case, n % 9 is 0, but the digital root is 9, so the function returns 9.
If n is 0, its digital root is also 0, which is handled separately.
```

**Program:**

```java
public static int getDigitalRoot(int num){
    if (num == 0){
        return 0;
    }
    if (num % 9 == 0){
        return 9;
    }

    return num % 9;


    }
```

**Complexity:** 

- Time: O(1)
- Space: O(1)

---