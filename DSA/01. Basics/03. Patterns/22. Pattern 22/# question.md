# Pattern 22: The Number Pattern

**Difficulty**: Easy

## Problem Statement

Given an integer `N`, print a square matrix of size `(2*N - 1) x (2*N - 1)` with concentric numbers decreasing from `N` down to `1` at the center.

## Input

An integer `N`.

## Output

Print `2*N - 1` rows of concentric numbers.

## Examples

### Example 1

**Input**: `N = 4`  
**Output**:
```
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
```

## Constraints

- `1 <= N <= 20`

## Expected Complexity

Time: O(N^2)
Space: O(1)

## Source

[TakeUForward - Pattern 22](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/)
