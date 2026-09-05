# Best Time to Buy and Sell Stock [Leetcode-121: Easy]

- You are given an array prices where prices[i] is the price of a given stock on the ith day.
- You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
- Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

**Example 1:**
```text
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
```

**Constraints:**
```text
1 <= prices.length <= 105
0 <= prices[i] <= 104
```

**Idea:**
```text
Input: prices = [7, 1, 5, 3, 6, 4]

Initial:
minPrice = 7
maxProfit = 0

Iteration 1 → price = 1
minPrice = min(7, 1) = 1
profit = 1 - 1 = 0
maxProfit = max(0, 0) = 0

Iteration 2 → price = 5
minPrice = min(1, 5) = 1
profit = 5 - 1 = 4
maxProfit = max(0, 4) = 4

Iteration 3 → price = 3
minPrice = min(1, 3) = 1
profit = 3 - 1 = 2
maxProfit = max(4, 2) = 4

Iteration 4 → price = 6
minPrice = min(1, 6) = 1
profit = 6 - 1 = 5
maxProfit = max(4, 5) = 5

Iteration 5 → price = 4
minPrice = min(1, 4) = 1
profit = 4 - 1 = 3
maxProfit = max(5, 3) = 5

Output: 5
```

**Solution:** JAVA
```java
public int maxProfit(int[] prices){
    
    int minPrice = prices[0];
    int maxProfit = 0;

    for (int i = 1; i < prices.length; i++) {

        minPrice = Math.min(minPrice, prices[i]);

        int profit = prices[i] - minPrice;

        maxProfit = Math.max(maxProfit, profit);
    }

    return maxProfit;
}
```
**Complexity:**

- Time: O(n)
- Space: O(1)
---