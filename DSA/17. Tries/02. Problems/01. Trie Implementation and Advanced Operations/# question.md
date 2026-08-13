# Implement Trie II (Prefix Tree with Advanced Operations)

**Difficulty**: Medium

## Problem Statement

Implement a **Trie** data structure supporting the following operations:
1. `insert(word)`: Inserts string `word` into the trie.
2. `countWordsEqualTo(word)`: Returns the number of instances of string `word` in the trie.
3. `countWordsStartingWith(prefix)`: Returns the number of words in the trie that have the prefix `prefix`.
4. `erase(word)`: Erases one instance of string `word` from the trie.

## Examples

### Example 1:

```
Input:
insert("apple")
insert("apple")
countWordsEqualTo("apple") -> Output: 2
countWordsStartingWith("app") -> Output: 2
erase("apple")
countWordsEqualTo("apple") -> Output: 1
```

## Constraints

- `1 <= word.length, prefix.length <= 1000`
- All strings consist of lowercase English letters.

## Source

[TakeUForward - Implement Trie II](https://takeuforward.org/data-structure/implement-trie-ii/)
