package com.pluralsight;

public class CreditCard extends Account{
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }
    public double charge(double amount){
        return this.balance - amount;
    }
    public double pay(double amount){
        return this.balance + amount;
    }

    @Override
    public double getValue() {
        return -this.balance;
    }
}
