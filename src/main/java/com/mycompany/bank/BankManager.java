/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank;

import java.util.Date;

/**
 * BankManager class manages overall banking operations
 *
 * @author HP
 */
public class BankManager {

    private UserDatabase userDatabase = new UserDatabase();
    private AccountDatabase accountDatabase = new AccountDatabase();

    //method to create a new user 
    public User createUser(String name, String address, Date dob) {

        User newUser = new User(name, address, dob);
        userDatabase.AddUser(newUser);
        return newUser;

    }

    //method to open a new account
    public Account openAccount(User user, String accType) {

        Account newAccount = new Account(accType);
        accountDatabase.AddAcount(newAccount);
        return newAccount;
    }
    
    // method to transfer fund between accounts
    public boolean transferFunds(Account source, Account target, double amount){
    return source.transfer(target, amount);
    }
}
