# Check if two strings are same:

- Given two strings, check if these two strings are identical(same) or not. Consider case sensitivity.

**Examples:**
```text
Input: s1 = "abc", s2 = "abc" 
Output: Yes 

Input: s1 = "", s2 = "" 
Output: Yes 

Input: s1 = "GeeksforGeeks", s2 = "Geeks" 
Output: No 
```

**Program:**
```java
public class Main{
    public static boolean checkForSameString(String s1, String s2){

        if(s1.length() != s2.length()){
            return false;
        }

        for (int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }

        return true;    
    }

    public static void main(String[] args) {
        
        String s1 = "hello";
        String s2 = "hello";

        if (checkForSameString(s1, s2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

**Using Builtin Methods:**
```java
    public static boolean checkForSameString(String s1, String s2){
        
        return s1.equals(s2);    
    }
```

**Complexity:** For Both Cases

- Time: O(n)
- Space: O(1) 
> Best case can be O(1) if the lengths differ or the first character differs, but worst-case complexity is O(n).

---