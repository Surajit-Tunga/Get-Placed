# Program to Print Floyd's Triangle:

- Given an integer n, print Floyd's Triangle with n rows. Floyd's Triangle is a right-angled triangular pattern formed using consecutive natural numbers starting from 1.

**Example:**
```text
n = 4

Output:
  
       1
       2 3
       4 5 6
       7 8 9 10
```
**Program:** JAVA

```java
public class Main {

    public static void printFloydsTri (int n){

        int digit = 1;        

        for ( int i = 0; i < n; i++){
            
            digit+=i;
            int count = digit+i;

            for (int j = digit; j <= count; j++){

                System.out.print(j + "  ");

            }
            System.out.println(" ");

        }
    }

    public static void main(String[] args){
        
        int n = 4;

        printFloydsTri(n);
    }
}
```

**Complexity:** 

- Time: O(n2)
- Space: O(1)

---