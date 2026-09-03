# Notes on Hashing in JAVA

## HashSet in java:

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
       
       Iterator it = set.Iterator();



    }
}
```

