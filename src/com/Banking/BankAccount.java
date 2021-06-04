package com.Banking;

import javax.swing.*;

public class BankAccount {
    private double balance;
    private Customer customer;

    public BankAccount(Customer customer, double balance){
        this.balance = balance;
        this.customer = customer;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double desposit){
        this.balance += desposit;
    }

    public void withdrawal(double withdrawal){
        if(this.balance<withdrawal){
            JOptionPane.showMessageDialog(null, "Sorry but your withdrawal exceeds your " +
                    "balance of $"+getBalance());
        }else {
            this.balance -= withdrawal;
            JOptionPane.showMessageDialog(null, "Your withdrawal was successful " +
                    "your new balance is $"+getBalance());
        }
    }
}
