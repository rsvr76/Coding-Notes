# Topological Sort (DFS)

**Difficulty**: Medium

## Problem Statement

Given a Directed Acyclic Graph (DAG) with `V` vertices and `E` edges, find a **Topological Sort** of the graph using Depth First Search (DFS).

A Topological Sort is a linear ordering of vertices such that for every directed edge `u -> v`, vertex `u` comes before `v` in the ordering.

## Examples

### Example 1:

```
Input: V = 6, E = 6, edges = [[5, 2], [5, 0], [4, 0], [4, 1], [2, 3], [3, 1]]
Output: [5, 4, 2, 3, 1, 0]
```

## Constraints

- `1 <= V <= 10^4`
- `0 <= E <= 10^4`

## Source

[TakeUForward - Topological Sort](https://takeuforward.org/data-structure/topological-sort-algorithm-dfs-g-21/)
