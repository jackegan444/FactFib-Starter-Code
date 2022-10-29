package com.factfib.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * @author jegan
 *
 */
public class FibonacciTest {

    private final static int[] FIRST_FIB_NUMS= {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
   
   @Test
   public void whenValidInputExpectFibonacciNum(){
        for (int i = 0; i < FIRST_FIB_NUMS.length; i++) {
            assertEquals(FIRST_FIB_NUMS[i], Fibonacci.fibonacci(i));
        }

        assertEquals(6765, Fibonacci.fibonacci(20));
        assertEquals(832040, Fibonacci.fibonacci(30));
        assertEquals(102334155, Fibonacci.fibonacci(40));
        assertEquals(1134903170, Fibonacci.fibonacci(45));

    }

    @Test
    public void whenInvalidInputExpectIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, ()->{Factorial.factorial(-100);});
        assertThrows(IllegalArgumentException.class, ()->{Factorial.factorial(-1);});
        assertThrows(IllegalArgumentException.class, ()->{Factorial.factorial(46);});
        assertThrows(IllegalArgumentException.class, ()->{Factorial.factorial(100);});
 
     }

}
