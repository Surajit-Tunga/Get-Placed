# Progamming Challenges:

1. Show the following patterns using single print statement with help of escape sequences.

- Code:
```java
public class Patterns {
    public static void main(String[] args){
        System.out.println("Right Half Pyramid");
        System.out.println("* \n* * \n* * * \n* * * * \n* * * * *");

        System.out.println("Reverse Right Half Pyramid");
        System.out.println("* * * * * \n* * * * \n* * * \n* * \n* ");

        System.out.println("Left Half Pyramid");
        System.out.println("        * \n      * *  \n    * * * \n  * * * * \n* * * * *");
    }
}
```
- Output
```text
Right Half Pyramid
* 
* * 
* * * 
* * * * 
* * * * *
Reverse Right Half Pyramid
* * * * * 
* * * * 
* * * 
* * 
* 
Left Half Pyramid
        * 
      * *  
    * * * 
  * * * * 
* * * * *
```
---
2. Take Input Your Name & Say Good Morning:

- Code:

```java
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Good Morning " + name);
    }
}
```

- Output:

```text
Enter Your Name: 
Surajit
Good Morning Surajit
```
---

3. Create a program to add 2 num:

- Code:
```java
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Eneter 1st Number:");
        int num1 = input.nextInt();
        System.out.println("Eneter 2nd Number:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Result:" + sum);

    }
}
```
- Output: 
```text
Eneter 1st Number:
6
Eneter 2nd Number:
2
Result:8
```
---

4. 