package com.pluralsight;

public class BankAccount extends Account{

    public BankAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    public void deposit (double amount){
        double balance = this.getBalance() + amount;
        this.setBalance(balance);
    }

    public void withdraw (double amount){
        this.setBalance(this.getBalance() - amount);
    }

    @Override
    public double getValue() {
        return this.getBalance();
    }
}
