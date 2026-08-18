# Program to find LCM of two numbers:

- Given two positive integers a and b. Find the Least Common Multiple (LCM) of a and b.
- LCM of two numbers is the smallest number which can be divided by both numbers. 

**Example:**

```text 
Input :  a = 10, b = 5
Output :  10
Explanation : 10 is the smallest number divisible by both 10 and 5

Input :  a = 5, b = 11
Output :  55
Explanation : 55 is the smallest number divisible by both 5 and 11
```
**Program:** JAVA

```java
public class Main{
    public static int calLCM(int a, int b){

        int n = a*b; 

        for(int i =1; i<=n; i++){
            if(i%a==0&&i%b==0){
                return i;
            }
        }
        return n;         // Java requires a return statement because it cannot guarantee that the for loop will execute the return statement inside the if condition.
    }

    public static void main(String[] args){
        
        int a = 10;
        int b = 5;

        System.out.print(calLCM(a,b));  // 10
    }
}
```

**Complexity:**

- Time: O(a*b) 
- Space: O(1)

### Better Approch:

```java
public static int calLCM(int a, int b){

        int n = a*b; 
        int s = Math.min(a,b);
        int l = Math.max(a,b);

        for(int i = l; i<=n; i+=l){
            if(i%s==0){
                return i;
            }
        }
        return n;        
    }
```

- Time: O(min(a,b)) 
- Space: O(1)

--- 

### Using GCD LCM Formula:

```text
   a x b = LCM(a, b) * GCD (a, b)

   LCM(a, b) = (a x b) / GCD(a, b)
```

```java
public static int calGCD(int a, int b) {

    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }

    return a;
}
public static int calLCM(int a, int b){
    return (a / calGCD(a, b)) * b;
}
```

- Time: O(log(min(a,b)))
- Space: O(1)

--- 