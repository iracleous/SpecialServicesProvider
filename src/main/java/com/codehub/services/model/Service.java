package com.codehub.services.model;

public abstract class Service implements IService{
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean offer(Customer customer) {
        customer.addService(this);
        return true;
    }


}
