# Meeting Rooms II

**LeetCode #253** | **Difficulty**: Medium

## Problem Statement

Given an array of meeting time `intervals` where `intervals[i] = [starti, endi]`, return the **minimum number of conference rooms** required to accommodate all meetings.

## Input

- A 2D array of integers `intervals` where each element is `[start, end]`.

## Output

- An integer representing the minimum number of rooms required.

## Examples

### Example 1

**Input**:
```text
intervals = [[0,30], [5,10], [15,20]]
```

**Output**:
```text
2
```

**Explanation**:
Room 1: `[0,30]`
Room 2: `[5,10]`, `[15,20]`
Total rooms needed = 2.

### Example 2

**Input**:
```text
intervals = [[7,10], [2,4]]
```

**Output**:
```text
1
```

**Explanation**:
The meetings do not overlap, so 1 room is sufficient.

## Constraints

- `1 <= intervals.length <= 10^4`
- `intervals[i].length == 2`
- `0 <= starti < endi <= 10^6`

## Expected Complexity

- **Time**: `O(N log N)` using Min-Heap / Priority Queue or Two-Pointer / Chronological Ordering approach.
- **Space**: `O(N)` for heap / start-end arrays.

## Source

[NeetCode - Meeting Rooms II](https://leetcode.com/problems/meeting-rooms-ii/)
