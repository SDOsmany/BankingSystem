package com.Banking;

import javax.swing.*;

public class TestingBankSystem {

    public static void main(String[] args) {
        //Banking System
        //A person has a bank account
        //The person's information is stored in a database
        //We need to get the information from the person
        // A person can make a withdraw and a deposit
        Customer customer;
        BankAccount bankAccount;
        Database db = new Database();
        Database deletedAccounts = new Database();
        Display display = new Display();

        int subMenu =0;
        boolean isDone = false;

        // loop until, the program is done
        while(!isDone){
            // prompt the user for the menu
            int selectedMenu = GetData.getInt(
                    "Welcome to XBank\n\t1. Create account\n"
                            + "\t2. Delete account\n\t3. Update an existing account\n"
                            + "\t4. Account log\n\t5. List of deleted accounts\n"
                            + "\t6. Quit\n");

            switch (selectedMenu){

                case 1:
                    String name = GetData.getString("Name: ");
                    String lname = GetData.getString("Last name: ");
                    String accountNumber = GetData.getString("Account number: ");
                    String age = GetData.getString("Age: ");
                    customer = new Customer(name, lname, accountNumber, age);
                    double balance = GetData.getDouble("First deposit: ");
                    bankAccount = new BankAccount(customer,balance);
                    db.add(bankAccount);
                    break;
                case 2:
                    accountNumber = GetData.getString("Account number: ");
                    db.search(accountNumber);
                    if(db.inList()){
                        deletedAccounts.add(db.getBankAccount());
                        db.delete(db.getIndex());
                        JOptionPane.showMessageDialog(null, "The bank account "+
                                accountNumber+" has been deleted");
                    }else {
                        JOptionPane.showMessageDialog(null, "There is not bank account with the \"" + accountNumber
                                + "\" account number");
                    }
                    break;
                case 3:
                    accountNumber = GetData.getString("Please enter the account you wish to update");
                    db.search(accountNumber);
                    if(db.inList()){
                        subMenu = GetData.getInt("1. Insert `1` for a deposit\n" +
                                "2. Insert `2` for a withdrawal\n");
                        switch(subMenu){
                            case 1:
                                double deposit = GetData.getDouble("Enter your deposit ");
                                db.getBankAccount().deposit(deposit);
                                JOptionPane.showMessageDialog(null,"" +
                                        "Deposit successful, your new balance is $"+
                                        db.getBankAccount().getBalance());
                                break;
                            case 2:
                                double withdrawal = GetData.getDouble("Enter the amount to withdrawal ");
                                db.getBankAccount().withdrawal(withdrawal);
                                JOptionPane.showMessageDialog(null,"" +
                                        "Withdrawal successful, your new balance is $"+
                                        db.getBankAccount().getBalance());
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "There is not bank account with the \"" + accountNumber
                                + "\" account number");
                    }
                    break;
                case 4:
                        display.displayCustomerLog(db,1);
                    break;
                case 5:
                    break;
                case 6:
                    isDone=true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Sorry but that is " +
                            "not one of the options");
                    break;
            }
        }
    }
}
