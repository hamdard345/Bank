/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank;

import java.util.Date;

/**
 *
 * @author HP
 */
public class User {
    // Static variable to keep track of the next available user ID
    private static int nextUserID = 1;
    
    //instance variable for user attributes
    private int userID;
    private String name;
    private String address;
    private Date dob;
    
    // Constructor to initialize user attributes and assign a unique user ID
    public User(String name, String address, Date dob) {
        this.userID = nextUserID++;
        this.name = name;
        this.address = address;
        this.dob = dob;
    }

    /**
     * @return the nextUserId
     */
    public static int getNextUserId() {
        return nextUserID;
    }

    /**
     * @param aNextUserId the nextUserId to set
     */
    public static void setNextUserId(int aNextUserId) {
        nextUserID = aNextUserId;
    }

    /**
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.address = Address;
    }

    /**
     * @return the dob
     */
    public Date getDate() {
        return dob;
    }

    /**
     * @param date the dob to set
     */
    public void setDate(Date date) {
        this.dob = date;
    }
    //method to view user details
    public String viewDetails (){
        return "User ID: " + userID + "\nName: " + name + "\nAddress: " + address + "\nDate of Birth: " + dob;
   
    }
    
}
