package com.hankzimmer;

public class Main {

    public static void main(String[] args) {

        //Create bank accounts
        BankAccount myAccount = new BankAccount("12345678",85000,"Hank","hank@gmail.com","619-271-1928");
        BankAccount defaultAccount = new BankAccount();
        System.out.println(myAccount.getCustomerName() + "'s bank account (Account #" + myAccount.getNumber() + ") initially has a balance of $" + myAccount.getBalance());
        System.out.println(defaultAccount.getCustomerName() + "'s bank account (Account #" + defaultAccount.getNumber() + ") initially has a balance of $" + defaultAccount.getBalance());

        //Test the deposit and withdrawal methods
        myAccount.deposit(10000);
        myAccount.withdraw(32000);

        //Create a VIP customer
        VipCustomer charlotte = new VipCustomer("Charlotte", "charlotte@email.com");
        System.out.println("Added a new VIP customer named " + charlotte.getName() + " with a credit limit of $" + charlotte.getCreditLimit() + " and an email address of " + charlotte.getEmail());
    }
}
