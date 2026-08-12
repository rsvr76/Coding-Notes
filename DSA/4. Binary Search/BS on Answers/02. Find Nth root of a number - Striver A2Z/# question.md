# N-th Root of an Integer M

## Problem Statement

Given two integers `N` and `M`, find the `N`-th root of `M` (an integer `ans` such that `ans^N == M`). Return `-1` if not an exact integer.

## Input

Integers `N` and `M`.

## Output

Exact `N`-th root integer or `-1`.

## Examples

### Example 1

**Input**:
```
N = 3, M = 27
```
**Output**:
```
3
```
**Explanation**: 3^3 = 27.

## Constraints

- 1 <= N <= 30
- 1 <= M <= 10^9

## Expected Complexity

Time: O(N log M)
Space: O(1)

## Source

Striver A2Z / TakeUForward