# Find Minimum and Maximum Element in a Binary Search Tree (BST)

> **Source:** [Find Min/Max in BST](https://takeuforward.org/data-structure/find-minmax-in-a-bst)

---

## BST Property Overview

In a valid **Binary Search Tree (BST)**, for any given node `X`:
- All nodes in the **left subtree** have keys **less than** `X.val`.
- All nodes in the **right subtree** have keys **greater than** `X.val`.

```
          15
        /    \
       10     20
      /  \   /  \
     8   12 17   25
    /
   6  <-- MINIMUM                             MAXIMUM --> 25
```

---

## Key Observations

1. **Minimum Element:** The minimum value is always at the **leftmost node** of the BST.
2. **Maximum Element:** The maximum value is always at the **rightmost node** of the BST.

---

## Algorithms

### Finding Minimum:
- Start at the root node.
- Keep moving to `node->left` until `node->left` is `NULL`.
- The current node contains the minimum value.

### Finding Maximum:
- Start at the root node.
- Keep moving to `node->right` until `node->right` is `NULL`.
- The current node contains the maximum value.

---

## Code Implementations

### C++
```cpp
#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* left;
    Node* right;
    Node(int val) : data(val), left(nullptr), right(nullptr) {}
};

int findMin(Node* root) {
    if (root == nullptr) return -1;
    while (root->left != nullptr) {
        root = root->left;
    }
    return root->data;
}

int findMax(Node* root) {
    if (root == nullptr) return -1;
    while (root->right != nullptr) {
        root = root->right;
    }
    return root->data;
}
```

### Java
```java
class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class BSTMinMax {
    public static int findMin(Node root) {
        if (root == null) return -1;
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    public static int findMax(Node root) {
        if (root == null) return -1;
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }
}
```

### Python
```python
class Node:
    def __init__(self, val):
        self.data = val
        self.left = None
        self.right = None

def find_min(root):
    if not root:
        return -1
    while root.left:
        root = root.left
    return root.data

def find_max(root):
    if not root:
        return -1
    while root.right:
        root = root.right
    return root.data
```

---

## Complexity Analysis

| Case | Time Complexity | Space Complexity (Iterative) | Space Complexity (Recursive) |
|---|---|---|---|
| **Balanced BST** | O(log₂ n) | O(1) | O(log₂ n) |
| **Skewed BST** | O(n) | O(1) | O(n) |

---

**Source:** [Find Min/Max in BST](https://takeuforward.org/data-structure/find-minmax-in-a-bst)
