# Boundary of Binary Tree

**LeetCode #545** | **Difficulty**: Medium

## Problem Statement

The **boundary** of a binary tree is the concatenation of the **root**, the **left boundary**, the **leaves** ordered from left-to-right, and the **reverse of the right boundary**.

- The **left boundary** is the set of nodes defined by the following:
  - The root's left child, if it exists. If the root does not have a left child, the left boundary is **empty**.
  - If a node in the left boundary has a left child, then the left child is in the left boundary.
  - If a node in the left boundary does not have a left child, but has a right child, then the right child is in the left boundary.
  - The leftmost leaf is **not** in the left boundary.
- The **right boundary** is defined similarly, using right children instead of left children. The rightmost leaf is **not** in the right boundary.
- The **leaves** are nodes that have no children.

Given the `root` of a binary tree, return *the values of its boundary in order*.

## Examples

### Example 1:

```
Input: root = [1,null,2,3,4]
Output: [1,3,4,2]
Explanation:
- The left boundary is empty because the root does not have a left child.
- The right boundary is [2] from the root's right child.
- The leaves are [3,4].
Concatenating these in order gives [1] + [] + [3,4] + [2] = [1,3,4,2].
```

## Constraints

- The number of nodes in the tree is in the range `[1, 10^4]`.
- `-1000 <= Node.val <= 1000`

## Source

[LeetCode - Boundary of Binary Tree](https://leetcode.com/problems/boundary-of-binary-tree/)
