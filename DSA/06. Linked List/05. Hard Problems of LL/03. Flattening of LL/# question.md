# Flattening a Linked List

**Difficulty**: Hard

## Problem Statement

Given a Linked List where every node has a `next` pointer and a `bottom` pointer pointing to a sub-linked list sorted in ascending order. Flatten the list so all nodes appear in a single bottom-linked list in sorted order.

## Examples

### Example 1:
```
Input:
 5 -> 10 -> 19 -> 28
 |     |     |     |
 7    20    22    35
 |	     |	   |
 8	    50	  40
 |		   |
30		  45

Output: 5 -> 7 -> 8 -> 10 -> 19 -> 20 -> 22 -> 28 -> 30 -> 35 -> 40 -> 45 -> 50
```

## Constraints

- `1 <= total number of nodes <= 1000`

## Source

[Flattening of LL](https://takeuforward.org/data-structure/flattening-a-linked-list/)
