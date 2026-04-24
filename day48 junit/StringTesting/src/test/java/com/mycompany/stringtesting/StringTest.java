

package com.mycompany.stringtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class StringTest 
{

    @Test
    void testReverse() 
    {
        assertEquals("olleh", new StringBuilder("hello").reverse().toString());
    }

    @Test
    void testRemoveSpace() 
    {
        assertEquals("hello", "h e l l o".replace(" ", ""));
    }
}
