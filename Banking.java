package com.anjanacodes;
import java.util.*;
import java.lang.Math;
public class Banking {
    private String owner;
    private double balance;

    public Banking(String owner, double balance)
    {
        this.owner = owner;
        this.balance = Math.max(balance, 0);
    }
public String getOwner(){
    return owner;
}
public double getBalance(){
    return balance;
}




    public double deposit(double amount) {

        if (amount > 0) {
            this.balance = this.balance + amount;
            return balance;
        }

        return 0;
    }
    public double withdraw(double amt){
        if(amt <= this.balance)
        {
            this.balance = this.balance - amt;
            return balance;
        }
        return 0;
    }
}
