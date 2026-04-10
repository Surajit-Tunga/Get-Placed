# The dice problem:

- You are given a cubic dice with 6 faces. All the individual faces have a number printed on them. The numbers are in the range of 1 to 6, like any ordinary dice. You will be provided with a face of this cube, your task is to guess the number on the opposite face of the cube.

## Solution:

```java
import java.util.Scanner;

public class Dice {

    public static int Opposite(int n){
        int ans;
        if (n==1){
            ans = 6;
        } else if (n==2){
            ans = 5;
        } else if (n==3){
            ans = 4;
        } else if (n==4){
            ans = 3;
        } else if (n==5){
            ans = 1;
        } else {
            ans = 1;
        } 
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter One Side of The Dice:");
        int n = sc.nextInt();
        System.out.print(Opposite(n));
        sc.close();
    }
}
```
---

## Other Approch:

```java
import java.util.Scanner;

public class Dice {

    public static int Opposite(int n){
        int ans = 7-n; 
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter One Side of The Dice:");
        int n = sc.nextInt();
        System.out.print(Opposite(n));
        sc.close();
    }
}
```
---