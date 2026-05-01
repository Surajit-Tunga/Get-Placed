# While Loop, Methods & Arrays:

## Comments in Java:

- Used to add Notes in java code.
- Not displayed in application but usefull for code organization

- **Syntex:**
```java
//single line

/* Mulit
Line*/

// java Docs  
/**
 * This class demonstrates basic addition operations.
 * It contains methods to add two integers.
 * 
 * @author Surajit
 * @version 1.0
 */
public class Calculator {
    
}
```
---

## Loop:

- Code that runs multiple time based on condition. 
- Repetative execution of codes.
- **Types:** while, for, do-while.
- **Iteration:** No of times the loop runs. 
---

## While Loop:

- Repeating a block of code while a condition is true. 
- Syntex:
```java
while (condition){
    //Do some work.
}
```
- Example:
```java
public class WhileExample {

    public static void main(String[] args) {
        
        int i = 1; // starting value
        
        // loop runs until i becomes 5
        while (i <= 5) {
            System.out.println(i); // print number
            i++; // increase i
        }
    }
}
```
---

## Function or Methods:

- It is a block of reusable code.
- Organizes code and perform some specific tasks.
- Naming rule is same as variables.
- Follows DRY Principle: Dont Repeat Yourself.
- In Java, it’s called a **method** because every function must belong to a class (object-oriented design).

### Syntex:

![](../img/Method.png)

- Example:

```java
import java.util.Scanner;

public class Table{ 
    //This is a method Defination  
    public static void calculate(int num){ 
         for (int i=1;  i<=10; i++){
            int value = i*num;
            System.out.println(num+"*"+i+"="+value);
         }
    }

    public static void main(String[] args){ // main method is called by JVM
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number:");
         int num = sc.nextInt();
         calculate(num);  //This is to call the calculate method in main method
         sc.close();
    }
}
```
---

## Return Statement

- Sends a value back from a method.
- It can return value, variable, Calculation etc.
- Return ends the method immediately.

- Example: 
```java
import java.util.Scanner;

public class SumOfN {
    public static int sum( int n){
        return (n*(n+1))/2;  // It returns this value.
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num:");
        int n = sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }
}
```
---

## Arguments:
