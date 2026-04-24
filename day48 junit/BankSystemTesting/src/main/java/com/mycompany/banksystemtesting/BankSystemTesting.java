
package com.mycompany.banksystemtesting;


public class BankSystemTesting 
{

    double balance = 0;

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        if(amt <= balance)
            balance -= amt;
    }

    double getBalance() {
        return balance;
    }
}
