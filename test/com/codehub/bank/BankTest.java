package com.codehub.bank;

import com.codehub.services.model.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {




    private Bank bank;
    private Account account;

    @BeforeEach
    void before(){
        bank = new Bank();
        account = new Account();
        Customer customer= new Customer();
        account.setCustomer(customer);

    }


    @Test
    void printListToConsole() {
        bank.addAccount(account);
        assertEquals(1, bank.printListToConsole(),"not correct");
    }

    @Test
    void getTotalBalance() {
        bank.addAccount(account);
        account.deposit(100);
        account.deposit(120);
        account.withdaw(80);

        assertEquals(140, bank.getTotalBalance(),"not correct");

    }


    @Test
    void printTest(){
        bank.addAccount(account);
        account.deposit(100);
        account.deposit(120);
        account.withdaw(80);

        bank.addAccount(account);
        bank.addAccount(account);


        assertEquals(true,
                bank.saveJsonToFile("bank.json"));
    }

}