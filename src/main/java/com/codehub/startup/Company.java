package com.codehub.startup;

import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company implements Serializable {
    private List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public double getTotalSalaries() {
        double totalSalaries = 0;
        for (Employee e : employees)
            totalSalaries += e.getSalary();
        return totalSalaries;
    }

    public void saveEmployees(String filename)
            throws FileNotFoundException {

        PrintWriter pw = new PrintWriter(new File(filename));

        for (Employee e : employees)
            pw.println(e.getName() + ";" + e.getSalary());

        pw.close();

    }

    public void showEmployees() {
        for (Employee e : employees)
            System.out.println(e);
    }

    public void loadCompany(String filename) throws FileNotFoundException, ArrayIndexOutOfBoundsException, NumberFormatException {
        Scanner sc = new Scanner(new File(filename));
        employees.clear();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] words = line.split(";");
            Employee e = new Employee(
                        words[0], Double.parseDouble(words[1]));
                employees.add(e);
        }


    }


    public void saveAsXML(String filename)
    {
        XMLEncoder encoder=null;
        try{
            encoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream(filename)));
        }catch(FileNotFoundException fileNotFound){
            System.out.println("ERROR: While Creating or Opening the File dvd.xml");
        }
        encoder.writeObject(employees);
        encoder.close();
    }

}
