# Notes on Hashing in JAVA

## HashSet in JAVA:

- [Tutorial-Apna College](https://youtu.be/eJiGN1h8XzM?si=KLVTbpo9IUmlTcYu)

- **Step 1:** Import HashSet

```java
import java.util.HashSet;
```

- **Operations:**

```java
import java.util.HashSet;

public class Main {

    public static void main(String[] args){

        // Creating 
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1); //Set Takes only unique 

        //Size
        System.out.println(set.size());  // Return 4  

        //Print all ele
        System.out.println(set);   // [1, 2, 3, 4]

        //Search
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }

        if(!set.contains(5)){
            System.out.println("Set does not contains 1");
        }

        //Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Deleted 1");
        } 

    }
}
```

- **Iterator:** 
```java
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args){

        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
       
       Iterator it = set.iterator();

       // At starting it poitns to a null value

       System.out.println(it.next()); // gives the 1st value  1
       System.out.println(it.next()); // next to 1st   2
       System.out.println(it.next()); //next to 2nd    3
       System.out.println(it.next()); // 4

       // next is auto updated
       // Iterator may return in any order as HashSet stores data in unorderd manner.

       System.out.println(it.hasNext());  // Checks that an it has a next value or not (true or false)

    }
}
```
- **Traversal of HashSet:**
```java
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args){

        HashSet<Integer> set = new HashSet<>();

        set.add(22);
        set.add(31);
        set.add(54);
        set.add(20);
       
       Iterator it = set.iterator();

       while(it.hasNext()){
        System.out.print(it.next()+ " ");  //20 22 54 31 
       }

    }
}
```

---

## HashMap in JAVA:

- [Tutorial-Apna College](https://youtu.be/WeF3_nk-UqY?si=OjAjur0DXYmMY69f)

