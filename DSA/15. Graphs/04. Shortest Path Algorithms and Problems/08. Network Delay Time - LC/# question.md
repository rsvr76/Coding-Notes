# Network Delay Time

**LeetCode #743** | **Difficulty**: Medium

## Problem Statement

You are given a network of `n` nodes, labeled from `1` to `n`. You are also given `times`, a list of travel times as directed edges `times[i] = (u_i_, v_i_, w_i_)`, where `u_i_` is the source node, `v_i_` is the target node, and `w_i_` is the time it takes for a signal to travel from source to target.

We will send a signal from a given node `k`. Return *the **minimum** time it takes for all the* `n` *nodes to receive the signal*. If it is impossible for all the `n` nodes to receive the signal, return `-1`.

### Example 1

```
Input: times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
Output: 2
```

### Example 2

```
Input: times = [[1,2,1]], n = 2, k = 1
Output: 1
```

### Example 3

```
Input: times = [[1,2,1]], n = 2, k = 2
Output: -1
```

**Constraints:**

	- `1 <= k <= n <= 100`

	- `1 <= times.length <= 6000`

	- `times[i].length == 3`

	- `1 <= u_i_, v_i_ <= n`

	- `u_i_ != v_i_`

	- `0 <= w_i_ <= 100`

	- All the pairs `(u_i_, v_i_)` are **unique**. (i.e., no multiple edges.)

## Source

[LeetCode - Network Delay Time](https://leetcode.com/problems/network-delay-time/)
