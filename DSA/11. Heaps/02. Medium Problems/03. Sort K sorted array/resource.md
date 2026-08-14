# Sort a K-Sorted Array (Nearly Sorted Array)

> **Source:** [Sort a K-Sorted Array](https://takeuforward.org/data-structure/sort-k-sorted-array)

---

## Concept

In a **K-sorted array** (or nearly sorted array), each element is at most **K positions away** from its target position in the sorted array.

### Problem Statement

Given an array of `n` elements, where each element is at most `k` positions away from its target position, sort the array efficiently.

**Example:**
```
Input:  arr = [6, 5, 3, 2, 8, 10, 9], k = 3
Output: [2, 3, 5, 6, 8, 9, 10]
```

---

## Optimal Approach: Min-Heap (Priority Queue)

Since each element is at most `k` positions away, the smallest element of the array must be present within the first `k + 1` elements (indices `0` to `k`).

### Algorithm

1. Create a **Min-Heap** of size `k + 1` with the first `k + 1` elements of the array.
2. Maintain an index `target_idx = 0` for placing the sorted elements back into `arr`.
3. For remaining elements from index `k + 1` to `n - 1`:
   - Pop the minimum element from the Min-Heap and place it at `arr[target_idx++]`.
   - Push the current array element into the Min-Heap.
4. After processing all elements, extract remaining elements from the Min-Heap one by one into `arr[target_idx++]`.

---

## Visual Illustration

```
arr = [6, 5, 3, 2, 8, 10, 9], k = 3

1. Min-heap with first k+1 = 4 elements: [6, 5, 3, 2] -> Min is 2
   - Place 2 at arr[0]
   - Push 8 into heap -> Heap: [3, 5, 6, 8]

2. Min is 3 -> Place at arr[1]
   - Push 10 into heap -> Heap: [5, 6, 8, 10]

3. Min is 5 -> Place at arr[2]
   - Push 9 into heap -> Heap: [6, 8, 10, 9]

4. Process remaining elements from Heap:
   - Extract 6 -> arr[3]
   - Extract 8 -> arr[4]
   - Extract 9 -> arr[5]
   - Extract 10 -> arr[6]

Result: [2, 3, 5, 6, 8, 9, 10]
```

---

## Code Implementations

### C++
```cpp
#include <iostream>
#include <vector>
#include <queue>

using namespace std;

void sortKSortedArray(vector<int>& arr, int k) {
    int n = arr.size();
    // Min-heap
    priority_queue<int, vector<int>, greater<int>> minHeap;

    // Push first k+1 elements into min-heap
    for (int i = 0; i <= min(n - 1, k); i++) {
        minHeap.push(arr[i]);
    }

    int index = 0;
    for (int i = k + 1; i < n; i++) {
        arr[index++] = minHeap.top();
        minHeap.pop();
        minHeap.push(arr[i]);
    }

    while (!minHeap.empty()) {
        arr[index++] = minHeap.top();
        minHeap.pop();
    }
}
```

### Java
```java
import java.util.PriorityQueue;

public class SortKSorted {
    public static void sortKSortedArray(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i <= Math.min(n - 1, k); i++) {
            minHeap.add(arr[i]);
        }

        int index = 0;
        for (int i = k + 1; i < n; i++) {
            arr[index++] = minHeap.poll();
            minHeap.add(arr[i]);
        }

        while (!minHeap.isEmpty()) {
            arr[index++] = minHeap.poll();
        }
    }
}
```

### Python
```python
import heapq

def sort_k_sorted_array(arr, k):
    n = len(arr)
    # Min-heap initialized with first k+1 elements
    min_heap = arr[:k + 1]
    heapq.heapify(min_heap)

    index = 0
    for i in range(k + 1, n):
        arr[index] = heapq.heappop(min_heap)
        index += 1
        heapq.heappush(min_heap, arr[i])

    while min_heap:
        arr[index] = heapq.heappop(min_heap)
        index += 1
```

---

## Complexity Analysis

| Approach | Time Complexity | Space Complexity |
|---|---|---|
| Standard QuickSort / MergeSort | O(n log n) | O(1) / O(n) |
| **Optimal Min-Heap** | **O(n log k)** | **O(k)** |

---

**Source:** [Sort a K-Sorted Array](https://takeuforward.org/data-structure/sort-k-sorted-array)
