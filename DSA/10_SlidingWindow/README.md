# Sliding Window Technique:

- Sliding Window Technique is a method used to solve problems that involve subarray or substring or window.

  * Instead of repeatedly iterating over the same elements, the sliding window maintains a range (or “window”) that moves step-by-step through the data, updating results incrementally.
  * The main idea is to use the results of previous window to do computations for the next window.
  * Commonly used for problems like finding subarrays with a specific sum, finding the longest substring with unique characters, or solving problems that require a fixed-size window to process elements efficiently.

## Example Problem - Maximum Sum of a Subarray with K Elements:

- Given an array arr[] and an integer k, we need to calculate the maximum sum of a subarray having size exactly k.

**Example:**
```text
Input  : arr[] = [5, 2, -1, 0, 3], k = 3
Output : 6
Explanation : We get maximum sum by considering the subaarray [5, 2 , -1]

Input  : arr[] = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4 
Output : 39
Explanation : We get maximum sum by adding subarray [4, 2, 10, 23] of size 4.
```

### Normal Two Loop Approch:

```java
public class Main {

    public static int getMaxSum(int[] nums, int k){

        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        if (n <= k){
            return -1;
        }

        for (int i = 0; i <= n-k; i++) {

            int sum = 0;

            for (int j = i; j < i+k; j++ ){
                sum += nums[j];
            }

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args){

        int nums[] = {1,2,3,4,5,6,7};
        int k = 2;
        
        System.out.print(getMaxSum(nums,k));
    }
}
```
**Complexity:**

- Time: O(n × k)
- Space: O(1)

### Sliding Window Approch:

**Idea:**
```
We compute the sum of the first k elements out of n terms using a linear loop
and store the sum in variable window_sum.

Then we will traverse linearly over the array till it reaches the end and
simultaneously keep track of the maximum sum.

To get the current sum of a block of k elements, just subtract the first
element from the previous block and add the last element of the current block.

Example:

arr = {1, 2, 3, 4, 5}
k = 3

First window:
{1, 2, 3}
window_sum = 1 + 2 + 3 = 6

Now slide the window one position:

Previous window = {1, 2, 3}
Remove 1 and add 4

window_sum = 6 - 1 + 4 = 9

Current window = {2, 3, 4}

Slide again:

Previous window = {2, 3, 4}
Remove 2 and add 5

window_sum = 9 - 2 + 5 = 12

Current window = {3, 4, 5}

Maximum sum = 12
```
```java
public class Main {

    public static int getMaxSum(int[] nums, int k){

        int n = nums.length;
        int maxSum = 0;

        if (n <= k){
            return -1;
        }

        for (int i = 0; i < k; i++){
            maxSum += nums[i];
        }

        int windowSum = maxSum;

        for(int i = k; i < n; i++){

            windowSum += nums[i] - nums [i-k];

            maxSum = Math.max(maxSum, windowSum);
        }         

        return maxSum;
    }

    public static void main(String[] args){

        int nums[] = {1,2,3,4,5,6,7};
        int k = 2;
        
        System.out.print(getMaxSum(nums,k));
    }
}
```

**Complexity:**

- Time: O(n)
- Space: O(1)

---