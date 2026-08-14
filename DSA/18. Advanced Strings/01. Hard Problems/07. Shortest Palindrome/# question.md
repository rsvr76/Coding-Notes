# Shortest Palindrome

**Difficulty**: Hard

## Problem Statement

You are given a string `s`. You can convert `s` to a palindrome by adding characters **in front of it**.

Return the **shortest palindrome** you can find by performing this transformation.

## Examples

### Example 1:

```
Input: s = "aacecaaa"
Output: "aaacecaaa"
```

### Example 2:

```
Input: s = "abcd"
Output: "dcbabcd"
```

## Constraints

- `0 <= s.length <= 5 * 10^4`
- `s` consists of lowercase English letters only.

## Approach

Use the **KMP algorithm** (LPS array):
1. Build `temp = s + "#" + reverse(s)`
2. Compute LPS array for `temp`
3. The last value of LPS = length of longest palindromic prefix of `s`
4. Prepend `reverse(s[lps_last:])` to `s`

**Time**: O(n) | **Space**: O(n)

## Source

[Shortest Palindrome - LeetCode](https://leetcode.com/problems/shortest-palindrome/) | [TUF Reference](https://takeuforward.org/plus/dsa/problems/shortest-palindrome)
