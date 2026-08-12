# Painter's Partition Problem

## Problem Statement

Given `N` boards of varying lengths and `K` painters, find the minimum time required to paint all boards if a painter takes 1 unit of time per unit board length.

## Input

Boards array `boards`, painters `K`.

## Output

Minimum time required.

## Examples

### Example 1

**Input**:
```
boards = [10, 20, 30, 40], K = 2
```
**Output**:
```
60
```
**Explanation**: Painter 1 paints [10, 20, 30] (time 60), Painter 2 paints [40] (time 40).

## Constraints

- 1 <= N <= 10^5
- 1 <= K <= N

## Expected Complexity

Time: O(N log(sum_boards))
Space: O(1)

## Source

Striver A2Z / TakeUForward