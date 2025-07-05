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


