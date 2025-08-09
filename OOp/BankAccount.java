package com.practice.oop;


class BankAccount {
    // 🔐 Private variables (encapsulation)
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // ✅ Setter methods
    public void setAccountNumber(String acc) {
        accountNumber = acc;
    }

    public void setAccountHolderName(String name) {
        accountHolderName = name;
    }

    public void setBalance(double bal) {
        if (bal >= 0) {
            balance = bal;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // ✅ Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // ✅ Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // ✅ Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }
}



