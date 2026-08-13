# Implement Lower Bound

**Difficulty**: Easy

## Problem Statement

Given a sorted array of `n` integers and a target value `x`, write a program to find the **lower bound** of `x`.

The lower bound of `x` is defined as the smallest index `i` such that `arr[i] >= x`. If no such index exists, return `n`.

## Examples

### Example 1:

```
Input: arr = [1, 2, 8, 10, 11, 12, 19], x = 5
Output: 2
Explanation: 8 is the smallest element >= 5, located at index 2.
```

### Example 2:

```
Input: arr = [1, 2, 8, 10, 11, 12, 19], x = 20
Output: 7
Explanation: No element >= 20 exists, so return n = 7.
```

## Constraints

- `1 <= n <= 10^5`
- `-10^9 <= arr[i], x <= 10^9`
- `arr` is sorted in non-decreasing order.

## Source

[TakeUForward - Implement Lower Bound](https://takeuforward.org/arrays/implement-lower-bound/)
