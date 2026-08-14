# Print Name N Times Using Recursion

> **Source:** [Print Name N Times Using Recursion](https://takeuforward.org/recursion/print-name-n-times-using-recursion/)

---

## Concept

This is an **introductory recursion problem** that teaches how to use a recursive function to repeat an action N times, replacing the need for a loop.

### Problem

Given an integer `n` and a string `name`, print `name` exactly `n` times using recursion. Do **not** use any loop.

**Example:**
```
Input:  n = 3, name = "Striver"
Output:
Striver
Striver
Striver
```

---

## Key Concepts

### What is Recursion?

Recursion is a programming technique where a **function calls itself** directly or indirectly to solve a problem by breaking it into smaller subproblems, until it reaches a **base case** that stops further calls.

```
f(n) calls f(n-1) calls f(n-2) ... calls f(1) → STOP
```

### Base Case

The condition that **stops recursion**. Without a base case, the function recurses infinitely and causes a **Stack Overflow**.

---

## Approach

```
func(i, n, name):
    if i > n:         // base case
        return
    print(name)       // action
    func(i+1, n, name)   // recursive call
```

**Call Stack Trace (n=3):**
```
func(1,3) → prints "Striver" → calls func(2,3)
func(2,3) → prints "Striver" → calls func(3,3)
func(3,3) → prints "Striver" → calls func(4,3)
func(4,3) → 4 > 3 → return (base case)
```

---

## Code

**C++:**
```cpp
void func(int i, int n, string name) {
    if (i > n) return;      // base case
    cout << name << "\n";
    func(i + 1, n, name);   // recursive call
}
// Call: func(1, n, name);
```

**Java:**
```java
static void func(int i, int n, String name) {
    if (i > n) return;
    System.out.println(name);
    func(i + 1, n, name);
}
```

**Python:**
```python
def func(i, n, name):
    if i > n:
        return
    print(name)
    func(i + 1, n, name)
```

---

## Complexity

| | Complexity |
|---|---|
| **Time** | O(n) — n recursive calls |
| **Space** | O(n) — n stack frames |

---

**Source:** [Print Name N Times Using Recursion](https://takeuforward.org/recursion/print-name-n-times-using-recursion/)
