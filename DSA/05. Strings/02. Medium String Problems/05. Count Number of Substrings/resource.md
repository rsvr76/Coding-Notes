# Count Number of Substrings

> **Source:** [Count Number of Substrings](https://takeuforward.org/data-structure/count-number-of-substrings)

---

## Concept

A **substring** is a contiguous sequence of characters within a string. For a string of length `n`, the total number of possible substrings can be calculated using a direct formula.

---

## Formula

For a string of length `n`:

> **Total Substrings = n × (n + 1) / 2**

This is derived from the observation that:
- Substrings of length 1: `n`
- Substrings of length 2: `n - 1`
- Substrings of length 3: `n - 2`
- ...
- Substrings of length n: `1`

Total = `n + (n-1) + (n-2) + ... + 1` = `n(n+1)/2`

---

## Example

**Input:** `s = "abc"` (n = 3)

All substrings:
```
Length 1: "a", "b", "c"           → 3
Length 2: "ab", "bc"              → 2
Length 3: "abc"                   → 1
Total: 3 + 2 + 1 = 6
```

Using formula: `3 × 4 / 2 = 6` ✓

---

## Brute Force Approach (Enumerate All)

```
for i from 0 to n-1:
    for j from i to n-1:
        substring = s[i..j]
        count++
```

**Time**: O(n²) | **Space**: O(1)

---

## Code

**C++:**
```cpp
int countSubstrings(string s) {
    int n = s.length();
    return n * (n + 1) / 2;
}
```

**Java:**
```java
static int countSubstrings(String s) {
    int n = s.length();
    return n * (n + 1) / 2;
}
```

**Python:**
```python
def countSubstrings(s):
    n = len(s)
    return n * (n + 1) // 2
```

---

## Complexity

| | Formula | Brute Force |
|---|---|---|
| **Time** | O(1) | O(n²) |
| **Space** | O(1) | O(1) |

---

**Source:** [Count Number of Substrings](https://takeuforward.org/data-structure/count-number-of-substrings)
