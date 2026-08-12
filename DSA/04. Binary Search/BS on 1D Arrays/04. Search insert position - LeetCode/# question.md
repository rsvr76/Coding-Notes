# Search Insert Position

**LeetCode #35** | **Difficulty**: Easy

## Problem Statement

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with `O(log n)` runtime complexity.

### Example 1

```
Input: nums = [1,3,5,6], target = 5
Output: 2
```

### Example 2

```
Input: nums = [1,3,5,6], target = 2
Output: 1
```

### Example 3

```
Input: nums = [1,3,5,6], target = 7
Output: 4
```

**Constraints:**

	- `1 <= nums.length <= 10^4^`

	- `-10^4^ <= nums[i] <= 10^4^`

	- `nums` contains **distinct** values sorted in **ascending** order.

	- `-10^4^ <= target <= 10^4^`

## Source

LeetCode: https://leetcode.com/problems/search-insert-position/#:~:text=Search%20Insert%20Position%20%2D%20LeetCode&text=Given%20a%20sorted%20array%20of,(log%20n)%20runtime%20complexity.