package com.hankzimmer;

public class Main {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.setCustomerName("Hank");
        myAccount.setNumber("12345678");
        myAccount.setBalance(85000d);
        myAccount.setEmail("hank@gmail.com");
        myAccount.setPhoneNumber("619-271-1928");
        System.out.println(myAccount.getCustomerName() + "'s bank account (Account #" + myAccount.getNumber() + ") initially has a balance of $" + myAccount.getBalance());

        int depositAmount = 10000;
        myAccount.deposit(depositAmount);

        int withdrawalAmount = 32000;
        myAccount.withdraw(withdrawalAmount);
    }
}
