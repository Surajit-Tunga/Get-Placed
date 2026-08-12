# Control Statements, Math & String:

## Ternary Operator:

- **Syntax:** variable = condition? expression1 : expression2;
- **Condition:** Boolean expreession, evaluates to true or false.
- **Expression:** Both expression must return compatible types. (ie. same type is variable).
- Used in simple expressions. But can reduce clarity of code if overused.

**Example:**
```java
import java.util.Scanner;

public class TernaryOperator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num:");
        int num1 = sc.nextInt();
        System.out.print("Enter second num:");
        int num2 = sc.nextInt();

        //Normal Comparison to find greater number

        if (num1>num2){
            System.out.print("First num is greater.");
        } else if (num2>num1) {
            System.out.print("Second num is greater.");
        } else {
            System.out.print("Both are Equal.");   
        }

        // Using Tarnary Operator

        int greaterNum = num1>num2? num1:num2;

        // it asks if num1 is greater then num2? if true then return num1 else num2.

        System.out.println(greaterNum);
    }
}
```
---

## Switch: 