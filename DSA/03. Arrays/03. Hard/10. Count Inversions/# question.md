# Count Inversions

**Difficulty**: Hard

## Problem Statement

Given an array of integers `arr` of size `N`, count the total number of inversions in the array. Two elements `arr[i]` and `arr[j]` form an inversion if `i < j` and `arr[i] > arr[j]`.

## Input

An integer `N` and an array `arr` of `N` integers.

## Output

Return the total number of inversions as a long integer.

## Examples

### Example 1

**Input**: `N = 5, arr = [2, 4, 1, 3, 5]`
**Output**: `3` (Inversions: `(2,1)`, `(4,1)`, `(4,3)`)

## Constraints

- `1 <= N <= 5 * 10^5`

## Expected Complexity

Time: O(N log N) using Modified Merge Sort
Space: O(N)

## Source

[TakeUForward - Count Inversions](https://takeuforward.org/data-structure/count-inversions-in-an-array)
