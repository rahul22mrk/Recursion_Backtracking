# Recursion & Backtracking – Java

This repository contains Java programs that solve problems related to subsequence generation using recursion and backtracking. It includes:

1. Generating all subsequences of an array  
2. Returning all subsequences with sum = K  
3. Returning any one subsequence with sum = K

File: SubsequenceProblems.java → All 3 problems implemented in one file.

Example Input: arr = {1, 2, 1}, k = 2

1. All Subsequences

Output:
[1, 2, 1]
[1, 2]
[1, 1]
[1]
[2, 1]
[2]
[1]
[]

Time: O(2^n * n)  
Space: O(2^n * n)  
Concepts: Recursion, Backtracking, Subset Generation

2. All Subsequences with Sum = 2

Output:
[1, 1]
[2]

Time: O(2^n * n)  
Space: O(2^n * n)  
Concepts: Recursion, Backtracking, Subset Filtering by Sum

3. One Subsequence with Sum = 2

Output:
One subsequence with sum 2: [1, 1]
OR
One subsequence with sum 2: [2]

Time: O(2^n)  
Space: O(n)  
Concepts: Recursion, Backtracking, Early Stopping on First Match

Author: Rahul Gupta
