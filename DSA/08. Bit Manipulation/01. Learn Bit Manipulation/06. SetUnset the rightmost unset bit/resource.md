# Set/Unset the Rightmost Unset Bit

> **Source:** [Set/Unset the Rightmost Bit](https://takeuforward.org/data-structure/set-the-rightmost-bit)
> **Video:** [YouTube](https://youtu.be/nttpF8kwgd4?si=x9o8PsYaA2XVZ9rV)

---

## Concept

Bit manipulation tricks to **set** or **unset** (clear) specific bits in a number without using loops.

---

## Key Bit Tricks

### 1. Set the Rightmost Unset Bit

**Goal:** Turn the first `0` bit (from the right) to `1`.

**Formula:** `n | (n + 1)`

**How it works:**
- `n + 1` carries over and flips the rightmost `0` to `1`, and sets all bits to the right of it to `0`.
- OR-ing with `n` restores all the original `1` bits.

**Example:**
```
n     = 5  = 0101
n+1   = 6  = 0110
n|(n+1)= 7 = 0111  → rightmost 0 (position 1) is now set
```

---

### 2. Unset the Rightmost Set Bit

**Goal:** Turn the rightmost `1` bit to `0`.

**Formula:** `n & (n - 1)`

**How it works:**
- `n - 1` flips the rightmost `1` to `0` and sets all bits to the right to `1`.
- AND-ing with `n` clears that bit and keeps everything else.

**Example:**
```
n     = 12 = 1100
n-1   = 11 = 1011
n&(n-1)= 8 = 1000  → rightmost 1 (position 2) is now cleared
```

---

### 3. Check if n is a Power of 2

Using the unset trick: a power of 2 has exactly ONE set bit.

**Formula:** `n > 0 && (n & (n-1)) == 0`

```
n = 8  = 1000
n-1= 7 = 0111
n & (n-1) = 0  → n IS a power of 2
```

---

## More Bit Tricks

| Operation | Formula |
|---|---|
| Get bit at position `i` | `(n >> i) & 1` |
| Set bit at position `i` | `n \| (1 << i)` |
| Clear bit at position `i` | `n & ~(1 << i)` |
| Toggle bit at position `i` | `n ^ (1 << i)` |
| Set rightmost unset bit | `n \| (n + 1)` |
| Unset rightmost set bit | `n & (n - 1)` |
| Isolate rightmost set bit | `n & (-n)` |

---

## Code

**C++ — Set rightmost unset bit:**
```cpp
int setRightmostUnsetBit(int n) {
    return n | (n + 1);
}
```

**C++ — Unset rightmost set bit:**
```cpp
int unsetRightmostSetBit(int n) {
    return n & (n - 1);
}
```

**Python:**
```python
def set_rightmost_unset(n):
    return n | (n + 1)

def unset_rightmost_set(n):
    return n & (n - 1)
```

---

## Visual Walkthrough

```
n = 10 = 1010

Set rightmost unset bit:
n+1    = 11 = 1011
n|(n+1)= 11 = 1011   (bit at position 0 is now set)

Unset rightmost set bit:
n-1   = 9  = 1001
n&(n-1)= 8 = 1000   (bit at position 1 is cleared)
```

---

**Source:** [Set/Unset the Rightmost Bit](https://takeuforward.org/data-structure/set-the-rightmost-bit)
