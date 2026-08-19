# Array Reverse

- Reverse an array arr[]. Reversing an array means rearranging the elements such that the first element becomes the last, the second element becomes second last and so on.

**Examples:**
```text 
Input: arr[] = [1, 4, 3, 2, 6, 5]  
Output:  [5, 6, 2, 3, 4, 1]
Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.

Input: arr[] = [4, 5, 1, 2]
Output: [2, 1, 5, 4]
Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.
```

**Program:** 

```java

public class Main {

    public static void reverseArray(int arr[], int n){

        int[] temp = new int[n];

        for (int i = n-1; i >= 0; i--){
            temp[n-1-i] = arr [i];
        }

        for (int i = 0; i < n; i++){
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        int n = arr.length;

        reverseArray(arr, n);

        for (int i = 0; i < n; i++){
            System.out.print(arr[i]);
        }
    }
}
```

**Complexity:**
- Time: O(n)
- Space: O(n) [temporary array of size n]

### Optimized Using Two Pointers:

