# Replace with Adjacent Multiplication
- Given an array arr[], replace each element with the product of itself and its adjacent elements.
- For index i: `arr[i] = arr[i-1] * arr[i] * arr[i+1]`
> Assume the previous of the first and the next of the last as 1.

**Example:**

```text 
Input: arr[] = [2, 4, 5]
Output: [8, 40, 20]
Explanation: 
For index i = 0, arr[0] = 1 * arr[0] * arr[1] = 1 * 2 * 4 = 8
 For index i = 1, arr[1] = arr[0] * arr[1] * arr[2] = 2 * 4 * 5 = 40
 For index i = 2, arr[2] = arr[1] * arr[2] * 1 = 4 * 5 * 1 = 20
Thus, the updated array becomes [8, 40, 20].

Input: arr[] = [2, 5, 7, 8, 3]
Output: [10, 70, 280, 168, 24]
Explanation: 
For index i = 0, arr[0] = 1 * arr[0] * arr[1] = 1 * 2 * 5 = 10
 For index i = 1, arr[1] = arr[0] * arr[1] * arr[2] = 2 * 5 * 7 = 70
 For index i = 2, arr[2] = arr[1] * arr[2] * arr[3] = 5 * 7 * 8 = 280
 For index i = 3, arr[3] = arr[2] * arr[3] * arr[4] = 7 * 8 * 3 = 168
 For index i = 4, arr[4] = arr[3] * arr[4] * 1 = 8 * 3 * 1 = 24
Thus, the updated array becomes [10, 70, 280, 168, 24].
```

**Program:** JAVA

```java
public class Main{

    public static void getUpdatedArray(int arr[]){

        int n = arr.length;
        int[] temp = new int[n];

        for(int i=0; i<n; i++){
            
            int prev = (i==0)? 1: arr[i-1];
            int next = (i==n-1)? 1: arr[i+1];

            temp[i]= prev*arr[i]*next;
        }

        for(int i =0; i<n; i++){
            arr[i]= temp[i];
        }
    }

    public static void main(String[] args){
        
        int[] arr = {2,4,5};

        getUpdatedArray(arr);

        for (int x : arr) {
            System.out.print(x + " "); // 8 40 20
        }
    }
}
```
**Complexity:**
- Time: O(n)
- Space: O(n)
> Space is O(n) because the temp array stores n elements.

### In-Place using Previous Tracking:
```java
    public static void getUpdatedArray(int arr[]){

        int n = arr.length;
        int prev = 1;

        for(int i=0; i<n; i++){
            
            int curr = arr[i];
            int next = (i==n-1)? 1: arr[i+1];

            arr[i] = prev*curr*next;

            prev = curr;
        }
    }
```
**Complexity:**
- Time: O(n)
- Space: O(1)

---