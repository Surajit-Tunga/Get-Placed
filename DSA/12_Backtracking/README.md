# Introduction to Backtracking:

- Backtracking is a problem-solving algorithmic technique that involves finding a solution incrementally by trying different options and undoing them if they lead to a dead end.
   - Backtracking is used to explore multiple possibilities in problems such as finding a path in a maze or solving puzzles like Sudoku, by systematically trying different choices.
   - When a choice leads to a dead end, the algorithm backtracks to the previous decision point and tries a different path, avoiding unnecessary exploration of invalid solutions.

   - The idea is simple:
       - **Choose** – Start by making a choice that could lead toward a solution.
       - **Explore** – Recursively move forward with this choice.
       - **Check validity** – If the choice leads to an invalid state, undo it (backtrack) and try another option.
       - **Repeat** – Continue this process until all possibilities are explored or a valid solution is found.

**Backtracking vs Recursion:** Backtracking uses recursion to explore different possibilities. Recursion explores all possible paths, without worrying about whether they are valid until the end.

## Example - Permutations of given String:

- Given a string s. Find all permutations  of a given string. Return the permutations in lexicographically non-decreasing order.

**Examples:**
```text
Input:  s = "ABC"
Output: ["ABC", "ACB", "BAC", "BCA", "CAB", "CBA"]

Input: s = "XY"
Output: ["XY", "YX"]

Input: s = "AAA"
Output: ["AAA", "AAA", "AAA", "AAA", "AAA", "AAA"] 
```

![](/DSA//12_Backtracking/abc.png)

---