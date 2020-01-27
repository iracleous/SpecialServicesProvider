package com.codehub.services.model;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Customer> customers;

    public Shop() {
        this.customers = new ArrayList<>();
    }

    public int addCustomer(Customer c){
        customers.add(c);
        return customers.size();
    }

    public int getTotalRevenue(){


//        int total=0;
//        for (Customer c: customers){
//            total+= c.getTotalCost();
//        }
//       return total;
//

     return    customers
             .stream()
             .map(Customer::getTotalCost)
             .reduce((o1,o2) -> o1+o2 )
             .get();

    }
}
