package com.codehub.services.service;

import com.codehub.services.model.Customer;
import com.codehub.services.model.IService;

import java.util.List;

public class Shop {

    List<Customer> shopCustomers;

    //operations (creates data)
    public boolean receiveService(Customer customer, IService service){
        return false;
    }

    //reporting (creates information)
    public int getTotalRevenue(){
        return 0;
    }

}
