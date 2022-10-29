package com.factfib.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * @author jegan
 *
 */
public class FactorialTest {

   private final static int[] FACTORIAL_RESULTS = {1, 1, 2, 6, 24, 120, 720, 5040, 40320,
       362880, 3628800, 39916800, 479001600};

   @Test
   public void whenValidInputExpectFactorialNum() {
      for (int i = 0; i < FACTORIAL_RESULTS.length; i++) {
         assertEquals(FACTORIAL_RESULTS[i], Factorial.factorial(i));
      }

   }

   @Test
   public void whenInvalidInputExpectIllegalArgumentException() {
      assertThrows(IllegalArgumentException.class, ()->{Factorial.factorial(-100);});
      assertThrows(IllegalArgumentException.class, ()->{Factorial.factorial(-1);});
      assertThrows(IllegalArgumentException.class, ()->{Factorial.factorial(0);});
      assertThrows(IllegalArgumentException.class, ()->{Factorial.factorial(13);});
      assertThrows(IllegalArgumentException.class, ()->{Factorial.factorial(100);});
  
   }
}
