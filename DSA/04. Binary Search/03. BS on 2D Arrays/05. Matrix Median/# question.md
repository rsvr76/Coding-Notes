# Median in a Row-wise Sorted Matrix

**Difficulty**: Hard

## Problem Statement

Given a 2D matrix of dimensions `r x c` where each row is sorted in non-decreasing order and `r * c` is always odd, find the median of the matrix.

The median is the element at position `(r * c + 1) / 2` when all elements are sorted in non-decreasing order.

## Examples

### Example 1:

```
Input: matrix = [[1, 3, 5], [2, 6, 9], [3, 6, 9]]
Output: 5
Explanation: Sorted elements are 1, 2, 3, 3, 5, 6, 6, 9, 9. The median is 5.
```

### Example 2:

```
Input: matrix = [[1], [2], [3]]
Output: 2
```

## Constraints

- `1 <= r, c <= 2000`
- `r * c` is odd.
- `1 <= matrix[i][j] <= 2000`

## Source

[TakeUForward - Matrix Median](https://takeuforward.org/data-structure/median-of-row-wise-sorted-matrix/)
