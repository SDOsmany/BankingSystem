package com.Banking;

import javax.swing.*;

public class TestingBankSystem {

    public static void main(String[] args) {
        //Banking System
        //A person has a bank account
        //The person's information is stored in a database
        //We need to get the information from the person
        // A person can make a withdraw and a deposit

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
                    
            }

        }
    }
}
