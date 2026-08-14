# Z Algorithm (Z-Function) — String Matching & Prefix Patterns

> **Source:** [Z Algorithm (Z Function)](https://takeuforward.org/data-structure/z-algorithm-z-function/)

---

## What is the Z-Function?

For a string `S` of length `n`, the **Z-array** `Z` is an array of size `n` where `Z[i]` is the length of the **longest common prefix** between `S` and the suffix of `S` starting at index `i`.

> `Z[i]` = length of longest substring starting at `S[i]` that matches prefix `S[0...]`.
> By convention, `Z[0] = 0`.

---

## Example

**String:** `S = "a a b c a a b a"`

```
Index: 0  1  2  3  4  5  6  7
S:     a  a  b  c  a  a  b  a
Z:     0  1  0  0  3  1  0  1
```

- `Z[1] = 1`: Substring starting at index 1 is `"a..."`, matches prefix `"a"`.
- `Z[4] = 3`: Substring starting at index 4 is `"aab..."`, matches prefix `"aab"`.

---

## Optimal O(N) Z-Algorithm (Z-Box Concept)

Maintain a **segment `[L, R]`** (called Z-box) which is the interval with the maximum `R` value such that `S[L..R]` is a prefix of `S`.

### Algorithm Steps for index `i`:
1. **If `i > R`:** Calculate `Z[i]` naively by comparing characters from `S[i]` and `S[0]`. If `Z[i] > 0`, update `L = i, R = i + Z[i] - 1`.
2. **If `i <= R`:**
   - Let `k = i - L`.
   - If `Z[k] < R - i + 1`: `Z[i] = Z[k]` (completely inside Z-box).
   - Else: `Z[i] = R - i + 1` and extend manually past `R`. Update `L = i` and new `R`.

---

## Code Implementations

### C++
```cpp
#include <iostream>
#include <vector>
#include <string>

using namespace std;

vector<int> calculateZ(string s) {
    int n = s.length();
    vector<int> Z(n, 0);
    int L = 0, R = 0;

    for (int i = 1; i < n; i++) {
        if (i <= R) {
            Z[i] = min(R - i + 1, Z[i - L]);
        }
        while (i + Z[i] < n && s[Z[i]] == s[i + Z[i]]) {
            Z[i]++;
        }
        if (i + Z[i] - 1 > R) {
            L = i;
            R = i + Z[i] - 1;
        }
    }
    return Z;
}
```

---

## Pattern Matching Using Z-Algorithm

To search pattern `P` in text `T`:
1. Form concatenated string: `S = P + "$" + T` (where `$` is a unique delimiter).
2. Compute Z-array for `S`.
3. Wherever `Z[i] == length(P)`, pattern `P` occurs at index `i - length(P) - 1` in `T`.

---

## Complexity

| Approach | Time Complexity | Space Complexity |
|---|---|---|
| Naive Z-Array | O(N²) | O(N) |
| **Z-Algorithm** | **O(N)** | **O(N)** |

---

**Source:** [Z Algorithm (Z Function)](https://takeuforward.org/data-structure/z-algorithm-z-function/)
