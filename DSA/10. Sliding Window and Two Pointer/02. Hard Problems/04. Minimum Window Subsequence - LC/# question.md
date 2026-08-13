# Minimum Window Subsequence

**LeetCode #727** | **Difficulty**: Hard

## Problem Statement

Given strings `s1` and `s2`, return *the minimum contiguous substring* `w` *of* `s1` *such that* `s2` *is a **subsequence** of* `w`.

If there is no such window in `s1` that covers all characters in `s2`, return the empty string `""`. If there are multiple such minimum-length windows, return the one with the **left-most starting index**.

## Examples

### Example 1:

```
Input: s1 = "abcdebdde", s2 = "bde"
Output: "bcde"
Explanation: "bcde" is the minimum length substring of s1 where "bde" is a subsequence.
"bdde" is also a valid window, but "bcde" occurs earlier.
```

### Example 2:

```
Input: s1 = "jmeqksfrsdcmswbvaovndmwpsfcbwswb", s2 = "u"
Output: ""
```

## Constraints

- `1 <= s1.length <= 2 * 10^4`
- `1 <= s2.length <= 100`
- `s1` and `s2` consist of lowercase English letters.

## Source

[LeetCode - Minimum Window Subsequence](https://leetcode.com/problems/minimum-window-subsequence/)
