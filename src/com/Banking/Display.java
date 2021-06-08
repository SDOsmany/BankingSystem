package com.Banking;
import javax.swing.*;
import java.util.ArrayList;
public class Display {

    public String getFormatedCustomerInfo(BankAccount bankAccount)
    {
        String result = String.format("%30s", bankAccount.getCustomer().getName());
        result += String.format("%30s", bankAccount.getCustomer().getLastname());
        result += String.format("%30s", Integer.toString(bankAccount.getCustomer().getAge()));
        return result;
    }

    public void displayDeletedCustomer(Database bankDB,
                                        int Type_Message) {
        String inventoryResult = "";
        ArrayList<BankAccount> customerLiST = bankDB.getList();
        inventoryResult += String.format("%30s %30s %30s", "Name",
                "Last Name", "Age\n");
        for (int i = 0; i < bankDB.size(); i++)
        {
            inventoryResult += getFormatedCustomerInfo(customerLiST.get(i)) + "\n";
        }
        JTextArea text = new JTextArea(inventoryResult, 10, 50);

        JScrollPane pane = new JScrollPane(text);

        JOptionPane.showMessageDialog(null, pane, "Deleted Account Details",
                Type_Message);
    }

    public void displayCustomerLog(Database bankDB, int Type_Message)
    {

        String inventoryResult = "";
        ArrayList<BankAccount> accounts = bankDB.getList();
        inventoryResult += String.format("%-30s \t%s %10s %15s \n",
                "Name", "Last Name", "Age");
        for (int i = 0; i < bankDB.size(); i++)
        {
            inventoryResult += accounts.get(i).getCustomer().getCustomerInfomation() + "\n";
        }
        JTextArea text = new JTextArea(inventoryResult, 10, 60);

        JScrollPane pane = new JScrollPane(text);

        JOptionPane.showMessageDialog(null, pane, "Customer Log",
                Type_Message);
    }

    public void displaySingleCustomer(BankAccount bankAccount, int Type_Message)
    {

        String customerInfo = "Name: " + bankAccount.getCustomer().getName() + "\n";
        customerInfo += String.format("Last name: ", bankAccount.getCustomer().getLastname()) + "\n";
        customerInfo += "Age: " + bankAccount.getCustomer().getAge() + "\n";

        JTextArea text = new JTextArea(customerInfo, 10, 30);

        JScrollPane pane = new JScrollPane(text);

        JOptionPane.showMessageDialog(null, pane,
                bankAccount.getCustomer().getName() + " Details", Type_Message);
    }
}
