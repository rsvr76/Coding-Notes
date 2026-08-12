# Aggressive Cows (Maximize Minimum Distance)

## Problem Statement

Given `N` stall positions and `K` aggressive cows, place cows in stalls such that minimum distance between any two cows is maximized.

## Input

Stalls array `stalls`, cows count `K`.

## Output

Maximum minimum distance.

## Examples

### Example 1

**Input**:
```
stalls = [1, 2, 8, 4, 9], K = 3
```
**Output**:
```
3
```
**Explanation**: Place cows at 1, 4, 8 or 1, 4, 9 -> min dist 3.

## Constraints

- 2 <= N <= 10^5
- 2 <= K <= N

## Expected Complexity

Time: O(N log(max_dist))
Space: O(1)

## Source

[TakeUForward - Aggressive Cows](https://takeuforward.org/plus/dsa/problems/aggressive-cows)
