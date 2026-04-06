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

4. Create a program to swap 2 numbers:

```java
public class Swap {
    public static void main (String args[]) {
        int a = 10;
        int b = 20;
        System.out.println("a , b =" + a + ", " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a , b =" + a + ", " + b);        
    }
}
```
- output:
```text
a , b =10, 20
a , b =20, 10
```
---

5. Write a java program to convert Fahrenheit to Celsius:

```java
import java.util.Scanner;

public class F2C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("Temperature in Celsius: %.2f\n", celsius);
        sc.close();
    }
}
```
- Output:
```text 
Enter temperature in Fahrenheit: 80.6
Temperature in Celsius: 27.00
```
---

6. Create a Program That Determine greatest of the three number in JAVA.

```java
public class G3{
    public static void main(String[] args){
        int a=5,b=7,c=9;
        if (a > b && a > c) {
            System.out.print(a + " is greater then others.");
        } else if (b > a && b > c) {
            System.out.print(b + " is greater then others.");
        } else {
            System.out.print(c + " is greater then others.");
        }
    }
}
```
- Output:
```text
9 is greater then others.
```
---
7.  Write a program to check if a given number is even or odd with bitwise operator.

```java
import java.util.Scanner;

public class EvenOddBitwise {

    public static boolean isEven(int num) {
        if((num&1)==1) {
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        if (isEven(num)){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        sc.close();
    }
}
```
- Output:
```text
Enter a Number:7
Odd Number
```
---