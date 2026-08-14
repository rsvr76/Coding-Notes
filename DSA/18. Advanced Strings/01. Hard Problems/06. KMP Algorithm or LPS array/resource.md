# Knuth-Morris-Pratt (KMP) Algorithm & LPS Array

> **Source:** [KMP Algorithm / LPS Array](https://takeuforward.org/data-structure/kmp-algorithm-or-lps-array)

---

## Overview

The **Knuth-Morris-Pratt (KMP)** algorithm is a pattern matching algorithm that searches for occurrences of a pattern `P` in a text `T` in **O(N + M)** time.

It avoids redundant character comparisons by preprocessing the pattern to construct the **Longest Prefix Suffix (LPS)** array.

---

## What is the LPS Array?

`LPS[i]` stores the length of the **longest proper prefix** of `P[0..i]` that is also a **suffix** of `P[0..i]`.

> **Proper Prefix:** A prefix that is not equal to the full string itself.

### Example: `P = "ababcaba"`

```
Index:  0  1  2  3  4  5  6  7
Char:   a  b  a  b  c  a  b  a
LPS:    0  0  1  2  0  1  2  3
```

---

## Construction of LPS Array — O(M)

```cpp
vector<int> computeLPS(string pat) {
    int m = pat.length();
    vector<int> lps(m, 0);
    int len = 0; // length of previous longest prefix suffix
    int i = 1;

    while (i < m) {
        if (pat[i] == pat[len]) {
            len++;
            lps[i] = len;
            i++;
        } else {
            if (len != 0) {
                len = lps[len - 1]; // fallback without incrementing i
            } else {
                lps[i] = 0;
                i++;
            }
        }
    }
    return lps;
}
```

---

## KMP Search Algorithm — O(N)

```cpp
void KMPMatch(string text, string pat) {
    int n = text.length();
    int m = pat.length();
    vector<int> lps = computeLPS(pat);

    int i = 0; // index for text
    int j = 0; // index for pat

    while (i < n) {
        if (text[i] == pat[j]) {
            i++;
            j++;
        }
        if (j == m) {
            cout << "Pattern found at index " << i - j << "
";
            j = lps[j - 1]; // look for next match
        } else if (i < n && text[i] != pat[j]) {
            if (j != 0) {
                j = lps[j - 1]; // shift pattern using LPS
            } else {
                i++;
            }
        }
    }
}
```

---

## Complexity Analysis

| Algorithm Phase | Time Complexity | Space Complexity |
|---|---|---|
| Preprocessing (LPS Array) | O(M) | O(M) |
| Search Phase | O(N) | O(1) |
| **Total KMP Algorithm** | **O(N + M)** | **O(M)** |

---

**Source:** [KMP Algorithm / LPS Array](https://takeuforward.org/data-structure/kmp-algorithm-or-lps-array)
