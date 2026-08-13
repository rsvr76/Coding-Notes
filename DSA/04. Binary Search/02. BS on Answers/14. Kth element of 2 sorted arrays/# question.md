# Kth Element of Two Sorted Arrays

**Difficulty**: Medium

## Problem Statement

Given two sorted arrays `arr1` and `arr2` of size `m` and `n` respectively, and an element `k`. The task is to find the element that would be at the `k`-th position of the final sorted array formed by merging `arr1` and `arr2`.

Expected Time Complexity: `O(log(min(m, n)))`.

## Examples

### Example 1:

```
Input: arr1 = [2, 3, 6, 7, 9], arr2 = [1, 4, 8, 10], k = 5
Output: 6
Explanation: The final sorted array would be [1, 2, 3, 4, 6, 7, 8, 9, 10]. The 5th element is 6.
```

### Example 2:

```
Input: arr1 = [100, 112, 256, 349, 770], arr2 = [72, 86, 113, 119, 265, 445, 892], k = 7
Output: 256
```

## Constraints

- `1 <= m, n <= 10^6`
- `1 <= arr1[i], arr2[i] <= 10^9`
- `1 <= k <= m + n`

## Source

[TakeUForward - Kth Element of Two Sorted Arrays](https://takeuforward.org/data-structure/k-th-element-of-two-sorted-arrays/)
