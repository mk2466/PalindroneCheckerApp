# Palindrome Checker App - UC12

## Description
UC12 implements the Strategy Pattern to dynamically select different palindrome-checking algorithms at runtime.

## Objective
To demonstrate interface-based design, polymorphism, and dynamic behavior selection using the Strategy Pattern.

## Features
- Runtime strategy selection
- Stack-based palindrome algorithm
- Deque-based palindrome algorithm
- Case-insensitive comparison
- Ignores non-alphanumeric characters
- Console-based execution

## Design Structure
1. PalindromeStrategy interface defines the contract.
2. StackStrategy implements stack-based validation.
3. DequeStrategy implements deque-based validation.
4. PalindromeService uses composition to execute selected strategy.
5. PalindromeApp handles user interaction.

## Concepts Used
- Interface
- Polymorphism
- Strategy Pattern
- Dependency Injection
- Stack and Deque data structures

## How to Run
1. Compile:
   javac PalindromeApp.java

2. Run:
   java PalindromeApp
