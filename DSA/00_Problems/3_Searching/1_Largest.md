#  Largest element in an Array:

- Given an arr[] of elements of size n, return the largest element given in the array.

**Examples:**
```text
Input: arr[] = [10, 20, 4]
Output: 20
Explanation: Among 10, 20 and 4, 20 is the largest. 

Input: arr[] = [20, 10, 20, 4, 100]
Output: 100
```

**Program:** JAVA

```java
public class Main{

    public static int findLargest(int arr[], int n){

        int largest = arr[0];

        for(int i = 1; i < n; i++){

            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args){

        int arr[] = {10,15,14,18,90,11,20};
        int n = arr.length;

        System.out.print(findLargest(arr,n));
    }
}
```

**Complexity:**

- Time  → O(n)
- Space → O(1)

**Other Approch Using Methods:**

```java
import java.util.Arrays;
//---
    public static int findLargest(int arr[]){

        Arrays.sort(arr);
        return arr[arr.length - 1];

    }
```
---