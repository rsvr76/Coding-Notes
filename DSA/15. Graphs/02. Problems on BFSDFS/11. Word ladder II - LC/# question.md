# Word Ladder II

**LeetCode #126** | **Difficulty**: Hard

## Problem Statement

A **transformation sequence** from word `beginWord` to word `endWord` using a dictionary `wordList` is a sequence of words `beginWord -> s_1_ -> s_2_ -> ... -> s_k_` such that:

	- Every adjacent pair of words differs by a single letter.

	- Every `s_i_` for `1  "hot" -> "dot" -> "dog" -> "cog"
"hit" -> "hot" -> "lot" -> "log" -> "cog"
```

### Example 2

```
Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
Output: []
Explanation: The endWord "cog" is not in wordList, therefore there is no valid transformation sequence.
```

**Constraints:**

	- `1 <= beginWord.length <= 5`

	- `endWord.length == beginWord.length`

	- `1 <= wordList.length <= 500`

	- `wordList[i].length == beginWord.length`

	- `beginWord`, `endWord`, and `wordList[i]` consist of lowercase English letters.

	- `beginWord != endWord`

	- All the words in `wordList` are **unique**.

	- The **sum** of all shortest transformation sequences does not exceed `10^5^`.

## Source

[LeetCode - Word Ladder II](https://leetcode.com/problems/word-ladder-ii/)
