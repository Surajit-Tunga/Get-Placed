# Program to add two fractions:

- Given two integer arrays a[] and b[] containing two integers each representing the numerator and denominator of a fraction respectively. The task is to find the sum of the two fractions and return the numerator and denominator of the result.
 
**Example:** 
```text
Input:  a = [1, 2] , b = [3, 2] 
Output: [2, 1] 
Explanation: 1/2 + 3/2 = 2/1

Input:  a = [1, 3] , b = [3, 9] 
Output: [2, 3] 
Explanation: 1/3 + 3/9 = 2/3   

Input:  a = [1, 5] , b = [3, 15] 
Output: [2, 5] 
Explanation: 1/5 + 3/15 = 2/5 
```

**Program:**

```java
public class Main{


    // Calculate GCD  
    // Time: O(log(min(a,b)))

    public static int calGCD(int a, int b){

        while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }

    return a;
    }

    // Calculate LCM using GCD formula
    // Time: O(log(min(a,b)))

    public static int calLCM(int a, int b){
    return (a / calGCD(a, b)) * b;
    }

    // Add two fractions and simplify the result
    // Time: O(log(min(n,d)))

    public static int[]  addFractions(int n1, int n2, int d1, int d2, int lcm){
        
        int d = lcm;
        int n = n1*(d/d1)+n2*(d/d2);

        // To simplify the ans divide both by their GCD

        int gcd = calGCD(n,d);

        int n_ans = n/gcd;
        int d_ans = d/gcd;

        return new int[]{n_ans, d_ans};

    }

    public static void main(String[] args){

        int num1[] = {1,5};
        int num2[] = {3,15};

        int n1 = num1[0];
        int d1 = num1[1];

        int n2 = num2[0];
        int d2 = num2[1];

        int lcm = calLCM(d1,d2);

        int[] ans = addFractions(n1, n2, d1, d2, lcm);

        System.out.print(ans[0] + "/" + ans[1]);
    }
}
```

**Complexity:** 

- Time: 
- Space: O(1) 

---