# Number of Islands II

**LeetCode #305** | **Difficulty**: Hard

## Problem Statement

You are given a 2D grid of size `m x n` initially filled with water (`0`). You may perform an `addLand` operation which turns the water at position `(r, c)` into land (`1`).

You are given a 2D array `positions` where `positions[i] = [r_i, c_i]` is the position at which you should operate the `i`-th operation.

Return *an array of integers `ans` where `ans[i]` is the number of islands after the `i`-th operation*.

An **island** is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

## Examples

### Example 1:

```
Input: m = 3, n = 3, positions = [[0,0],[0,1],[1,2],[2,1]]
Output: [1,1,2,3]
Explanation:
Initially, the 2d grid is filled with water.
- Operation #1: addLand(0, 0) turns the water at (0,0) into land. Total islands = 1.
- Operation #2: addLand(0, 1) turns the water at (0,1) into land. Total islands = 1.
- Operation #3: addLand(1, 2) turns the water at (1,2) into land. Total islands = 2.
- Operation #4: addLand(2, 1) turns the water at (2,1) into land. Total islands = 3.
```

## Constraints

- `1 <= m, n, positions.length <= 10^4`
- `1 <= m * n <= 10^4`
- `positions[i].length == 2`
- `0 <= r_i < m`
- `0 <= c_i < n`

## Source

[LeetCode - Number of Islands II](https://leetcode.com/problems/number-of-islands-ii/)
