package com.codehub.services.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OnLineServiceTest {

    private Shop shop;

    @BeforeEach
    public   void setUp(){

       IService   service = new OnLineService("services", 10, 2);
       Customer c = new Customer();
       c.addService(service);
         shop = new Shop();
       shop.addCustomer(c);

    }


    @Test
    public   void myTest(){
        assertEquals(0,shop.getTotalRevenue(),"Error happened");
    }


}