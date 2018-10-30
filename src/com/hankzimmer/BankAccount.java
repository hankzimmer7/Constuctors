package com.hankzimmer;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    private String type;

    //Set methods
    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Get methods

    public String getNumber() {
        return this.number;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getType() {
        return type;
    }

    //Methods for depositing and withdrawing funds
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited $" + amount + " into " + this.customerName + "'s bank account. The balance is now $" + this.balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrew $" + amount + " from " + this.customerName + "'s bank account. The balance is now $" + this.balance);
        } else {
            System.out.println("Insufficient funds for withdrawal of $" + amount + " from " + this.customerName + "'s account. The balance is only " + this.balance + ".");
        }
    }
}
