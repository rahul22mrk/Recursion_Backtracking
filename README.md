# 🔁 Recursion & Backtracking – Java

This repository contains Java programs that solve classic **subsequence problems** using **recursion and backtracking**.

---

## 📁 Files Overview

1. `GenerateAllSubsequences.java`  
   ➤ Generate all possible subsequences of an array

2. `SubsequenceWithSumK.java`  
   ➤ Return all subsequences whose sum is equal to K

3. `OneSubsequenceWithSumK.java`  
   ➤ Return any one subsequence whose sum is equal to K

4. `CountSubsequenceWithSumK.java`  
   ➤ Count total number of subsequences whose sum is equal to K

---

## ✅ Example Input

arr = {1, 2, 1}  
k = 2

---

## 📂 1. GenerateAllSubsequences.java

**Output:**
[1, 2, 1]  
[1, 2]  
[1, 1]  
[1]  
[2, 1]  
[2]  
[1]  
[]

**Time Complexity:** O(2^n × n)  
**Space Complexity:** O(2^n × n)  
**Concepts:** Recursion, Backtracking, Subset Generation

---

## 📂 2. SubsequenceWithSumK.java

**Output:**
[1, 1]  
[2]

**Time Complexity:** O(2^n × n)  
**Space Complexity:** O(2^n × n)  
**Concepts:** Recursion, Backtracking, Filtering by Target Sum

---

## 📂 3. OneSubsequenceWithSumK.java

**Output (any one valid):**  
[1, 1]  
OR  
[2]

**Time Complexity:** O(2^n)  
**Space Complexity:** O(n)  
**Concepts:** Recursion, Backtracking, Early Return Optimization

---

## 📂 4. CountSubsequenceWithSumK.java

**Output:**  
Total subsequences with sum 2: 2  
(→ [1, 1] and [2])

**Time Complexity:** O(2^n)  
**Space Complexity:** O(n)  
**Concepts:** Recursion, Backtracking, Counting Valid Paths

---

## 🙌 Author

**Rahul Gupta**  
Building solid recursion and DSA foundations in Java 🔥
