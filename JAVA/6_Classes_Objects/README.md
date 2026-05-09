# Classes & Objects:

## Process vs Object Oriented: 

- **Process-Oriented Programming (POP)**: POP focuses on functions and procedures to perform tasks. In a bank system, separate functions like deposit(), withdraw(), and checkBalance() operate on account data. Data and functions are separate, so security is lower.

- **Object-Oriented Programming (OOP)**: OOP focuses on objects that combine both data and functions together. In a bank system, a BankAccount object contains balance data and methods like deposit() and withdraw(). This makes the system more secure and easier to manage.

---

## Instance Variable and Methods:

- Instance variables are the variables declared inside a class that store the data of an object. For example, in a bank system, accountNumber, name, and balance are instance variables of a BankAccount class.

- Instance methods are the functions defined inside a class that operate on the instance variables. In a bank system, deposit(), withdraw(), and checkBalance() are instance methods used to manage account details.

### Example Program:

```java
public class Car {
    // Instance Variables for Class Car
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuel;
    int noOfSeats;

    // Instance Methods for Class Car

    public void drive(){
        System.out.println("Car is Running");
        currentFuel--;
    }

    public void addFuel(float fuel) {
        currentFuel+= fuel;
    }

    public static void main(String[] args){
        //main method
    }
}
```

---

## Declaring Objects:

![](../img/Obj.png)

- Object Creation: "new" instantiates a new object of a class.

```java
Car mycar = new Car();

/* This statement creates an object of the `Car` class.

Car → class name
myCar → object/reference variable
new Car() → creates a new object in memory
*/

```
- Memory allocation: Allocates memory for the object in the "heap".
- Constructor Invocation: Calls the class constractor to initilize the object.
- Return Refernce: Return a reference to the created object.
- Array Creation:    int[] arr = new int [5]. (Array is also a object.)
- Dynamic Allocation: Unlike static allocation, new allows for dynamic  allocation, memory allocation, allocating memory at runtime.

---

## Using Objects: 2.24
