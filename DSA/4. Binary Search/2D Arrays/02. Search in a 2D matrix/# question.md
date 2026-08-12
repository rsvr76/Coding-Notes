
You are given an `m x n` integer matrix `matrix` with the following two properties:

* Each row is sorted in non-decreasing order.
* The first integer of each row is greater than the last integer of the previous row.

Given an integer `target`, return `true` *if* `target` *is in* `matrix` *or* `false`  *otherwise* .

You must write a solution in `O(log(m * n))` time complexity.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/10/05/mat.jpg)

<pre><strong>Input:</strong> matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
<strong>Output:</strong> true
</pre>

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/10/05/mat2.jpg)

<pre><strong>Input:</strong> matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
<strong>Output:</strong> false
</pre>

**Constraints:**

* `m == matrix.length`
* `n == matrix[i].length`
* `1 <= m, n <= 100`
* `-10<sup>4</sup> <= matrix[i][j], target <= 10<sup>4</sup>`
