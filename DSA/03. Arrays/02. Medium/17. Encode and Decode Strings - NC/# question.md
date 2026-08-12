# Encode and Decode Strings

**LeetCode #271** | **Difficulty**: Medium

## Problem Statement

Design an algorithm to encode a list of strings to a single string. The encoded string is then sent over the network and decoded back into the original list of strings.

Implement two functions:
1. `encode(strs)`: Encodes a list of strings into a single string.
2. `decode(s)`: Decodes a single string back into the original list of strings.

The scheme must support any possible ASCII / UTF-8 characters, including special characters like delimiter symbols or numbers.

## Input

- For `encode`: A list of strings `strs`.
- For `decode`: A single string `s` produced by `encode`.

## Output

- `encode` returns a string.
- `decode` returns the original list of strings `strs`.

## Examples

### Example 1

**Input**:
```text
strs = ["neet", "code", "love", "you"]
```

**Output**:
```text
["neet", "code", "love", "you"]
```

**Explanation**:
The list of strings is encoded into a single string (e.g., `"4#neet4#code4#love3#you"`) and then successfully decoded back into the original array.

### Example 2

**Input**:
```text
strs = ["we", "say", ":", "yes"]
```

**Output**:
```text
["we", "say", ":", "yes"]
```

## Constraints

- `0 <= strs.length <= 200`
- `0 <= strs[i].length <= 200`
- `strs[i]` consists of any possible ASCII characters.

## Expected Complexity

- **Time**: `O(N)` where `N` is the total number of characters across all strings in the list.
- **Space**: `O(1)` auxiliary space (excluding space needed for the output).

## Source

[NeetCode - Encode and Decode Strings](https://leetcode.com/problems/encode-and-decode-strings/)
