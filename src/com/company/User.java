package com.company;

public class User {
    private String username;
    private int balance;

    User(String username, int balance) {
        this.balance = balance;
        this.username = username;
    }

    User(String username) {
        this.balance = 0;
        this.username = username;
    }


    public void print() {
        System.out.println("username = " + username + ", balance = " + balance);
    }

    int getBalance() {
        return balance;
    }

    String getUsername() {
        return username;
    }

    void setUsername(String newValue) {
        if(newValue != "")
            username = newValue;
    }

    void setBalance(int newValue) {
        if(newValue >= 0)
            balance = newValue;
    }

    void donate(int newValue) {
        if(newValue > 0)
            balance += newValue;
    }
}
