# Number of Connected Components In An Undirected Graph

**LeetCode #323** | **Difficulty**: Medium

## Problem Statement

You have a graph of `n` nodes labeled from `0` to `n - 1`. You are given an integer `n` and an array `edges` where `edges[i] = [ai, bi]` indicates that there is an undirected edge between node `ai` and node `bi`.

Return the total number of **connected components** in the graph.

## Input

- An integer `n` representing the number of nodes.
- A 2D list of integers `edges` where each element is a pair `[u, v]`.

## Output

- An integer representing the total count of connected components.

## Examples

### Example 1

**Input**:
```text
n = 5
edges = [[0,1], [1,2], [3,4]]
```

**Output**:
```text
2
```

**Explanation**:
Component 1: `{0, 1, 2}`
Component 2: `{3, 4}`
Total = 2 components.

### Example 2

**Input**:
```text
n = 5
edges = [[0,1], [1,2], [2,3], [3,4]]
```

**Output**:
```text
1
```

**Explanation**:
All nodes `{0, 1, 2, 3, 4}` belong to a single connected component.

## Constraints

- `1 <= n <= 2000`
- `0 <= edges.length <= 5000`
- `edges[i].length == 2`
- `0 <= ai, bi < n`
- `ai != bi`
- There are no duplicate edges.

## Expected Complexity

- **Time**: `O(V + E)` using BFS/DFS or Disjoint Set Union (Union-Find) with path compression `O(E * α(V))`.
- **Space**: `O(V + E)` for adjacency list / DSU parent array.

## Source

[NeetCode - Number of Connected Components In An Undirected Graph](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/)
