# Critical Connections in a Network

**LeetCode #1192** | **Difficulty**: Hard

## Problem Statement

There are `n` servers numbered from `0` to `n - 1` connected by undirected server-to-server `connections` forming a network where `connections[i] = [a_i_, b_i_]` represents a connection between servers `a_i_` and `b_i_`. Any server can reach other servers directly or indirectly through the network.

A *critical connection* is a connection that, if removed, will make some servers unable to reach some other server.

Return all critical connections in the network in any order.

### Example 1

```
Input: n = 4, connections = [[0,1],[1,2],[2,0],[1,3]]
Output: [[1,3]]
Explanation: [[3,1]] is also accepted.
```

### Example 2

```
Input: n = 2, connections = [[0,1]]
Output: [[0,1]]
```

**Constraints:**

	- `2 <= n <= 10^5^`

	- `n - 1 <= connections.length <= 10^5^`

	- `0 <= a_i_, b_i_ <= n - 1`

	- `a_i_ != b_i_`

	- There are no repeated connections.

## Source

[LeetCode - Critical Connections in a Network](https://leetcode.com/problems/critical-connections-in-a-network/discuss/382385/find-bridges-in-a-graph)
