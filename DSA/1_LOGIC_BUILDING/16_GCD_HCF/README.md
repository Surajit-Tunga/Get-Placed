# Program to Find GCD or HCF of Two Numbers:

- Given two positive integers a and b, the task is to find the GCD of the two numbers.
> Note: The GCD (Greatest Common Divisor) or HCF (Highest Common Factor) of two numbers is the largest number that divides both of them. 

**Example:**
```text
Input: a = 20, b = 28
Output: 4
Explanation: The factors of 20 are 1, 2, 4, 5, 10 and 20. The factors of 28 are 1, 2, 4, 7, 14 and 28. Among these factors, 1, 2 and 4 are the common factors of both 20 and 28. The greatest among the common factors is 4.

Input: a = 60, b = 36
Output: 12
Explanation: GCD of  60 and 36 is 12.
```
**Program:** JAVA

```java
public class Main{
    public static int checkGCD(int a, int b){
        int n = Math.min(a,b);
        int GCD = 1;
        for(int i = 1; i<=n;i++){
            if(a % i == 0 && b % i == 0){
                GCD =i;
            }
        }

        return GCD;
    }
    public static void main(String[] args){
        int a = 60;
        int b = 36;

        System.out.print(checkGCD(a,b));
    }
}
```

**Output:**
```text
12
```
**Complexity:**
- Time: O(min(a,b))
- Space: O(1)

### Using Euclidean Algorithm: 
**Idea:**
```text
GCD(a, b) = GCD(b, a % b)

Keep finding the remainder of a ÷ b and replace:
a → b
b → remainder

When b becomes 0, a is the GCD.
```

**Example:** 
```text
GCD(48, 18)

48 % 18 = 12
18 % 12 = 6
12 % 6  = 0

GCD = 6

GCD(18, 48)

18 % 48 = 18   // 48 is greater than 18, so it cannot fit even once.
               // Therefore, the remainder is 18.

48 % 18 = 12
18 % 12 = 6
12 % 6  = 0

GCD = 6
```

**Program:**
```java
public static int checkGCD(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }

    return a;
}
```
**Complexity:**
- Time: O(log(min(a,b)))
- Space: O(1)

> The remainder operation reduces the numbers very quickly in every iteration.

```text
Linear:       100 → 99 → 98 → 97 → ...   
Euclidean:    100 → ~50 → ~25 → ~12 → ... 
```
---