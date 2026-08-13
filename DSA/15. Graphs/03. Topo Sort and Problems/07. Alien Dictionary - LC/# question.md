# Alien Dictionary

**LeetCode #269** | **Difficulty**: Hard

## Problem Statement

There is a new alien language that uses the Latin alphabet. However, the order among the letters is unknown to you.

You are given a list of strings `words` from the alien language's dictionary, where the strings in `words` are **sorted lexicographically** by the rules of this new language.

Return *a string of the unique letters in the new alien language sorted in **lexicographically increasing order** by the new language's rules. If there is no solution, return `""`. If there are multiple solutions, return **any of them***.

## Examples

### Example 1:

```
Input: words = ["wrt","wrf","er","ett","rftt"]
Output: "wertf"
```

### Example 2:

```
Input: words = ["z","x"]
Output: "zx"
```

### Example 3:

```
Input: words = ["z","x","z"]
Output: ""
Explanation: The order is invalid, so return "".
```

## Constraints

- `1 <= words.length <= 100`
- `1 <= words[i].length <= 100`
- `words[i]` consists of only lowercase English letters.

## Source

[LeetCode - Alien Dictionary](https://leetcode.com/problems/alien-dictionary/)
