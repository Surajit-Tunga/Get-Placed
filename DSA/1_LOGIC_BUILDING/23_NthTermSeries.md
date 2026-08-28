# Find n-th term of series 1, 3, 6, 10, 15, 21...
- Given a number n, find the n-th term in the series 1, 3, 6, 10, 15, 21...

**Examples:**
```text
Input  3
Output 6

Input  4
Output  10
```
**Logic:**
```text
0+1=1    // 1*(1+1)/2 = 1
1+2=3   // 2*(2+1)/2 = 3
3+3=6  // 3*(3+1)/2 = 6
6+4=10
10+5=15
15+6=21

n-th : (n-1)-th term + n
```

**Solution:** JAVA
```java
public class Main{

    public static int findTerm(int n){

        int ans = 0;     
        
        for (int i = 1; i <=n; i++){

            ans = ans + i;
        }

        return ans;

    }

    public static void main(String[] args){

        int n = 5;

        System.out.print(findTerm(n));
    }
}
```

**Complexity:**

- Time: O(n)
- Space: O(1)

### Better Approch:

**Logic:**
```text
1*(1+1)/2 = 1
2*(2+1)/2 = 3
3*(3+1)/2 = 6


n-th : n*(n+1)/2
```
**Program:** 
```java
public static int findTerm(int n){

    return n*(n+1)/2;
}
```

**Complexity:**

- Time: O(1)
- Space: O(1)
---