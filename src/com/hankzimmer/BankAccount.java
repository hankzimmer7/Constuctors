package com.hankzimmer;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    private String type;

    //Constructors

    //Constructor which update all values
    public BankAccount(String number, double balance, String customerName, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Default constructor with all default values
    public BankAccount() {
        this("56789", 0.0, "Default name", "Default email", "Default phone");
    }

    //Constructor with default account number and balance
    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 0.0, customerName, email, phoneNumber);
    }

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
