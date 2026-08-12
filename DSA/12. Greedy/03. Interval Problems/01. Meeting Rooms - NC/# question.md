# Meeting Rooms

**LeetCode #252** | **Difficulty**: Easy

## Problem Statement

Given an array of meeting time `intervals` where `intervals[i] = [starti, endi]`, determine if a person could attend all meetings without any conflicts.

Return `true` if no two meetings overlap, otherwise return `false`.

Note that meetings ending at time `T` and starting at time `T` (e.g. `[0, 5]` and `[5, 10]`) do **not** conflict with each other.

## Input

- A 2D array of integers `intervals` where each element is `[start, end]`.

## Output

- Return `true` if all meetings can be attended without overlapping, otherwise return `false`.

## Examples

### Example 1

**Input**:
```text
intervals = [[0,30], [5,10], [15,20]]
```

**Output**:
```text
false
```

**Explanation**:
Meeting `[0,30]` overlaps with `[5,10]` and `[15,20]`.

### Example 2

**Input**:
```text
intervals = [[5,8], [9,15]]
```

**Output**:
```text
true
```

**Explanation**:
No two meetings overlap.

## Constraints

- `0 <= intervals.length <= 10^4`
- `intervals[i].length == 2`
- `0 <= starti < endi <= 10^6`

## Expected Complexity

- **Time**: `O(N log N)` due to sorting intervals by start time.
- **Space**: `O(1)` auxiliary space (or `O(N)` for sorting).

## Source

[NeetCode - Meeting Rooms](https://leetcode.com/problems/meeting-rooms/)
