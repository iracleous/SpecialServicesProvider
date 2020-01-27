package com.codehub.services.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    private Shop shop;

    @BeforeEach
    public   void setUp(){

       IService   service = new OnLineService("services",
               10, 2);
       Customer c = new Customer();
       c.addService(service);
         shop = new Shop();
       shop.addCustomer(c);

    }


    @Test
    public   void getTotalRevenueTest(){
        assertEquals(20,shop.getTotalRevenue(),"Error happened");
    }


    @Test
    public void addCustomerTest()
    {
        Shop shop = new Shop();
        Customer c = new Customer();
        assertEquals(1, shop.addCustomer(c),"Error happened");
    }

}