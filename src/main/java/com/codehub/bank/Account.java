package com.codehub.bank;

import com.codehub.services.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private Customer customer;
    private double balance;

    public void deposit(double amount){
        balance += amount;
    }

    public void withdaw (double amount){
        balance -= amount;
    }

}
