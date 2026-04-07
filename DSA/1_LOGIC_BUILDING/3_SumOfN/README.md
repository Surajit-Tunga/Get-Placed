# Program for sum of n natural numbers:

## Solution:

```java
import java.util.Scanner;

public class SumOfN {
    public static void sum( int n){
        int result =0;
        for(int i=1; i<=n; i++){
            result +=i;
        }
        System.out.println("Sum of Number:"+result);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num:");
        int n = sc.nextInt();
        sum(n);
        sc.close();
    }
}
```

## Solution by Recursion:
```java
import java.util.Scanner;

public class SumOfN {
    public static int sum( int n){
        if (n==1){
           return 1;
        } else {
          return  n + sum(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num:");
        int n = sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }
}
```

## OR using simple formula n*(n+1)/2:

```java
import java.util.Scanner;

public class SumOfN {
    public static int sum( int n){
        return (n*(n+1))/2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num:");
        int n = sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }
}
```
---

