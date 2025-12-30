package com.example.fibonacci;

public class App {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Iterative: " + FibonacciIterative.fib(n));
        System.out.println("Recursive: " + FibonacciRecursive.fib(n));
        System.out.println("DP: " + FibonacciDP.fib(n));
    }
}