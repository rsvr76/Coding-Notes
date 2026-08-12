# Two Sum

**Difficulty**: Easy / Medium

## Problem Statement

Given an array of integers `arr` of size `N` and an integer `target`, determine if there exist two elements in the array such that their sum equals `target`. 

There are two common variants of this problem:
1. **Variant 1**: Return `"YES"` if there exist two elements whose sum is equal to `target`, otherwise return `"NO"`.
2. **Variant 2**: Return the 0-based indices `[i, j]` of the two numbers such that `arr[i] + arr[j] == target`.

## Input

- An integer `N` representing the size of the array.
- An array `arr` of `N` integers.
- An integer `target`.

## Output

- **Variant 1**: Return `"YES"` or `"NO"`.
- **Variant 2**: Return an array/pair of indices `[i, j]`. If no such pair exists, return `[-1, -1]`.

## Examples

### Example 1

**Input**:
```text
N = 5
arr = [2, 6, 5, 8, 11]
target = 14
```

**Output**:
```text
YES
```

**Explanation**: `arr[1] + arr[3] = 6 + 8 = 14`. Thus, the pair `(6, 8)` sums to `14`. Indices are `[1, 3]`.

### Example 2

**Input**:
```text
N = 5
arr = [2, 6, 5, 8, 11]
target = 15
```

**Output**:
```text
NO
```

**Explanation**: There is no pair in the array that sums up to `15`.

## Constraints

- `1 <= N <= 10^5`
- `-10^9 <= arr[i] <= 10^9`
- `-10^9 <= target <= 10^9`

## Expected Complexity

- **Time**: `O(N)` using Hashing, or `O(N log N)` using Two Pointers on a sorted array.
- **Space**: `O(N)` for Hash Map, or `O(1)` auxiliary space if using Two Pointers.

## Source

[TakeUForward - Two Sum](https://takeuforward.org/plus/dsa/problems/two-sum)
