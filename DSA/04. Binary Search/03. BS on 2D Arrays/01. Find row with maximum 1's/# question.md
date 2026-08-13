# Find Row with Maximum Number of 1's

**Difficulty**: Medium

## Problem Statement

Given a boolean 2D array `matrix` of size `n x m` where each row is sorted in non-decreasing order (containing `0`s followed by `1`s), find the row index (0-indexed) with the maximum number of `1`s.

If no row contains any `1`, return `-1`. If multiple rows have the same maximum number of `1`s, return the smallest row index.

## Examples

### Example 1:

```
Input: matrix = [[0, 1, 1, 1], [0, 0, 1, 1], [1, 1, 1, 1], [0, 0, 0, 0]]
Output: 2
Explanation: Row 2 contains 4 ones, which is the maximum.
```

### Example 2:

```
Input: matrix = [[0, 0], [0, 0]]
Output: -1
```

## Constraints

- `1 <= n, m <= 1000`
- `matrix[i][j]` is either `0` or `1`.

## Source

[TakeUForward - Find Row with Maximum 1's](https://takeuforward.org/arrays/find-the-row-with-maximum-number-of-1s/)
