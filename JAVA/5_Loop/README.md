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
## 