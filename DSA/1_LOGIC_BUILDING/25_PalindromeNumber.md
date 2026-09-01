# Check if a number is Palindrome

- Given an integer n, determine whether it is a palindrome number or not. A number is called a palindrome if it reads the same from forward and backward.

**Examples:**
```text
Input: n = 12321
Output: True
Explanation: 12321 is a palindrome number because it reads same  forward and backward.

Input: n = -121
Output: True
Explanation:  We number is palindrome, we mainly ignore sign.

Input: n = 1234
Output:  False
Explanation: 1234 is not a palindrome number because it does not read the same forward and backward.
```
**Solution:** JAVA

```java
public class Main {

    public static boolean checkPalidrome (int n){

        int temp = n;
        int num = n;     

        //Calculate Count
        int count = 0;

        while (temp != 0){
            temp /= 10;
            count ++;
        }

        //Reverse Num
        int newNum = 0;
        int pos = count -1;

        while (pos >= 0){

            newNum += (n%10) * (int)Math.pow(10,pos);
            pos--;
            n/=10;

        }

        return newNum == num;

    }

    public static void main(String[] args) {

        int n = 121;

        System.out.println(checkPalidrome(n));
    }
}
```
**Complexity:**

- Time: O(d) [d is num of digit here]
- Space: O(1)

### For Leetcode 9 they treat -121 as false:

- Add this: 
```java
if (n < 0) {
        return false;
    }
```
---