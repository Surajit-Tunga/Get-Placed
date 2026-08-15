# Strings

- Strings are sequences of characters. 
- Strings are typically immutable in most of the programming languages like Java, Python and JavaScript.
> Immutable means cannot be changed after it is created.
**Example:**
```text
"Kolkata", "Data Structure and Algo", "Day25"
```
## Strings in JAVA:

- A String in Java is an object used to store a sequence of characters enclosed in double quotes.

**Create A String:**

```java
String str = "Hello World";

//Or using New keyword

String str = new String("Hello World");
```
> `String str = "Hello";` uses the **String Pool**, while `String str = new String("Hello");` creates a **new String object in heap memory**.

**Different Methods for String in JAVA:**

| Method               | Syntax                        | Example                                      | Purpose                            |
| -------------------- | ----------------------------- | -------------------------------------------- | ---------------------------------- |
| `length()`           | `str.length()`                | `"Hello".length()` → `5`                     | Returns the length                 |
| `charAt()`           | `str.charAt(index)`           | `"Hello".charAt(1)` → `'e'`                  | Returns character at index         |
| `substring()`        | `str.substring(start, end)`   | `"Hello".substring(1, 4)` → `"ell"`          | Extracts part of String            |
| `equals()`           | `str1.equals(str2)`           | `"Hello".equals("Hello")` → `true`           | Compares Strings                   |
| `equalsIgnoreCase()` | `str1.equalsIgnoreCase(str2)` | `"Hello".equalsIgnoreCase("hello")` → `true` | Compares ignoring case             |
| `compareTo()`        | `str1.compareTo(str2)`        | `"Apple".compareTo("Banana")` → negative     | Lexicographically compares Strings |
| `toUpperCase()`      | `str.toUpperCase()`           | `"hello".toUpperCase()` → `"HELLO"`          | Converts to uppercase              |
| `toLowerCase()`      | `str.toLowerCase()`           | `"HELLO".toLowerCase()` → `"hello"`          | Converts to lowercase              |
| `contains()`         | `str.contains(sub)`           | `"Hello".contains("ell")` → `true`           | Checks if substring exists         |
| `indexOf()`          | `str.indexOf(value)`          | `"Hello".indexOf("l")` → `2`                 | Finds first index                  |
| `lastIndexOf()`      | `str.lastIndexOf(value)`      | `"Hello".lastIndexOf("l")` → `3`             | Finds last index                   |
| `startsWith()`       | `str.startsWith(prefix)`      | `"Hello".startsWith("He")` → `true`          | Checks starting characters         |
| `endsWith()`         | `str.endsWith(suffix)`        | `"Hello".endsWith("lo")` → `true`            | Checks ending characters           |
| `replace()`          | `str.replace(old, new)`       | `"Hello".replace("l", "x")` → `"Hexxo"`      | Replaces characters/text           |
| `trim()`             | `str.trim()`                  | `"  Hello  ".trim()` → `"Hello"`             | Removes leading/trailing spaces    |
| `isEmpty()`          | `str.isEmpty()`               | `"".isEmpty()` → `true`                      | Checks if String has length 0      |
| `split()`            | `str.split(regex)`            | `"A,B,C".split(",")` → `["A","B","C"]`       | Splits String into an array        |

---

## General Operations performed on String:

### String Traversal:

```java
String s = "hello";

for (int i = 0; i < s.length(); i++) {
    System.out.println(s.charAt(i));
}
```

### Length of a String:
- Given a string s, the task is to find the length of the string.

```text
Input: s = "abc"
Output:  3

Input: s = ""
Output: 0
```

**Program:** JAVA

```java 
public class Main{
    public static void main(String[] args){
        String s = "abc";
        System.out.println(s.length());
    }
}
```
**Output:**
```
3
```
**Complexity:**

Time Complexity: O(1)
Space Complexity: O(1)

### Program to Search a Character in a String:
- Given a character ch and a string s, the task is to find the index of the first occurrence of the character in the string. If the character is not present in the string, return -1.
```text
Input: s = "geeksforgeeks", ch = 'k'
Output: 3
Explanation: The character 'k' is present at index 3 and 11 in "geeksforgeeks", but it first appears at index 3.
```
**Program:** JAVA

```java
public class Main{
    public static void main(String[] args){
        String s = "geeksforgeeks";
        char ch = 'k';
        System.out.println(s.indexOf(ch));        
    }
}
``` 
**Output:**
```
3
```
**Complexity:**
- Time: O(n)
- Space: O(1)
> Because indexOf() may need to check every character in the string.

### Check if a string is substring of another:
- Given two strings txt and pat, the task is to find if pat is a substring of txt. If yes, return the index of the first occurrence, else return -1.
```text
Input: txt = "geeksforgeeks", pat = "eks"
Output: 2
Explanation: String "eks" is present at index 2 and 10, so 2 is the smallest index.

Input: txt = "geeksforgeeks", pat = "xyz"
Output: -1.
Explanation: There is no occurrence of "xyz" in "geeksforgeeks"
```
**Progarm:** JAVA

```java
public class Main{
    public static int findSubString(String txt, String pat){
        int n = txt.length();
        int m = pat.length();

        for (int i=0; i<n; i++){
            if(txt.charAt(i) == pat.charAt(0)){
                for (int j=1; j<n;j++){
                    if(txt.charAt(i+1) == pat.charAt(j)){
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String txt = "geeksforgeeks";
        String pat = "xyz";

        System.out.println(findSubString( txt, pat));
    }
}
```
**Output:**
```
-1
```
**Complexity:**

- Time : O(n*m)
- Space: O(1)

**OR Program Using Builtin Functions:**

```java
public static int findSubString(String txt, String pat){
        int idx = txt.indexOf(pat);

        if (idx != -1){
            return idx;
        }
        return -1;
    }
```
**Complexity:**

- Time : O(n*m)
- Space: O(1)

### Insert a character in String at a Given Position:

### Deletion of Character in String:

### 





