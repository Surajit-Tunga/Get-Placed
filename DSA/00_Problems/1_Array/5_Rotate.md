#  Rotate Array [Leetcode-189: Medium]

- Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

**Example:**
```text
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
```

**Solution:**
```java
    public static void rotateArray(int[] nums, int k){

        int n = nums.length;

        for (int i = 1; i <= k; i++) {
            int temp = nums[n-1];
            for(int j = n-1; j > 0; j--){
                nums[j] = nums [j-1];
            }
            nums[0] = temp;
        }
    }

```
**Time Complexity** of this program is O(n*k).

- Error: "Time Limit Exceeded"

**Optimal Solution:**

```java

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
```

**Explaination:**

```text
Rotate Array — Reversal Approach

Reversal:

[1, 2, 3, 4, 5]
 ↑           ↑
left        right

[5, 2, 3, 4, 1]
    ↑       ↑
   left    right

[5, 4, 3, 2, 1]
       ↑
     left/right

Rotate by Kth Position:

Example:
nums = [1, 2, 3, 4, 5, 6, 7]
k = 3

We want to rotate the array 3 positions to the right:

[5, 6, 7, 1, 2, 3, 4]


Step 1: Reverse the whole array

[1, 2, 3, 4, 5, 6, 7]
 ↓                       ↓
[7, 6, 5, 4, 3, 2, 1]


Step 2: Reverse the first k elements

[7, 6, 5 | 4, 3, 2, 1]
 ↓       ↓
[5, 6, 7 | 4, 3, 2, 1]


Step 3: Reverse the remaining elements

[5, 6, 7 | 4, 3, 2, 1]
            ↓           ↓
[5, 6, 7 | 1, 2, 3, 4]


Final:
[5, 6, 7, 1, 2, 3, 4]


Why does this work?

Suppose the array is divided into two parts:

[1, 2, 3, 4 | 5, 6, 7]
       A            B

We want:

[B | A]

First, reverse the whole array:

[B reversed | A reversed]

[7, 6, 5 | 4, 3, 2, 1]

Then reverse B:

[B | A reversed]

[5, 6, 7 | 4, 3, 2, 1]

Then reverse A:

[B | A]

[5, 6, 7 | 1, 2, 3, 4]

So we get the required rotation.


Why k = k % n?

If n = 7 and k = 10:

10 % 7 = 3

Rotating 10 times is the same as rotating 3 times.
```
**Complexity:**
```text
There are 3 separate loops, NOT nested loops.

First reverse  → O(n)
Second reverse → O(k)
Third reverse  → O(n-k)

Total:

O(n) + O(k) + O(n-k)
= O(n + k + n - k)
= O(2n)
= O(n)


Why is it NOT O(n²)?

Because the loops are separate:

Loop 1 → finishes
Loop 2 → starts
Loop 3 → starts

They do NOT run inside each other.

Complexity:

Time:  O(n)
Space: O(1)
```

---