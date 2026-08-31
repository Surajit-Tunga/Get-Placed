# Armstrong Number [Leetcode-1134: Easy]

- Given a number x, check if the given number is Armstrong's number or not. A positive integer of n digits is called an Armstrong number of order n (order is the number of digits) if

`abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ....`

- Here a, b, c and d are digits of input number abcd.....

**Example:**
```text
Input: n = 153
Output: true
Explanation: 153 is an Armstrong number, 1*1*1 + 5*5*5 + 3*3*3 = 153

Input: n = 9474
Output: true
Explanation: 94 + 44 + 74 + 44 = 6561 + 256 + 2401 + 256 = 9474

Input: n = 123
Output: false
Explanation: 1³ + 2³ + 3³ = 1 + 8 + 27 = 36
```

**Solution:** JAVA

```java
public class Main{

    public static boolean checkArmstrong(int n){

        int temp = n;     

        //Calculate Count
        int count = 0;

        while (temp != 0){
            temp /= 10;
            count ++;
        }

        //check num
         int value = 0;
         int num = n;

        for (int i = 1; i <= count; i ++){

            value += Math.pow(num%10 ,count);
            num /=10;  
        }

        return n == value;
        
    }

    public static void main(String[] args){
        
        int n = 153;

        System.out.println(checkArmstrong(n));
    }
}
```

**Complexity:**

- Time: O(d)  [d is no of digits]  [can be called O(log(n))]
- Space: O(1)

---