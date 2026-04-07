# Program for multiplication table:

## Solution:
```java
import java.util.Scanner;

public class Table{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number:");
         int num = sc.nextInt();

         for (int i=1;  i<=10; i++){
            int value = i*num;
            System.out.println(num+"*"+i+"="+value);
         }
         sc.close();
    }
}
```
## Better to Separate the logical Part:
```java
import java.util.Scanner;

public class Table{
    public static void calculate(int num){
         for (int i=1;  i<=10; i++){
            int value = i*num;
            System.out.println(num+"*"+i+"="+value);
         }
    }

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number:");
         int num = sc.nextInt();
         calculate(num);
         sc.close();
    }
}
```
---