# Second Largest Element in an Array:

- Given an array of positive integers arr[] of size n, the task is to find second largest distinct element in the array.

> Note: If the second largest element does not exist, return -1.

**Examples:**
```text
Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.

Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.

Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 there is no second largest element.
```

**Solution:** JAVA

```java
public class Main {

    public static int getSecondLargest (int[] nums) {

        int n = nums.length;

        int max = -1;
        int secMax = -1;
        
        for (int i = 0; i < n; i ++){
            
            if ( nums[i] > max) {
                max = nums [i];
            }
        }

        for (int i = 0; i < n; i ++){
            
            if ( nums[i] < max && nums[i] > secMax) {
                secMax = nums [i];
            }
        }

        return secMax;
    }

    public static void main(String[] args){

        int arr[] = {10,15,14,18,90,11,20};
        
        System.out.print(getSecondLargest(arr));
    }
}
```

**Complexity:** 
- Time: O(n)
- Space: O(1)

### One pass approch:

```java
    public static int getSecondLargest (int[] nums) {

        int n = nums.length;

        int max = -1;
        int secMax = -1;
        
        for (int i = 0; i < n; i ++){
            
            if ( nums[i] > max) {
                secMax = max;
                max = nums [i];
            } else if (nums[i] < max && nums[i] > secMax) {
                secMax = nums[i];
            }
        }     

        return secMax;
    }
```

**But it cant handle neg num:**

```java
public static int getSecondLargest(int[] nums) {

    int max = Integer.MIN_VALUE;
    int secMax = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length; i++) {

        if (nums[i] > max) {
            secMax = max;
            max = nums[i];
        }
        else if (nums[i] < max && nums[i] > secMax) {
            secMax = nums[i];
        }
    }
    if (secMax == Integer.MIN_VALUE) return -1;

    return secMax;
}
```

---