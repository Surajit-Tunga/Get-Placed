# Palindrome [Leetcode-125: Easy]:

- A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

- Given a string s, return true if it is a palindrome, or false otherwise.

**Example:**
```text
Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
```
**Constraints:**
```text
1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
```

**Solution:** JAVA

```java

    public static boolean checkPalidrome (String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();  //removes everything except letters (a-z, A-Z) and numbers (0-9).

        int n = s.length() - 1;

        if ( n % 2 == 0){

            int mid = n/2;

            for(int i = 0; i < n/2; i++) {

                if (s.charAt(i) != s.charAt(n-i)) {

                    return false;
                }
            }
            
        }

        if ( n % 2 != 0){

            int mid = (n+1)/2;

            for(int i = 0; i <= n; i++) {

                if (s.charAt(i) != s.charAt(n-i)) {
                    
                    return false;
                }
            }
            
        }

        return true;
    }

```

**Simplified:**

```java
public static boolean checkPalindrome(String s) {

    s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    int n = s.length() - 1;

    if (s.length() == 0) {
        return true;
    }

    for (int i = 0; i <= n / 2 ; i++) {   // n is int so for odd eg. 5:   5/2 = 2 

        if (s.charAt(i) != s.charAt(n - i)) {
            return false;
        }
    }

    return true;
}
```
**Complexity:**

- Time: O(n)
- Space: O(n)

> Why Space is O(n): O(n) because replaceAll() and toLowerCase() create new strings, and Java Strings are immutable.

---