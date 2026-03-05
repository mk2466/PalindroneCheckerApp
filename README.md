# Palindrome Checker App

## Description
PalindromeChecker is a console-based Java application that checks whether a given string is a palindrome using recursion.

## Objective
To validate whether a string reads the same forward and backward under different conditions while demonstrating recursion and call stack concepts.

## Features
- Recursive palindrome checking
- Case-insensitive comparison
- Ignores spaces and special characters
- Console-based user interaction

## Concepts Used
- Recursion
- Base Condition
- Call Stack
- String Processing

## How It Works
1. The user enters a string.
2. The string is cleaned by removing non-alphanumeric characters and converting it to lowercase.
3. A recursive method compares characters from the start and end.
4. Recursion stops when start index is greater than or equal to end index.
5. The result is displayed on the console.

## How to Run
1. Compile the program:
   javac PalindromeChecker.java

2. Run the program:
   java PalindromeChecker
