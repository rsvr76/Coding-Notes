# Leaders in an Array

## Problem Statement

Given an array of `N` integers, find all leaders in the array. An element is a leader if it is strictly greater than all elements to its right.

## Input

An array `arr` of `N` integers.

## Output

List of leader elements.

## Examples

### Example 1

**Input**:
```
arr = [10, 22, 12, 3, 0, 6]
```
**Output**:
```
[22, 12, 6]
```
**Explanation**: 22 > all to right, 12 > all to right, 6 is rightmost.

## Constraints

- 1 <= N <= 10^5

## Expected Complexity

Time: O(N)
Space: O(N)

## Source

Striver A2Z / TakeUForward