# Bit Manipulation Prerequisites for TRIE Problems

> **Source:** [Bit Manipulation Prerequisites for TRIE](https://youtu.be/5iyuU4hQFrw)

---

## Overview

When solving advanced Trie problems involving bitwise operations (such as **Maximum XOR of Two Numbers in an Array** or **Maximum XOR with an Element from Array**), bit manipulation techniques are heavily combined with Binary Trie structures.

---

## Bitwise Operations Essentials

### 1. Representation of Numbers in Binary
An integer is stored as 32 bits (or 31 bits for non-negative signed integers).
Bits are indexed from `31` down to `0` (MSB to LSB).

```
Number: 5
32-bit binary: 00000000000000000000000000000101
```

### 2. Checking if the `i-th` Bit is Set
To check if bit `i` is `1` or `0`:
```cpp
bool isSet = (num & (1 << i)) != 0;
// OR
int bit = (num >> i) & 1;
```

### 3. Setting the `i-th` Bit
```cpp
num = num | (1 << i);
```

### 4. Toggling / Flipping a Bit
```cpp
num = num ^ (1 << i);
```

---

## Why Use a Trie for Bitwise Problems?

A **Binary Trie** (Bit Trie) is a binary tree where each node has at most two children:
- Left child representing bit `0`.
- Right child representing bit `1`.

```
Insert numbers 3 (011) and 5 (101) into 3-bit Trie:

               [Root]
              /      \
         0 (for 3)   1 (for 5)
            \          /
           1 (for 3) 0 (for 5)
            /          \
           1 (for 3)   1 (for 5)
```

---

## Key Pattern: Maximum XOR Search

To maximize `A ^ B` for a given number `A`:
- For each bit of `A` from MSB (`31` down to `0`):
  - If the current bit of `A` is `1`, we look for a `0` branch in the Trie to get `1 ^ 0 = 1`.
  - If the current bit of `A` is `0`, we look for a `1` branch in the Trie to get `0 ^ 1 = 1`.
  - If the desired opposite bit is unavailable, we take the same bit branch.

```cpp
// Searching opposite bit for maximum XOR
int currentBit = (num >> i) & 1;
int desiredBit = 1 - currentBit;

if (node->containsKey(desiredBit)) {
    maxNum |= (1 << i);
    node = node->get(desiredBit);
} else {
    node = node->get(currentBit);
}
```

---

## Summary Table

| Operation | Formula | Time Complexity |
|---|---|---|
| Check i-th bit | `(num >> i) & 1` | O(1) |
| Insert into Bit Trie | Iterate 31 to 0 bits | O(32) = O(1) |
| Query Max XOR in Trie | Traverse opposite bits | O(32) = O(1) |

---

**Source:** [Bit Manipulation Prerequisites for TRIE](https://youtu.be/5iyuU4hQFrw)
