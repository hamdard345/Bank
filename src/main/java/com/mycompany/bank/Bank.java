/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bank;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Bank {

    public static void main(String[] args) {
        BankManager bankManger = new BankManager();
        
        // create a user and open an account 
        User user1 = bankManger.createUser("john Doe", "123 Main Street", new Date());
        Account account1 = bankManger.openAccount(user1, "Savings");
        
        // deposit and withdraw
        account1.deposit(1000.0);
        account1.withdraw(200.0);
        
        System.out.println(account1.viewStatement());
        
        // Create another user and open another account
        User user2 = bankManger.createUser("Jane Doe", "456 Oak St", new Date());
        Account account2 = bankManger.openAccount(user2, "Checking");
        
        //transfer funds between accounts
        bankManger.transferFunds(account1, account2, 100.0);
        System.out.println(account1.viewStatement());
        System.out.println(account2.viewStatement());
        
    }
}
