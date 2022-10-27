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
    assertEquals(Factorial.factorial(2)), 2;
   }
}
