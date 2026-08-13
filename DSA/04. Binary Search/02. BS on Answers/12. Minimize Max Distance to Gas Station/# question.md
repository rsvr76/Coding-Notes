# Minimize Max Distance to Gas Station

**Difficulty**: Hard

## Problem Statement

You are given a sorted array `stations` of size `n` representing the positions of gas stations on a 1D line, and an integer `k` representing the number of additional gas stations to place.

You can place the new gas stations anywhere (including non-integer coordinates). Find the minimum possible value of the maximum distance between adjacent gas stations after adding `k` stations.

Return the value rounded to 6 decimal places.

## Examples

### Example 1:

```
Input: stations = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], k = 9
Output: 0.500000
```

### Example 2:

```
Input: stations = [23, 24, 36, 39, 46, 56, 57, 65, 84, 98], k = 1
Output: 14.000000
```

## Constraints

- `2 <= stations.length <= 10^5`
- `0 <= stations[i] <= 10^9`
- `stations` is sorted in strictly increasing order.
- `1 <= k <= 10^6`

## Source

[TakeUForward - Minimize Max Distance to Gas Station](https://takeuforward.org/pascal-triangle/minimize-max-distance-to-gas-station/)
