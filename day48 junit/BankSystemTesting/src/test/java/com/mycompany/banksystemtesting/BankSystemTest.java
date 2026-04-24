

package com.mycompany.banksystemtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class BankSystemTest 
{
    @Test
    void testDeposit() {
        BankSystemTesting b = new BankSystemTesting();
        b.deposit(1000);
        assertEquals(1000, b.getBalance());
    }

    @Test
    void testWithdraw() {
        BankSystemTesting b = new BankSystemTesting();
        b.deposit(1000);
        b.withdraw(500);
        assertEquals(500, b.getBalance());
    }
    
}
