# Program for Reverse Digits of a Number:

- Given an Integer n, find the reverse of its digits.

**Examples:** 
```text
Input: n = 122
Output: 221
Explanation: By reversing the digits of number, number will change into 221.

Input: n = 200
Output: 2
Explanation: By reversing the digits of number, number will change into 2.

Input: n = 12345 
Output: 54321
Explanation: By reversing the digits of number, number will change into 54321.
```
**Solution:**
```java
public class ReverseNo {

    static int Reverse(int n){
        int num = 0;
        while (n>0){
            num = (num*10) + (n%10);
            n = n/10;
        }
        return num;
    }

    public static void main(String[] args){
        int n=1234;
        System.out.println(Reverse(n));
    }
}
```
---