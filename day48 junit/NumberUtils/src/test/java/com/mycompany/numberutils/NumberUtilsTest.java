
package com.mycompany.numberutils;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class NumberUtilsTest 
{
    @Test
    void testFactorial() {
        NumberUtils utils = new NumberUtils();
        assertEquals(120, utils.factorial(5));
    }

    @Test
    void testIsPrime() {
        NumberUtils utils = new NumberUtils();
        assertTrue(utils.isPrime(5));
    }

    @Test
    void testIsNotPrime() {
        NumberUtils utils = new NumberUtils();
        assertFalse(utils.isPrime(8));
    }
}
