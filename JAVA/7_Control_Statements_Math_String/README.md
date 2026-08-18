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

## Do-While Loops:

- Syntex:

```java
do {
    //body of the loop
}
while(condition);
```
- Executes block first, then checks condition.
- Guaranteed to run at least one iteration.
- Unlike while, first iteration is unconditional.
- Need to update condition to avoid infinite loop.

**Example:** Take input of age from user & if its not between 0-100 then take input again.

```java
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Using While Loop

        System.out.print("Enter Your Age:");
        int age = sc.nextInt();

        while (age<0 || age>100){

            System.out.print("Enter Your Age:");
            age = sc.nextInt();
        }

        System.out.print("Your age is:" + age);
    }
}
```
**Using Do-While:**
```java
int age;
do {
    System.out.print("Enter Your Age:");
    age = sc.nextInt();
} while (age<0 || age>100);
```
---

## For Loop:

- Syntex:
```java
for (initialisation; condition; update){
    //Body
}
```
- Standard loop for running code multiple times.

**Example:** Print Table of n

```java
import java.util.Scanner;

public class Main{

    public static void getTable(int n){

        for (int i=1;i<=10;i++){
            System.out.println(n + "*" + i +"="+ n*i);
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num:");
        int n = sc.nextInt();

        getTable(n);
    }
}
```
---

## For Each loop:

- Syntax:
```java
for (dataType variable : array/collection){
    // Body
}
```
- Used to traverse each element of an array or collection.
- It is simpler than a traditional for loop when you don't need the index.

**Example:** Print all elements of an array.

```java
public class Main{

    public static void main(String[] args){

        int[] arr = {10, 20, 30, 40, 50};

        for (int num : arr){
            System.out.println(num);
        }
    }
}
```
---

## Using break & continue: 

- **Break** lets you stop a loop early.
- **Continue** used to skip one iteration or the current.

**Example:** Break
```java
// Traversal with break

public class Main{

    public static void main(String[] args){

        int[] arr = {10, 20, 30, 40, 50};

        for (int num : arr){
            if (num == 30){
                break;
            }
            System.out.println(num);
        }
    }
}

```
**Output:**
```text
10
20
```
**Example:** Continue
```java
// Traversal with continue

public class Main{
    public static void main(String[] args){

        int[] arr = {10, 20, 30, 40, 50};

        for (int num : arr){
            if (num == 30){
                continue;
            }
            System.out.println(num);
        }
    }
}
```
**Output:**
```text
10
20
40
50
```
---

## Recursion:

- Recursion is a function when it calls itself.

**Example:** Factorial of n.
```java
public class Main{

    public static int calFact(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        return n*calFact(n-1);
    }

    public static void main(String[] args){

        System.out.println(calFact(5));
    }
}
```
---

## Random Numbers & Math class:


--- 