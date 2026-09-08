# Local Min and Max Sequence Ordering:

- Given an integer array arr[] representing a sequence of elevations, Return an array that includes:
   - The first and last elements of the array.
   - Every element where the trend of the sequence changes that is, where the direction of change switches from increasing to decreasing or from decreasing to increasing.
   - Note: Consecutive equal elements (flat segments) should be treated as a single elevation and ignored for detecting direction changes.

**Example:**
```text
Input: arr[] = [6, 4, 2, -2, 5, 3, 2, 2, -1, -1, 4]
Output: [6, -2, 5, -1, 4]
Explanation: Starts from 6 goes down to -2, -2 is the breaking point then 5, 5 is the breaking point then from 5 goes down to -1, -1 is breaking point then 4.

Input: arr[] = [6, 10, 11, 13]
Output: [6, 13]
Explanation: 6 is the starting point and 13 is last point.

Input:  arr[] = [1, 1]
Output: [1]
Explanation: Since we start from 1 but do not move further.
```
**Solution:** JAVA

```java
import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer> getMinMax( int[] arr ) {

        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        if ( n == 0) return ans;

        //Always add the 1st value
        ans.add(arr[0]);

        for(int i = 1; i < n-1; i++) {
            // check for a peak: strictly greater 
            if(arr[i] > ans.get(ans.size() - 1) && arr[i]>arr[i+1]) {
                
                ans.add(arr[i]);
            }

            // check for a valley: strictly smaller 
            if (ans.get(ans.size() - 1) > arr[i]  && arr[i] < arr[i + 1]){

                ans.add(arr[i]);
            }
        }

        // include the last point if it is different from the last added point
        if (ans.get(ans.size() - 1) != arr[n - 1]) {
            ans.add(arr[n - 1]);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {6, 4, 2, -2, 5, 3, 2, 2, -1, -1, 4};
        ArrayList<Integer> result = getMinMax(arr);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
```