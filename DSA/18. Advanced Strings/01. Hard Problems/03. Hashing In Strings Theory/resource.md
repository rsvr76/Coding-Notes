# Hashing in Strings — Theory & Polynomial Rolling Hash

> **Source:** [Hashing In Strings | Theory](https://takeuforward.org/data-structure/hashing-in-strings)

---

## What is String Hashing?

**String Hashing** maps a string to an integer hash value such that string comparisons can be performed in **O(1) time** instead of **O(N) time**.

---

## Polynomial Rolling Hash Function

The standard hash function maps string `S` of length `n` to an integer:

$$\text{Hash}(S) = (S[0] \cdot p^0 + S[1] \cdot p^1 + S[2] \cdot p^2 + \dots + S[n-1] \cdot p^{n-1}) \pmod M$$

where:
- `p` is a prime base roughly equal to the alphabet size (e.g., `p = 31` for lowercase English, `p = 53` for mixed case).
- `M` is a large prime number (e.g., `10⁹ + 7` or `10⁹ + 9`) to prevent overflow and minimize hash collisions.

---

## O(1) Substring Hash Extraction

Using precomputed prefix hash values and powers of `p`:

$$\text{PrefixHash}[i] = (S[0] \cdot p^0 + S[1] \cdot p^1 + \dots + S[i] \cdot p^i) \pmod M$$

The hash of substring `S[L..R]` is given by:

$$\text{Hash}(S[L..R]) = \frac{\text{PrefixHash}[R] - \text{PrefixHash}[L-1]}{p^L} \pmod M$$

Or in modular arithmetic avoiding division:

$$\text{Hash}(S[L..R]) \cdot p^L = (\text{PrefixHash}[R] - \text{PrefixHash}[L-1] + M) \pmod M$$

---

## Double Hashing to Prevent Collisions

Single hash has a collision probability of `1/M`. By using **two distinct prime moduli** `(M₁, M₂)` and bases `(p₁, p₂)`:

$$\text{HashPair}(S) = (\text{Hash}_1(S), \text{Hash}_2(S))$$

Collision probability drops to `1 / (M₁ · M₂)`, making it virtually collision-free.

---

## Code Example: Precomputing Prefix Hashes

### C++
```cpp
#include <iostream>
#include <vector>
#include <string>

using namespace std;

class StringHash {
    string s;
    int n;
    long long p = 31;
    long long mod = 1e9 + 7;
    vector<long long> hashVal, pPow;

public:
    StringHash(string str) : s(str), n(str.length()) {
        hashVal.assign(n + 1, 0);
        pPow.assign(n + 1, 1);

        for (int i = 0; i < n; i++) {
            pPow[i + 1] = (pPow[i] * p) % mod;
            hashVal[i + 1] = (hashVal[i] + (s[i] - 'a' + 1) * pPow[i]) % mod;
        }
    }

    // Returns hash of substring s[L..R] (0-indexed)
    long long getSubstringHash(int L, int R) {
        long long res = (hashVal[R + 1] - hashVal[L] + mod) % mod;
        return res;
    }
};
```

---

## Applications

- **Rabin-Karp Algorithm:** Pattern matching in O(N + M).
- **Longest Common Substring:** Binary search on length + hashing in O(N log N).
- **Counting Distinct Substrings:** O(N²).
- **Palindromic Substrings:** Comparing forward and reversed string hashes in O(1).

---

**Source:** [Hashing In Strings | Theory](https://takeuforward.org/data-structure/hashing-in-strings)
