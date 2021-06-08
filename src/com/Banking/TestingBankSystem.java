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

        int subMenu =0;
        boolean isDone = false;

        // loop until, the program is done
        while(!isDone){
            // prompt the user for the menu
            int selectedMenu = GetData.getInt(
                    "Welcome to XBank\n\t1. Create account\n"
                            + "\t2. Delete account\n\t3. Deposit\n"
                            + "\t4. Withdrawal\n\t5. Customer Log\n"
                            + "\t6. List of deleted accounts\n\t7. Quit");

            switch (selectedMenu){

                case 1:
                    String name = GetData.getString("Name: ");
                    String lname = GetData.getString("Last name: ");
                    String accountNumber = GetData.getString("Account number: ");
                    int age = GetData.getInt("Age: ");
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
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Sorry but that is " +
                            "not one of the options");
                    break;
            }
        }
    }
}
