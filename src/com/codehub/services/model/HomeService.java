package com.codehub.services.model;

import java.util.Date;

public class HomeService extends Service{
    private int costPerVisit;
    private Date visitDate;


    @Override
    public int getTotalPrice() {
        return costPerVisit;
    }


}
