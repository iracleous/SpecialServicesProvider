package com.codehub.bank;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accountList;

    public Bank(){
        accountList = new ArrayList<>();
    }

    public void addAccount(Account a)
    {
        accountList.add(a);
    }

    public int printListToConsole(){
       // accountList.forEach(System.out::println);
        return accountList.size();
    }

    public double getTotalBalance(){
     return   accountList
                .stream()
                .mapToDouble(Account::getBalance)
                .sum();
    }

    public String getAsJson(){
        JSONArray jsArray = new JSONArray(accountList);
        return jsArray.toString();
    }

    public boolean saveJsonToFile(String filename)
    {
        try (PrintWriter pw = new PrintWriter(
                new File(filename))) {

           pw.println( getAsJson());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    return true;
    }


}
