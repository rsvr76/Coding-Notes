 Sort an Array of 0's, 1's and 2's

**Difficulty**: Medium

## Problem Statement

Given an array `arr` of size `N` containing only `0`s, `1`s, and `2`s, sort the array in non-decreasing order **in-place** without using any library's built-in sort function.

This problem is commonly solved using the **Dutch National Flag Algorithm** (3-pointer approach: `low`, `mid`, `high`).

## Input

- An integer `N` representing the size of the array.
- An array `arr` of `N` integers containing only values `0`, `1`, or `2`.

## Output

- Sort the array `arr` in-place so that all `0`s come first, followed by all `1`s, and then all `2`s.

## Examples

### Example 1

**Input**:

```text
N = 6
arr = [2, 0, 2, 1, 1, 0]
```

**Output**:

```text
[0, 0, 1, 1, 2, 2]
```

**Explanation**: After sorting, all zeros are at the beginning, followed by ones, and then twos.

### Example 2

**Input**:

```text
N = 5
arr = [2, 0, 1]
```

**Output**:

```text
[0, 1, 2]
```

**Explanation**: Sorted array in ascending order.

## Constraints

- `1 <= N <= 10^5`
- `arr[i]` is either `0`, `1`, or `2`.

## Expected Complexity

- **Time**: `O(N)` (Single pass using Dutch National Flag algorithm)
- **Space**: `O(1)` (In-place sorting)

## Source

[TakeUForward - Sort an array of 0&#39;s 1&#39;s and 2&#39;s](https://takeuforward.org/plus/dsa/problems/sort-an-array-of-0's-1's-and-2's)
