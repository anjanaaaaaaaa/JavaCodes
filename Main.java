package com.anjanacodes;

public class Main {

    public static void main(String[] args) {
	Banking object = new Banking("Madhu", 10000);
	object.deposit(5000);
	object.withdraw(1000);
	System.out.println("Owner "+ object.getOwner());
	System.out.println("Balance " + object.getBalance());
    }
}
