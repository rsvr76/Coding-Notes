# Minimum Spanning Tree (MST) — Theory & Concepts

> **Source:** [Minimum Spanning Tree Theory](https://takeuforward.org/data-structure/minimum-spanning-tree-theory-g-44/)

---

## What is a Spanning Tree?

A **Spanning Tree** of a connected, undirected, weighted graph `G = (V, E)` is a subgraph that:
1. Contains **all vertices** `V` of the original graph.
2. Is a **tree** (connected and contains **no cycles**).
3. Has exactly **V - 1 edges**.

A graph can have multiple spanning trees.

```
Original Graph:
   (1) -- 2 -- (2)
    | \        |
    1  3       7
    |    \     |
   (4) -- 5 -- (3)

One Spanning Tree (V=4, E=3):
   (1) -- 2 -- (2)
    |          |
    1          7
    |          |
   (4)        (3)
```

---

## What is a Minimum Spanning Tree (MST)?

A **Minimum Spanning Tree (MST)** is a spanning tree whose sum of edge weights is **minimized** among all possible spanning trees of the graph.

> **Total Weight of MST:** ∑ weight(e) for all e in MST is minimum.

---

## Key Properties of MST

1. **Number of Edges:** Exactly `V - 1`.
2. **No Cycles:** If adding an edge creates a cycle, it cannot be in the tree.
3. **Cut Property:** For any cut of the graph (partition of vertices into two sets), the lightest edge crossing the cut belongs to the MST.
4. **Uniqueness:** If all edge weights are distinct, the graph has a **unique** MST.

---

## Primary Algorithms for Finding MST

| Algorithm | Approach | Time Complexity | Data Structure Used |
|---|---|---|---|
| **Prim's Algorithm** | Greedy (Grows a single tree node-by-node) | **O(E log V)** | Min-Heap / Priority Queue |
| **Kruskal's Algorithm** | Greedy (Sorts all edges, adds non-cycling edges) | **O(E log E)** | Disjoint Set Union (DSU) |

---

## Comparison: Prim's vs. Kruskal's

```
Prim's Algorithm:
- Starts from a root vertex.
- Adds the minimum weight edge connected to the visited component.
- Best for DENSE graphs (where E ~ V²).

Kruskal's Algorithm:
- Sorts all edges in non-decreasing order of weights.
- Picks the smallest edge that does not form a cycle using DSU.
- Best for SPARSE graphs (where E ~ V).
```

---

## Applications of MST

- **Network Design:** Laying cables, electrical grids, water piping with minimum total length.
- **Approximation Algorithms:** Metric Traveling Salesperson Problem (TSP).
- **Cluster Analysis:** Single-linkage hierarchical clustering.

---

**Source:** [Minimum Spanning Tree Theory](https://takeuforward.org/data-structure/minimum-spanning-tree-theory-g-44/)
