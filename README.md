# PalindromeChecker App

## Overview
PalindromeChecker App is a console-based Java application that checks whether a given string is a palindrome using a Deque data structure.

## Objective
The objective of this application is to validate if a string reads the same forward and backward while demonstrating the use of a double-ended queue.

## Use Case
UC7: Deque-Based Optimized Palindrome Checker

## Goal
Use a Deque to compare characters from the front and rear of the string.

## Flow
1. Accept a string input from the user.
2. Insert each character into a Deque.
3. Remove the first and last elements from the Deque.
4. Compare the characters.
5. Continue until the Deque is empty or a mismatch occurs.

## Data Structure
Deque (Double Ended Queue)

## Technologies
Java  
Console Application  
Deque (ArrayDeque)

## How to Run
1. Save the file as PalindromeCheckerApp.java
2. Compile the program:
   javac PalindromeCheckerApp.java
3. Run the program:
   java PalindromeCheckerApp

## Example

Input:
madam

Output:
The string is a palindrome.
