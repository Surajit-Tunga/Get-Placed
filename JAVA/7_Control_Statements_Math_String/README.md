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

- **Multiple Cases:** Handles multiple values for an expression efficiently.
- **Break Statement:** Typically used to prevent fall-through between cases.
- **Default Case:** Execute if no case matches. Optional and Does not require break.

**Example:** Day of Week Detector.
```java
public class Main {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}
```

**Another Expression: JAVA14+**
```java
int day = 3;

String dayName = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    case 4 -> "Thursday";
    case 5 -> "Friday";
    case 6 -> "Saturday";
    case 7 -> "Sunday";
    default -> "Invalid day";
};

System.out.println(dayName);
```
---

## Loops