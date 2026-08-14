# LRU Cache (Least Recently Used)

**Difficulty**: Hard

## Problem Statement

Design a data structure for **Least Recently Used (LRU) Cache**. It should support `get(key)` and `put(key, value)` in $O(1)$ average time complexity.

## Examples

### Example 1:
```
Input:
LRUCache cache = new LRUCache(2);
cache.put(1, 1);
cache.put(2, 2);
cache.get(1);       // returns 1
cache.put(3, 3);    // evicts key 2
cache.get(2);       // returns -1
```

## Constraints

- `1 <= capacity <= 3000`

## Source

[LRU Cache](https://takeuforward.org/data-structure/lru-cache-implementation/)
