package com.hankzimmer;

public class Main {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.setCustomerName("Hank");
        myAccount.setNumber("12345678");
        myAccount.setBalance(85000d);
        myAccount.setEmail("hank@gmail.com");
        myAccount.setPhoneNumber("619-271-1928");
        System.out.println(myAccount.getCustomerName() + "'s bank account (Account #" + myAccount.getNumber() + ") has a balance of $" + myAccount.getBalance());

        int depositAmount = 10000;
        myAccount.deposit(depositAmount);
        System.out.println("Deposited $" + depositAmount + " into " + myAccount.getCustomerName() + "'s bank account. The balance is now $" + myAccount.getBalance());

        int withdrawalAmount = 30000;
        myAccount.withdraw(withdrawalAmount);
        System.out.println("Withdrew $" + withdrawalAmount + " from " + myAccount.getCustomerName() + "'s bank account. The balance is now $" + myAccount.getBalance());
    }
}
