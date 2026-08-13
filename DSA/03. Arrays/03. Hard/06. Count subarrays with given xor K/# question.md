# Count subarrays with given xor K

**Difficulty**: Hard

## Problem Statement

Given an array of integers `arr` of size `N` and an integer `K`, find the total number of contiguous subarrays having bitwise XOR equal to `K`.

## Input

An integer `N`, an array `arr` of `N` integers, and an integer `K`.

## Output

Return an integer representing the count of subarrays with XOR equal to `K`.

## Examples

### Example 1

**Input**: `arr = [4, 2, 2, 6, 4], K = 6`
**Output**: `4`

## Constraints

- `1 <= N <= 10^5`

## Expected Complexity

Time: O(N) using Prefix XOR Hash Map
Space: O(N)

## Source

[TakeUForward - Count subarrays with given xor K](https://takeuforward.org/data-structure/count-the-number-of-subarrays-with-given-xor-k/)
