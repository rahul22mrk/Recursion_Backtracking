# Recursion_Backtracking

# All Subsequences of Array in Java

This repository contains a Java program that recursively generates and returns all possible subsequences (subsets) of an integer array.

## Example

**Input:**  
`arr = {3, 1, 2}`

**Output:**
[3,1,2]
[3,1]
[3,2]
[3]
[1,2]
[1]
[2]
[]

## Time and Space Complexity

- **Time Complexity:** O(2ⁿ × n)  
- **Space Complexity:**  
  - Stack: O(n)  
  - Result Storage: O(2ⁿ × n)

## How It Works

The function uses recursion to include and exclude each element, building all combinations while preserving order.


# Subsequence Sum K - Java

This Java program returns all subsequences (subsets) of an array whose sum is exactly equal to a given target value `k`, using recursion.

---

## 📌 Example

**Input:**
```java
arr = {1, 2, 1}, k = 2
[1, 1]  
[2]

⏱ Time & Space Complexity
Time: O(2ⁿ × n)

Space:

Stack: O(n)

Result: O(2ⁿ × n)
🧠 Concepts Used
Backtracking

Recursion

Subsequence generation

Sum filtering

# 🎯 One Subsequence with Sum = K (Java)

This Java program uses recursion and backtracking to return **any one subsequence** from a given array whose elements sum up to a target value `k`.

---

## 📥 Input

- An integer array: `arr = {1, 2, 1}`
- A target sum: `k = 2`

---

## 📤 Output

The program returns any one valid subsequence whose sum is exactly `k`.

### Example Output:
One subsequence with sum 2: [1, 1]
OR  

(Any one valid match is accepted.)

---

## ⏱ Time and Space Complexity

| Metric           | Value          |
|------------------|----------------|
| Time Complexity  | O(2ⁿ)          |
| Space Complexity | O(n) (stack + result) |

- Time is O(2ⁿ) in worst case (all paths explored).
- Space is O(n) due to recursion depth and result size.

---

## 🧠 Concepts Used

- Recursion
- Backtracking
- Subsequence generation
- Pruning early on first valid result

---

## ✅ How It Works

At each index:
- Try including the element → recurse
- If found, return
- Else backtrack → try excluding the element
- Return as soon as a valid subsequence is found

---

## 🧪 Test It

You can run this with any input by modifying the array and `k` in the `main` method.


