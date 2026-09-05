# Prefix Sum Technique: 

- Prefix Sum is used to solve problems involving the sum of elements between two indices in an array or operations on subarrays.
- Using the prefix sum technique:
     - After a one-time preprocessing in O(n) time, each range sum query can be answered in O(1) time.
     - Thus, if there are q queries, the overall time complexity becomes O(n + q).

**Prefix Sum:** A prefix sum is the cumulative sum of elements of an array from the beginning up to a given index. It represents the total of all elements from index 0 to i.

## Explaination:

```text
Suppose we have:

arr = [2, 4, 1, 5, 3]

Imagine we have queries asking for the sum between two indices.

For example:

Query 1: sum from index 1 to 3
Query 2: sum from index 2 to 4
```

**Without Prefix Sum:**

```text
For query [1, 3]:

4 + 1 + 5 = 10

For query [2, 4]:

1 + 5 + 3 = 9

Every query may require going through multiple elements.

So if there are q queries, the worst-case complexity can become: O(n × q)
```
**Build the Prefix Sum Array:**

```text
We create another array where:

prefix[i] = sum of elements from index 0 to i

For:

arr = [2, 4, 1, 5, 3]

we get:

prefix = [2, 6, 7, 12, 15]

Because:

prefix[0] = 2

prefix[1] = 2 + 4 = 6

prefix[2] = 2 + 4 + 1 = 7

prefix[3] = 2 + 4 + 1 + 5 = 12

prefix[4] = 2 + 4 + 1 + 5 + 3 = 15

Building this array takes O(n).
```

**Answer a Range Query in O(1):**

```text
Suppose we want:

sum(1, 3)

That means:

4 + 1 + 5 = 10

Using prefix sum:

prefix[3] - prefix[0]
= 12 - 2
= 10

So instead of adding 4 + 1 + 5, we simply do one subtraction.

Therefore:

Range Sum(l, r) = prefix[r] - prefix[l - 1]

For l = 0, simply:

Range Sum(0, r) = prefix[r]
```
**Complexity:** O(n+q) where q is number of query.

## Prefix Sum Array - Implementation:

- Given an array arr[], Find the prefix sum of the array. A prefix sum array is another array prefixSum[] of the same size, such that prefixSum[i] is arr[0] + arr[1] + arr[2] . . . arr[i].

**Examples:** 

```text
Input: arr[] = [10, 20, 10, 5, 15]
Output: [10, 30, 40, 45, 60]
Explanation: For each index i, add all the elements from 0 to i:
prefixSum[0] = 10, 
prefixSum[1] = 10 + 20 = 30, 
prefixSum[2] = 10 + 20 + 10 = 40 and so on.

Input: arr[] = [30, 10, 10, 5, 50]
Output: [30, 40, 50, 55, 105]
Explanation: For each index i, add all the elements from 0 to i:
prefixSum[0] = 30, 
prefixSum[1] = 30 + 10 = 40,
prefixSum[2] = 30 + 10+ 10 = 50 and so on.
```

**Program:** JAVA

```java
import java.util.Arrays;

public class Main {

    public static int[] getPrefixSum (int[] arr) {

        int n  = arr.length;
        int[] PrefixSum = new int[n];

        PrefixSum[0] = arr[0]; 
        
        for(int i = 1; i < n; i++){

            PrefixSum[i] = arr[i] + PrefixSum[i-1];
        }

        return PrefixSum;
    }

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6};

        System.out.print(Arrays.toString(getPrefixSum(arr)));  // [1, 3, 6, 10, 15, 21]
    }
}
```
**Complexity:**

- Time: O(n)
- Space: O(n)
---