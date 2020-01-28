package com.codehub.startup;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args)   {
      test1();

    }

    public static void test2() {
        Company co = new Company();
        try {
            co.loadCompany("employee.txt");
        } catch (FileNotFoundException e) {
            System.out.println("file missing error");
        } catch (ArrayIndexOutOfBoundsException aioe){
            System.out.println("file bad format error");
        } catch(NumberFormatException nfe) {
            System.out.println("bad numerical string");
            nfe.printStackTrace();
        }
        co.showEmployees();

    }


    public static void test1(){
        Company co = new Company();
        Employee e = new Employee("Dimitris", 800.6);
        co.addEmployee(e);
        co.addEmployee(new Employee("Petros", 1800.4));


        co.showEmployees();
        try {
            co.saveEmployees("employee.txt");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            return;
        }

        co.saveAsXML("employees.xml");
    }
}
