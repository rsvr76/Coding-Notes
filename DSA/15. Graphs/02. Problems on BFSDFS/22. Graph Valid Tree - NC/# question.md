# Graph Valid Tree

**LeetCode #261** | **Difficulty**: Medium

## Problem Statement

You have a graph of `n` nodes labeled from `0` to `n - 1`. You are given an integer `n` and a list of undirected `edges` where `edges[i] = [ai, bi]` indicates that there is an undirected edge between nodes `ai` and `bi`.

Return `true` if the edges of the given graph make up a **valid tree**, and `false` otherwise.

A graph is a valid tree if and only if:
1. It is fully **connected** (every node can reach every other node).
2. It contains **no cycles** (has exactly `n - 1` edges with no cycle).

## Input

- An integer `n` representing the number of nodes.
- A 2D list of integers `edges` where each element is a pair `[u, v]`.

## Output

- Return `true` if the graph is a valid tree, otherwise return `false`.

## Examples

### Example 1

**Input**:
```text
n = 5
edges = [[0,1], [0,2], [0,3], [1,4]]
```

**Output**:
```text
true
```

**Explanation**:
The graph has 5 nodes and 4 edges, is fully connected, and has no cycles.

### Example 2

**Input**:
```text
n = 5
edges = [[0,1], [1,2], [2,3], [1,3], [1,4]]
```

**Output**:
```text
false
```

**Explanation**:
Nodes 1, 2, and 3 form a cycle `1 - 2 - 3 - 1`, so it is not a valid tree.

## Constraints

- `1 <= n <= 2000`
- `0 <= edges.length <= 5000`
- `edges[i].length == 2`
- `0 <= ai, bi < n`
- `ai != bi`
- There are no self-loops or duplicate edges.

## Expected Complexity

- **Time**: `O(V + E)` using BFS/DFS or Disjoint Set Union (Union-Find).
- **Space**: `O(V + E)` for adjacency list / DSU parent array.

## Source

[NeetCode - Graph Valid Tree](https://leetcode.com/problems/graph-valid-tree/)
