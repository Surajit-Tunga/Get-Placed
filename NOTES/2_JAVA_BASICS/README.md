# JAVA BASICS

## Installing JDK:

- Downlod Latest DJK from oracle website.
- After Installing Verify Installation:
```bash
javac -version
```
--- 

## First Class using Text Editor:

```java
import java.lang.*;

public class FirstProgram {
  public static void main(String[] args) {
    System.out.println("Welcome to JAVA Basics");
  }
}
```
- Now Open Terminal:
```bash
javac FirstProgram.java
```
- It will convert the code in bytecode(not 0 1) by creating a file named FirstProgram.class.
- Now to Run the program:
```bash
java FirstProgram
```
- Output:
```text
Welcome to JAVA Basics
```
---

## Compiling & Running:

![](../img/CR.png)

- After Creating Java Program, With javac (Java Compiler) make it bytecode file (.class), then with JVM run (0 1 conversion) the code.

---

## Anatomy of a Class:

![](../img/Anatomy.png)

---

## File Extensions:

1. .java:
    - Contain Java Source Code.
    - High Level Human Readable.
    - Used for Development.
    - File is editable.
2. .class:
    - Contains java Bytecode.
    - For consumption of JVM.
    - Used for execution.
    - Not meant to be edited.

---

## JDK vs JVM vs JRE:

![](../img/JJJ.png)

1. JDK: Java Development Kit
    - It is a software Development Kit require to develop Java applications.
    - Includes the JRE, an interpreter/ loader (java), a compiler(jaavc), doc generater & other tools.
2.  JRE:  Java Runtime Environment 
    - Its a part of JDK but can be download separately.
    - Provides the librares, the JVM & other components to run application.
    - Does not have tools for developers like compiler.
3. JVM: Java Virtual Machine.
    - Part of JRE & responsible to execute the bytecode.
    - Ensure Java's write-once-run-anywhere capability.
    - Not Platform-independent: a different JVM is needed for each type of OS.

---

## Showing Output:

![](../img/op.png)

---

## Importance of Main Method: 