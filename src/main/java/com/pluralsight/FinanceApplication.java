package com.pluralsight;

public class FinanceApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to your portfolio!");
        Portfolio myPortfolio = new Portfolio("My Wealth", "Yuliia");

        BankAccount checking = new BankAccount("Chase Checking", "1234", 5000.0);
        CreditCard visa = new CreditCard("Capital One", "5678", 300.0);
        House myHome = new House("Austin Condo", 350000.0, 2018, 1200, 2);

        myPortfolio.add(checking);
        myPortfolio.add(visa);
        myPortfolio.add(myHome);

        System.out.println("Your total portfolio value is: " + myPortfolio.getValue());
        System.out.println("The most valuable asset is: " + myPortfolio.getMostValuable());
        System.out.println("The least valuable asset is: " + myPortfolio.getLeastValuable());

        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        BankAccount account2 = new BankAccount("Gary", "456", 1500);

// try to deposit money into both accounts
        account1.deposit(100);
        account2.deposit(100);
    }
}
