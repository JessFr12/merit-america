package com.techelevator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankCustomer {

    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Accountable[] getAccounts() {
         Accountable[] accountable = new Accountable[accounts.size()];
         return accounts.toArray(accountable);
    }

    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
    }

    public boolean isVip(){
        double balance = 0.0;
        for (Accountable account : accounts) {
            balance += account.getBalance();
        }
        return balance >= 25000.0;
    }
}
