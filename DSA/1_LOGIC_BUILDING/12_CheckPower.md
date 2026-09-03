# Check if a number is a power of another:

- Given two positive numbers x and y, check if y is a power of x or not.

```text
Input:  x = 2, y = 8
Output: true
Explanation: 2^3 is equal to 8

Input:  x = 10, y = 1
Output: true
Explanation: 10^0 is equal to 1

Input:  x = 10, y = 1001
Output: false
```
**Solution:** JAVA

```java
import java.util.Scanner;
public class Main{

    public static boolean CheckPower(int X, int Y){
        if (Y==1){
            return true;
        }

        while (Y%X==0) {
            Y=Y/X;
        }
        return Y==1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X:");
        int X = sc.nextInt();
        System.out.print("Enter Y:");
        int Y = sc.nextInt();

        System.out.println(CheckPower(X,Y));
    } 
}
```
**Output:**
```text
Enter X:5
Enter Y:20
false

Enter X:5
Enter Y:125
true

Enter X:5
Enter Y:1
true
```

**Complexity Analysis:**

| Complexity | Value        |
| ---------- | ------------ |
| Time       | **O(log Y)** |
| Space      | **O(1)**     |

> O(log Y) — because Y is divided by X in every iteration, reducing its value exponentially.

---
