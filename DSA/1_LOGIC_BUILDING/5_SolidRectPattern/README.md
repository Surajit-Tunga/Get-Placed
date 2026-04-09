# Program to Print Solid Rectangle Star Pattern:

- Given two integers n and m, print a solid rectangle pattern of stars with n rows and m columns. Each row has exactly m stars.

## Solution:

```java
import java.util.Scanner;

public class SolidRectPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Row:");
        int n = sc.nextInt();
        System.out.print("Enter No of Collum:");
        int m = sc.nextInt();

        System.out.println(n+"*"+m+"  * pattern:");

        for (int i = 1; i<=n; i++){
            System.out.println();
            for(int j=1; j<=m; j++){
                System.out.print(" * ");
            }
        }
        sc.close();       
    }
}
```

- Output:
```text
Enter No of Row:6
Enter No of Collum:5
6*5  * pattern:

 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
```
---