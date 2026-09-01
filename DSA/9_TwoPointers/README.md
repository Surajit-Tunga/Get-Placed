# Two Pointer:

- The Two-Pointers Technique is a simple yet powerful strategy where you use two indices (pointers) that traverse a data structure - such as an array, list, or string - either toward each other or in the same direction to solve problems more efficiently.

## Example Problem - Sum of Pair Equal to Target:

- Given a sorted array arr (sorted in ascending order) and a target, find if there exists any pair of elements (arr[i], arr[j]) such that their sum is equal to the target.

**Example:** 
```text
Input: arr[] = [10, 20, 35, 50], target =70
Output:  true
Explanation : There is a pair (20, 50) with given target.

Input: arr[] = [10, 20, 30], target =70
Output :  false
Explanation : There is no pair with sum 70

Input: arr[] = [-8, 1, 4, 6, 10, 45], target = 16
Output: true
Explanation : There is a pair (6, 10) with given target.
```

- The very basic approach is to generate all the possible pairs and check if any of them add up to the target value. To generate all pairs, we simply run two nested loops. But There `Time Complexity` will be `O(n2)`.

**Two-Pointer Technique - O(n) time and O(1) space:**

```text
The idea of this technique is to begin with two corners of the given array. We use two index variables left and right to traverse from both corners.

Initialize: left = 0, right = n - 1
Run a loop while left < right, do the following inside the loop

Compute current sum, sum = arr[left] + arr[right]
If the sum equals the target, we’ve found the pair.
If the sum is less than the target, move the left pointer to the right to increase the sum.
If the sum is greater than the target, move the right pointer to the left to decrease the sum.
```

**Program:** JAVA

```java
public class Main {

    public static boolean twoSum(int[] arr, num){

        int left = 0;
        int right = arr.length - 1;

        while (left < right){

            if (arr[left] + arr[right] == num){
                return true;
            } else if (arr[left] + arr[right] > num){
                right --;
            } else if (arr[left] + arr[right] < num){
                left ++;
            }
        }

        return false;
    }
}
```
---