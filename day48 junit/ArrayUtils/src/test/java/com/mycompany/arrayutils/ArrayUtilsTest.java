
package com.mycompany.arrayutils;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class ArrayUtilsTest 
{
    ArrayUtils au;
    
    @BeforeAll
    static void start() 
    {
        System.out.println("Testing Started");
    }

    @BeforeEach
    void setUp() 
    {
         au = new ArrayUtils();
    }

    @Test
    @DisplayName("Maximun")
    void maxTest() 
    {
        int ar[] = {12, 5, 8, 20, 3};
        assertEquals(20, au.max(ar));
    }

    @Test
    @DisplayName("Minimum")
    void testSub() 
    {
        int ar[] = {12, 5, 8, 20, 3};
        assertEquals(3, au.min(ar));
    }

    

    @AfterEach
    void tearDown() {
        au = null;
    }

    @AfterAll
    static void end() {
        System.out.println("Testing Finished");
    }
}
