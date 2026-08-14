# Introduction to Priority Queues Using Binary Heaps

> **Source:** [Introduction to Priority Queues Using Binary Heaps](https://takeuforward.org/data-structure/introduction-to-priority-queues-using-binary-heaps)

---

## What is a Heap?

A **Heap** is a specialized **complete binary tree** that satisfies the **Heap Property**:

| Type | Property |
|---|---|
| **Max-Heap** | Parent ≥ Children (root is the maximum) |
| **Min-Heap** | Parent ≤ Children (root is the minimum) |

> A heap is stored as an **array** — NOT as linked nodes.

---

## Array Representation

For a node at index `i` (1-indexed):
```
Parent  = i / 2
Left    = 2 * i
Right   = 2 * i + 1
```

For 0-indexed:
```
Parent  = (i - 1) / 2
Left    = 2 * i + 1
Right   = 2 * i + 2
```

**Example — Max-Heap:**
```
Array: [100, 40, 50, 10, 15, 50, 40]
Index:   0    1    2   3    4   5   6

Tree:
         100
        /    \
       40    50
      / \   / \
     10  15 50  40
```

---

## Core Heap Operations

### 1. Insertion — O(log n)

1. Add element at the **end** of the array
2. **Heapify Up (Bubble Up)**: Compare with parent; swap if heap property violated; repeat until root or property satisfied

```
Insert 60 into Max-Heap [100, 40, 50, 10, 15, 50, 40]:
Add 60 → [100, 40, 50, 10, 15, 50, 40, 60]
60 > parent(40) → swap
[100, 40, 50, 60, 15, 50, 40, 10]
60 < parent(100) → stop ✓
```

### 2. Deletion (Extract Max/Min) — O(log n)

1. Remove the **root** (max or min)
2. Move the **last element** to root
3. **Heapify Down (Bubble Down)**: Compare with children; swap with larger child (max-heap); repeat until leaf or satisfied

---

## Heapify — O(n)

Build a heap from an arbitrary array in O(n):
- Start from the last non-leaf node: `n/2 - 1`
- Call heapify-down for each node from right to left

---

## Priority Queue

A **Priority Queue** is an ADT built on a heap:
- `push(val)` → Insert → O(log n)
- `top()` → Peek root → O(1)
- `pop()` → Extract root → O(log n)
- `size()` → O(1)

**C++ STL:**
```cpp
// Max-heap (default)
priority_queue<int> maxPQ;

// Min-heap
priority_queue<int, vector<int>, greater<int>> minPQ;

maxPQ.push(5);      // insert
maxPQ.top();        // peek max
maxPQ.pop();        // remove max
```

**Java:**
```java
// Min-heap (default)
PriorityQueue<Integer> minPQ = new PriorityQueue<>();

// Max-heap
PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
```

**Python:**
```python
import heapq
# Min-heap (default)
heap = []
heapq.heappush(heap, 5)
heapq.heappop(heap)      # removes minimum

# Max-heap: negate values
heapq.heappush(heap, -5)  # treat as max-heap
```

---

## Time Complexity Summary

| Operation | Time |
|---|---|
| Build heap | O(n) |
| Insert | O(log n) |
| Extract max/min | O(log n) |
| Peek max/min | O(1) |
| Search | O(n) |

---

## Key Use Cases

- **Heap Sort** — O(n log n)
- **Dijkstra's Algorithm** — shortest path
- **Kth Largest / Smallest element**
- **Merge K sorted arrays**
- **Task scheduling / Job sequencing**
- **Median in a data stream**

---

**Source:** [Introduction to Priority Queues Using Binary Heaps](https://takeuforward.org/data-structure/introduction-to-priority-queues-using-binary-heaps)
