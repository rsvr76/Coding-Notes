# Walls And Gates

**LeetCode #286** | **Difficulty**: Medium

## Problem Statement

You are given an `m x n` grid `rooms` initialized with three possible values:
- `-1`: A wall or an obstacle.
- `0`: A gate.
- `2147483647` (represented as `INF`): An empty room.

Fill each empty room with the shortest distance to its nearest gate. If an empty room cannot reach any gate, it should remain `INF` (`2147483647`).

## Input

- A 2D array of integers `rooms` of size `m x n`.

## Output

- Modify `rooms` in-place so that each empty room contains the shortest distance to a gate.

## Examples

### Example 1

**Input**:
```text
rooms = [
  [2147483647, -1, 0, 2147483647],
  [2147483647, 2147483647, 2147483647, -1],
  [2147483647, -1, 2147483647, -1],
  [0, -1, 2147483647, 2147483647]
]
```

**Output**:
```text
[
  [3, -1, 0, 1],
  [2, 2, 1, -1],
  [1, -1, 2, -1],
  [0, -1, 3, 4]
]
```

**Explanation**:
Empty rooms are filled with the shortest distance to the nearest gate (`0`). Walls (`-1`) are impassable.

### Example 2

**Input**:
```text
rooms = [
  [0, -1],
  [2147483647, 2147483647]
]
```

**Output**:
```text
[
  [0, -1],
  [1, 2]
]
```

## Constraints

- `m == rooms.length`
- `n == rooms[i].length`
- `1 <= m, n <= 250`
- `rooms[i][j]` is `-1`, `0`, or `2147483647`.

## Expected Complexity

- **Time**: `O(m * n)` multi-source BFS starting simultaneously from all gates (`0`).
- **Space**: `O(m * n)` for the BFS queue.

## Source

[NeetCode - Walls And Gates](https://leetcode.com/problems/walls-and-gates/)
