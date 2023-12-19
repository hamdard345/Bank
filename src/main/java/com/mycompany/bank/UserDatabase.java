/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank;

import java.util.ArrayList;

/**
 * UserDatabase class manages user data
 * @author HP
 */
public class UserDatabase {
    
    //Array list to store userObject
    private ArrayList<User> users = new ArrayList<>();
    
    public void AddUser(User user){
        users.add(user);
    }
    //method to retrive a user by userId

    public User getUserByID (int userId){
    
        for(User user: users){
            if (user.getUserID() == userId){
            return user;}
            
        }return null; // user not found
    
    }

}
