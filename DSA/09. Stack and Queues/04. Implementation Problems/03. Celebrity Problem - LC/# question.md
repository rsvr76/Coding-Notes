# Find the Celebrity

**LeetCode #277** | **Difficulty**: Medium

## Problem Statement

Suppose you are at a party with `n` people labeled from `0` to `n - 1` and among them, there may exist one celebrity. The definition of a celebrity is that all the other `n - 1` people know the celebrity, but the celebrity does not know any of them.

Now you want to find out who the celebrity is or verify that there is not one. You are only allowed to ask questions like: "Hi, A. Do you know B?" to get information about whether A knows B. You need to find the celebrity (or verify there is not one) by asking as few questions as possible (in the asymptotic sense).

You are given a helper function `bool knows(a, b)` which tells you whether `a` knows `b`. Implement a function `int findCelebrity(n)`. There will be exactly one celebrity if they are at the party. Return the celebrity's label if there is a celebrity at the party. If there is no celebrity, return `-1`.

## Examples

### Example 1:

```
Input: graph = [[1,1,0],[0,1,0],[0,1,1]]
Output: 1
Explanation: There are three persons labeled 0, 1 and 2. graph[i][j] = 1 means person i knows person j, otherwise graph[i][j] = 0. The celebrity is the person labeled 1 because 0 knows 1 and 2 knows 1, but 1 does not know anyone.
```

### Example 2:

```
Input: graph = [[1,1,0],[0,1,0],[1,1,1]]
Output: -1
Explanation: There is no celebrity.
```

## Constraints

- `n == graph.length`
- `n == graph[i].length`
- `2 <= n <= 100`
- `graph[i][j]` is `0` or `1`.
- `graph[i][i] == 1`

## Source

[LeetCode - Find the Celebrity](https://leetcode.com/problems/find-the-celebrity/)
