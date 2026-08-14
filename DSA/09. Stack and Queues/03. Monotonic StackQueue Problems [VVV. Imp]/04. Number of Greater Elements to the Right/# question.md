# Number of Greater Elements to the Right

**Difficulty**: Medium

## Problem Statement

Given an array `arr` of $N$ integers and $Q$ queries, for each query containing an index `i`, count the number of elements strictly greater than `arr[i]` present to the right of index `i` in the array.

## Examples

### Example 1:
```
Input: arr = [3, 4, 2, 2, 5, 1, 6, 2], queries = [0, 3]
Output: [5, 2]
Explanation: For index 0 (val 3), greater elements on right are 4, 5, 6. For index 3 (val 2), greater elements on right are 5, 6.
```

## Constraints

- `1 <= N <= 10^4`
- `1 <= Q <= 10^4`
## Source

[Number of Greater Elements to the Right](https://takeuforward.org/data-structure/number-of-nges-to-the-right)
