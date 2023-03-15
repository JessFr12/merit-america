package com.techelevator;

public class CreditCardAccount implements Accountable{

    private String accountHolder;
    private String accountNumber;
    private int debt;

    public CreditCardAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.debt = 0;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return this.debt = -debt;
    }

    public int getDebt() {
        return debt;
    }


    public int pay(int amountToPay) {
        this.debt -= amountToPay;
        return debt;
    }

    public int charge(int amountToCharge) {
        this.debt += amountToCharge;
        return debt;
    }
}
