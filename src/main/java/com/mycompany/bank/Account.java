/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank;

/**
 *
 * @author HP
 */
public class Account {

    // Static variable to keep track of the next available account number
    private static int nextAccountNumber = 100001;

    // Instance variables for account attributes
    private int accNumber;
    private String accType;
    private double balance;

    // Constructor to initialize account attributes and assign a unique account number
    public Account(String accType) {
        this.accNumber = nextAccountNumber++;
        this.accType = accType;
        this.balance = 0.0;
    }
    
    public int getAccNumber(){
    return accNumber;
    }
    
    public double getBalance(){
    return balance;
    }
    
    //method to deposit money into the account
    public void deposit(double amount){
        balance += amount;
    }
    
    // method to withdraw money from the account
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }

    }
    // method to transfer fund to another account
    public boolean transfer(Account target, double amount) {
        if (withdraw(amount)) {
            target.deposit(amount);
            return true;
        } else {
            return false;// Transfer failed due to insufficient funds}
        }
    }
        // Method to view account statement
    public String viewStatement() {
        return "Account Number: " + accNumber + "\nAccount Type: " + accType + "\nBalance: " + balance;
    }
}
