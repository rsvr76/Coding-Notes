# Implement Upper Bound

## Problem Statement

Given a sorted array of `N` integers and a target `X`, find the upper bound index of `X` (smallest index `i` such that `arr[i] > X`).

## Input

Sorted array `arr`, integer `X`.

## Output

Index `i` (0 to N).

## Examples

### Example 1

**Input**:
```
arr = [1, 2, 8, 10, 11, 12, 19], X = 5
```
**Output**:
```
2
```
**Explanation**: arr[2] = 8 > 5.

## Constraints

- 1 <= N <= 10^5

## Expected Complexity

Time: O(log N)
Space: O(1)

## Source

Striver A2Z / TakeUForward