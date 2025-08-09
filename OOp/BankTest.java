package com.practice.oop;

public class BankTest {
    public static void main(String[] args) {

        // Create object
        BankAccount acc = new BankAccount();

        // Set details
        acc.setAccountNumber("123456");
        acc.setAccountHolderName("Unnati Patil");
        acc.setBalance(5000);

        // Show details
        System.out.println("Account Holder: " + acc.getAccountHolderName());
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Balance: ₹" + acc.getBalance());

        // Deposit and Withdraw
        acc.deposit(2000);
        System.out.println("New Balance: ₹" + acc.getBalance());

        acc.withdraw(1000);
        System.out.println("New Balance: ₹" + acc.getBalance());

        acc.withdraw(10000);  // should show error
    }
}
