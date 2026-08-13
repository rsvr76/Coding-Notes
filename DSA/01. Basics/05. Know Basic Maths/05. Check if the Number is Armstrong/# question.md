# Check if the Number is Armstrong

**Difficulty**: Easy

## Problem Statement

Given an integer `n`, return `true` if it is an **Armstrong number** (also known as a Narcissistic number), otherwise return `false`.

An `k`-digit integer `n` is an Armstrong number if the sum of its digits each raised to the power of `k` equals `n`.

## Examples

### Example 1:

```
Input: n = 153
Output: true
Explanation: 153 has 3 digits. 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
```

### Example 2:

```
Input: n = 371
Output: true
Explanation: 371 has 3 digits. 3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371.
```

### Example 3:

```
Input: n = 35
Output: false
Explanation: 35 has 2 digits. 3^2 + 5^2 = 9 + 25 = 34 != 35.
```

## Constraints

- `0 <= n <= 10^9`

## Source

[TakeUForward - Check if the Number is Armstrong](https://takeuforward.org/maths/check-if-a-number-is-armstrong-number-or-not/)
