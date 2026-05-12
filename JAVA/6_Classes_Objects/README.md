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

- By using "." operator we can access the object like "product.price".
- Example:

```java
class BankAccount {
    // Instance variables
    String name;
    double balance;

    // Method
    void showBalance() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        // Declaring and creating object
        BankAccount acc1 = new BankAccount();

        // Accessing variables using object
        acc1.name = "Rahul";
        acc1.balance = 5000;

        // Accessing method using object
        acc1.showBalance();
    }
}
```
---

## Class vs Object:

- A **class** is only a blueprint or design of an object. An **object** is the real instance created from the class that stores data and performs actions.
- Class is a logical entity that defines variables and methods.
- Object is a physical entity that uses the variables and methods of a class.
- Class does not occupy memory until an object is created, but objects occupy memory.

--- 

## This Keyword:

- It refers to the current class instance variable.
- Can be used to invoke a constructor of the same class.
- Invokes a method of the current object.
- Can be passed as an argument in the method.

- Example:
```java
class Car {
    String brand;

    // Constructor
    Car(String brand) {
        this.brand = brand; // refers to current class instance variable
    }

    // Method
    void display() {
        this.show(); // invokes current object method
    }

    void show() {
        System.out.println("Car Brand: " + brand);
    }

    // Passing current object as argument
    void details(Car c) {
        System.out.println("Passed Car: " + c.brand);
    }

    void send() {
        details(this); // passing current object
    }

    public static void main(String[] args) {
        Car c1 = new Car("Toyota");

        c1.display();
        c1.send();
    }
}
```
- It can be returned from a method to return the current object of the class.
```java
class Car {
    String brand = "Toyota";

    Car getCar() {
        return this; // returns current object
    }

    void show() {
        System.out.println(brand);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.getCar().show();
    }
}
```

--- 

## Static Keyword:

- **Static Variable:** Belong to the class, not individual instances. Shared among all instances of the class.
- **Static Mehtod:** Can be called without createing an object of the call. Can only directly access static variables and other static methods.
- Static blocks cannot directly access non-static menbers of the class.
- Example:
```java
class Car {

    // Static variable (shared by all objects)
    static int wheels = 4;

    // Non-static variable
    String brand;

    // Constructor
    Car(String b) {
        brand = b;
    }

    // Static method
    static void showWheels() {
        System.out.println("Wheels: " + wheels);

        // Cannot directly access non-static variable
        // System.out.println(brand); ❌ Error
    }

    // Static block
    static {
        System.out.println("Static block executed");

        // Cannot access non-static members directly
        // System.out.println(brand); ❌ Error
    }

    public static void main(String[] args) {

        // Calling static method without object
        Car.showWheels();

        // Creating objects
        Car c1 = new Car("Toyota");
        Car c2 = new Car("BMW");

        System.out.println(c1.brand);
        System.out.println(c2.brand);

        // Shared static variable
        System.out.println(Car.wheels);
    }
}
```

--- 

## Constructor:

- Constructors are used to initialize objects with values when they are created.
- A costructor must have same name as the class in which it is declered.
- It has not any return type, not even void.
- A constructor automatically initializes object values when the object is created in the class.

- Example:
```java
class BankAccount {
    String name;
    double balance;

    // Constructor
    BankAccount(String n, double b) {
        name = n;
        balance = b;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        // Constructor automatically initializes object values
        BankAccount acc1 = new BankAccount("Rahul", 5000);

        acc1.showDetails();
    }
}
```
#### Type of Constructor:

- **Default Constructor:** If no constructor is explicitly defined, java provides a default constructor that initializes all member variables to the default values.
- Example:

```java
class Car {
    String brand;
    int speed;

    // No constructor defined

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args) {

        // Java provides default constructor
        Car c1 = new Car();

        c1.show();
    }
}
```

- **Parameterized Constructor:** Constructor have parameters to pass values when creating an object, allowing for different customization.
- Example:

```java
class Car {
    String brand;
    int speed;

    // Parameterized constructor
    Car(String b, int s) {
        brand = b;
        speed = s;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args) {

        // Passing values during object creation
        Car c1 = new Car("Toyota", 120);

        c1.show();
    }
}
```

#### Constructor Chaining:

- Using "this()" to call another constructor in the same class.
- "this()" must be the first statement in a constructor.
- Constractor chaining cant form a loop. It must have a terminating point.
- Example:

```java
class Car {
    String brand;

    // Default constructor
    Car() {
        this("Toyota"); // calls parameterized constructor
    }

    // Parameterized constructor
    Car(String b) {
        brand = b;
    }

    void show() {
        System.out.println("Brand: " + brand);
    }

    public static void main(String[] args) {
        Car c1 = new Car();

        c1.show();
    }
}
```

---

## Code Blocks:

- Code block"{---}" determines the scope of a varible.
- Variable inside a block cant be accesed outside it.
- Block without static run each time when an instance is created.
- Block with static run once when the class is loaded.
- Example:

```java
class Car {

    // Global variable
    String brand = "Toyota";

    // Static block (runs once)
    static {
        System.out.println("Static Block Executed");
    }

    // Non-static block (runs every object creation)
    {
        int speed = 120; // local variable

        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();

        // System.out.println(speed); ❌ Cannot access outside block
    }
}
```

---

## Q. Create a Book Class for Library System:

- **Instance variables:** title, author, isbn.
- **Static variable:** totalBooks, a counter for the total number of book instances.
- **Instance methods:** borrowBook(), returnBook().
- **Static method:** getTotalBooks(), to get the total number of books in the library.

- Solution:

```java
class Book {

    // Static variable shared by all objects
    static int totalBooks; 

    // Instance variables
    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    // Static block
    // Runs only once when class is loaded
    static {
        totalBooks = 0;
    }

    // Non-static block
    // Runs every time an object is created
    {
        totalBooks++;
    }

    // Parameterized constructor
    // Used to initialize book details
    Book(String author, String title, String isbn){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    // Constructor overloading
    // If only ISBN is given, default values are used
    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    // Static method
    // Can be called using class name
    static int getTotalBooks(){
        return totalBooks;
    }

    // Method to borrow a book
    void borrowBook() {

        // If already borrowed
        if (isBorrowed) {
            System.out.println("Book is already borrowed.");
        } 
        
        // Borrow the book
        else {
            this.isBorrowed = true;
            System.out.println("Book is successfully borrowed.");
        }
    }

    // Method to return a book
    void returnBook(){

        // If borrowed, return it
        if(isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Book is Successfully returned.");
        } 
        
        // If not borrowed
        else {
            System.out.println("Book is not borrowed yet.");
        }
    }

    public static void main(String[] args){

        // Creating object using constructor
        Book History = new Book(
            "Bipin Charndra",
            "Mordern Indian History",
            "1H"
        );

        // Creating object using overloaded constructor
        Book Geography = new Book("1G");

        // Calling static method
        System.out.println(Book.getTotalBooks());

        // Calling instance methods
        History.borrowBook();
        History.borrowBook();
        History.returnBook();
        History.borrowBook();
    }
}
```
- Output:

```text 
2
Book is successfully borrowed.
Book is already borrowed.
Book is Successfully returned.
Book is successfully borrowed.
```

---

## Q. Design a Course class.

- **Instance variables:** courseName, enrolledStudents.
- **Static variable:** maxCapacity, the maximum number of students for any course.
- **Instance methods:** enrollStudent(String studentName), unenrollStudent(String studentName).
- **Static method:** setMaxCapacity(int capacity), to set the maximum capacity for courses.

- Solution:

```java
class Course {

    // Instance variables
    String courseName;
    int enrolledStudents;

    // Static variable
    // Shared by all Course objects
    static int maxCapacity;

    // Static block
    // Runs once when class is loaded
    static {
        maxCapacity = 100;
    }

    // Constructor
    // Used to initialize course name
    Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = 0;
    }

    // Static method
    // Used to change maximum capacity
    static void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
    }

    // Instance method
    // Enrolls a student if seats are available
    void enrollStudent(String studentName) {

        if (enrolledStudents < maxCapacity) {

            enrolledStudents++;

            System.out.println(
                studentName + " enrolled in " + courseName
            );
        } 
        
        else {
            System.out.println("Course capacity is full.");
        }
    }

    // Instance method
    // Removes a student from course
    void unenrollStudent(String studentName) {

        if (enrolledStudents > 0) {

            enrolledStudents--;

            System.out.println(
                studentName + " unenrolled from " + courseName
            );
        } 
        
        else {
            System.out.println("No students to remove.");
        }
    }

    public static void main(String[] args) {

        // Changing maximum capacity
        Course.setMaxCapacity(2);

        // Creating Course objects
        Course javaCourse = new Course("Java");

        // Enrolling students
        javaCourse.enrollStudent("Rahul");
        javaCourse.enrollStudent("Amit");

        // Capacity full
        javaCourse.enrollStudent("Priya");

        // Removing student
        javaCourse.unenrollStudent("Rahul");
    }
}
```
- Output:

```text
Rahul enrolled in Java
Amit enrolled in Java
Course capacity is full.
Rahul unenrolled from Java
```

---

## Stack vs Heap Memory: 3.47