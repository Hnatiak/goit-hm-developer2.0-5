package com.example.fibonacci;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testFibonacci() {
        int n = 10;
        long expected = 55;
        assertEquals(expected, FibonacciIterative.fib(n));
        assertEquals(expected, FibonacciRecursive.fib(n));
        assertEquals(expected, FibonacciDP.fib(n));
    }
}