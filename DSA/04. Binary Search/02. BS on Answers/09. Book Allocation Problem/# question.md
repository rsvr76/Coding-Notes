# Allocate Minimum Number of Pages

## Problem Statement

Given `N` books with page counts and `M` students, allocate contiguous books to students such that maximum pages allocated to a student is minimized.

## Input

Books array `arr`, students `M`.

## Output

Minimized maximum pages, or `-1` if allocation impossible.

## Examples

### Example 1

**Input**:
```
arr = [12, 34, 67, 90], M = 2
```
**Output**:
```
113
```
**Explanation**: Student 1 gets 12+34+67=113, Student 2 gets 90.

## Constraints

- 1 <= N <= 10^5
- 1 <= M <= N

## Expected Complexity

Time: O(N log(sum_pages))
Space: O(1)

## Source

[TakeUForward - Book Allocation Problem](https://takeuforward.org/plus/dsa/problems/book-allocation-problem)
