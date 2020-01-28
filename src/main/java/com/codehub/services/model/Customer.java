package com.codehub.services.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private List<IService> receivedServices;


    public Customer(){
        receivedServices = new ArrayList<>();
    }

    public boolean addService(IService service)
    {
        receivedServices.add(service);
        return true;
    }

    public int getTotalCost(){
        return receivedServices
                .stream()
                .mapToInt(IService::getTotalPrice)
                .sum();

    }

}

