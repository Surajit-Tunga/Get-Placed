# Check the number is Even or Odd:

## My approch:

```java
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("The given number is Even.");
        } else {
            System.out.println("The given number is Odd.");
        }

        sc.close();  // Not required but good practice.
    }
}
```
- This program will work, but everything is written inside the `main()` method. If we want to check even or odd again somewhere else, we must write the same code again. Using a separate method makes the code cleaner and easier to reuse.

## Better Approch: 
- Using Separte Method `isEven`

```java
import java.util.Scanner;

public class EvenOdd {
    public static void isEven(int n){
        if (n % 2 == 0) {
            System.out.println("Number is Even.");
        } else {
            System.out.println("Number is Odd.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number:");
        int n = sc.nextInt();

        isEven(n);       

        sc.close();  // Not required but good practice.
    }
}
```
- But if we want to preform different tusk rather then printing it? then?

```java
import java.util.Scanner;

public class EvenOdd {
    public static boolean isEven(int n){
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number:");
        int n = sc.nextInt();

        if (isEven(n)){
            System.out.println("Number is Even.");
        } else {
            System.out.println("Number is Odd.");
        }  

        sc.close();  // Not required but good practice.
    }
}
```
- Now only the logical part is separted with a method.
- Note:
```text
public static boolean – Declares a class method that returns true or false.  
public static void – Declares a class method that does not return any value.
```
## Another Logical Approch using bitwise operator:

- Concept:
```text
Examples:

15  ->               1 1 1 1
                  &  0 0 0 1
                     -------
                     0 0 0 1 , so this we can say it is an odd number.

44 ->        1 0 1 1 0 0
          &  0 0 0 0 0 1
             ----------
             0 0 0 0 0 0 , so this we can say it is an even number.
```
```java
import java.util.Scanner;

public class EvenOdd {
    public static boolean isEven(int n){
        if ((n&1)==0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number:");
        int n = sc.nextInt();

        if (isEven(n)){
            System.out.println("Number is Even.");
        } else {
            System.out.println("Number is Odd.");
        }  

        sc.close();  // Not required but good practice.
    }
}
```
---