/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class AccountDatabase {

    private ArrayList<Account> Accounts = new ArrayList<>();

    public void AddAcount(Account account) {
        Accounts.add(account);
    }

    // Method to retrieve an account by account number
    public Account getAccountByNumber(int accountNumber) {

        for (Account account : Accounts) {
            if (account.getAccNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
    
}
