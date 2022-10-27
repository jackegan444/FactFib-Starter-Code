package com.factfib.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class FactFibTest {

   @Test
   public void factorialTest()
   {
    assertEquals(2, Factorial.factorial(2));
   }
   
   @Test
   public void fibonacciTest()
   {
    assertEquals(1, Fibonacci.fibonacci(2));
   }
}
