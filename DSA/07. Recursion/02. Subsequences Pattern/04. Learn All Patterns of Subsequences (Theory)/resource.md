# Learn All Patterns of Subsequences (Theory)

> **Source:** [Learn All Patterns of Subsequences (Theory)](https://takeuforward.org/data-structure/learn-all-patterns-of-subsequences-theory)
> **Video:** [YouTube](https://www.youtube.com/watch?v=eQCS_v3bw0Q&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=7)

---

## What is a Subsequence?

A **subsequence** is a sequence derived from another sequence by deleting some (or no) elements without changing the relative order of the remaining elements.

> **Key difference from substrings:** Subsequences do **NOT** need to be contiguous.

**Example:** For `[1, 2, 3]`
- `[1, 3]` → valid subsequence (skip 2)
- `[1, 2]` → valid subsequence
- `[3, 1]` → **NOT** a subsequence (order changed)

---

## Count of Subsequences

For an array/string of length `n`:

> **Total subsequences = 2ⁿ** (including the empty subsequence)

Each element has 2 choices: **include** or **exclude**.

**Example:** `[1, 2, 3]` → 2³ = 8 subsequences:
```
[]
[1]
[2]
[3]
[1, 2]
[1, 3]
[2, 3]
[1, 2, 3]
```

---

## Generating All Subsequences (Recursion Pattern)

The standard recursive pattern to generate all subsequences:

```
func(index, current_subsequence, arr):
    if index == arr.length:
        print(current_subsequence)   // base case: record result
        return
    
    // INCLUDE arr[index]
    current_subsequence.add(arr[index])
    func(index + 1, current_subsequence, arr)
    
    // EXCLUDE arr[index] (backtrack)
    current_subsequence.remove_last()
    func(index + 1, current_subsequence, arr)
```

### Recursion Tree for `[1, 2, 3]`:

```
                    func(0, [])
                   /           \
         func(1, [1])        func(1, [])
          /       \            /      \
   func(2,[1,2]) func(2,[1]) func(2,[2]) func(2,[])
      /    \       /    \      /    \      /    \
[1,2,3] [1,2] [1,3] [1] [2,3] [2] [3] []
```

---

## Code

**C++:**
```cpp
void func(int index, vector<int>& arr, vector<int>& current) {
    if (index == arr.size()) {
        // print current
        for (int x : current) cout << x << " ";
        cout << "\n";
        return;
    }
    // Include
    current.push_back(arr[index]);
    func(index + 1, arr, current);
    // Exclude (backtrack)
    current.pop_back();
    func(index + 1, arr, current);
}
```

**Python:**
```python
def func(index, arr, current):
    if index == len(arr):
        print(current)
        return
    # Include
    func(index + 1, arr, current + [arr[index]])
    # Exclude
    func(index + 1, arr, current)
```

---

## Key Patterns

| Pattern | Description |
|---|---|
| **Print all subsequences** | Generate all 2ⁿ subsets |
| **Subsequence with sum K** | Filter by condition |
| **Count subsequences with property** | Count instead of print |
| **Any one subsequence** | Return on first match |

---

## Complexity

| | Complexity |
|---|---|
| **Time** | O(2ⁿ × n) — 2ⁿ subsequences, each O(n) to process |
| **Space** | O(n) — recursion depth + current array |

---

**Source:** [Learn All Patterns of Subsequences (Theory)](https://takeuforward.org/data-structure/learn-all-patterns-of-subsequences-theory)
