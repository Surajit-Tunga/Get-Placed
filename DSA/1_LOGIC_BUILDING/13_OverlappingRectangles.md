# Find if two rectangles overlap:
```text
Given two rectangles, find if the given two rectangles overlap or not.
Note that a rectangle can be represented by two coordinates, top left and bottom right. So mainly we are given following four coordinates. 
l1: Top Left coordinate of first rectangle. 
r1: Bottom Right coordinate of first rectangle. 
l2: Top Left coordinate of second rectangle. 
r2: Bottom Right coordinate of second rectangle.

Input: l1 = { 0, 10 }, r1 = { 10, 0 }, l2 = { 5, 5 }, r2 = { 15, 0 }
Output: Rectangles Overlap

Input: l1 = { 0, 10 }, r1 = { 10, 0 }, l2 = { -10, 5 }, r2 = { -1, 0 }
Output: Rectangles Don't Overlap
```
**Logic:**
```text
Rectangle 1 is completely left of Rectangle 2
OR
Rectangle 2 is completely left of Rectangle 1
OR
Rectangle 1 is completely below Rectangle 2
OR
Rectangle 2 is completely below Rectangle 1

IF any of these conditions is TRUE
    → Rectangles DON'T overlap
ELSE
    → Rectangles OVERLAP


X gap → completely left/right
OR
Y gap → completely above/below


```
**Points in JAVA:**

- In Java, there is no built-in Point class in java.lang, but you have a few ways to represent a point.

```java
import java.awt.Point;

public class Main {
    public static void main(String[] args) {

        Point p = new Point(10, 20);

        System.out.println(p.x); // 10
        System.out.println(p.y); // 20
    }
}
```
- OR make own point class:

```java
class Point {                 // Create a class named Point

    int x;                    // Store the X-coordinate
    int y;                    // Store the Y-coordinate

    Point(int x, int y) {     // Constructor: receives x and y values
        this.x = x;           // Store the received x value in the object's x
        this.y = y;           // Store the received y value in the object's y
    }
}
//---

Point p = new Point(10, 20);   // Create a Point object with x = 10 and y = 20
                               // p stores the reference to this Point object

System.out.println(p.x);
System.out.println(p.y);
```

**Program:** JAVA

```java
public class Main{
    static class Point {
        int x;
        int y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static boolean doOverlap(Point l1, Point r1, Point l2, Point r2){
        if (r1.x<l2.x || r2.x<l1.x || l1.y<r2.y || l2.y<r1.y){
            return false;
        } else {
            return true;
        }
        
    }


    public static void main(String[] args){
        Point l1 = new Point(0,10);
        Point r1 = new Point(10, 0);
        Point l2 = new Point(5, 5);
        Point r2 = new Point(15, 0);

        if (doOverlap(l1,r1,l2,r2)) {
            System.out.print("They Overlap.");
            } else {
                System.out.print("They do not Overlap.");
            }
    }

}
```
**Output:**
```text
They Overlap.
```

**Complexity:**

- Time Complexity  → O(1)
- Space Complexity → O(1)

---