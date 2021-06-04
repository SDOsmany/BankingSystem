package com.Banking;
import javax.swing.*;
import java.util.ArrayList;
public class Display {

    public String getFormatedCustomerInfo(Customer customer)
    {
        String result = String.format("%30s", customer.getName());
        result += String.format("%30s", customer.getLastname());
        result += String.format("%30s", Integer.toString(customer.getAge()));
        return result;
    }

    public void displayDeletedCustomer(Database customerDB,
                                        int Type_Message) {
        String inventoryResult = "";
        ArrayList<Customer> customerLiST = customerDB.getList();
        inventoryResult += String.format("%30s %30s %30s", "Name",
                "Last Name", "Age\n");
        for (int i = 0; i < customerDB.size(); i++)
        {
            inventoryResult += getFormatedCustomerInfo(customerLiST.get(i)) + "\n";
        }
        JTextArea text = new JTextArea(inventoryResult, 10, 50);

        JScrollPane pane = new JScrollPane(text);

        JOptionPane.showMessageDialog(null, pane, "Deleted Customer Details",
                Type_Message);
    }

    public void displayCustomerLog(Database customerDB, int Type_Message)
    {

        String inventoryResult = "";
        ArrayList<Customer> customerList = customerDB.getList();
        inventoryResult += String.format("%-30s \t%s %10s %15s \n",
                "Name", "Last Name", "Age");
        for (int i = 0; i < customerDB.size(); i++)
        {
            inventoryResult += customerList.get(i).getCustomerInfomation() + "\n";
        }
        JTextArea text = new JTextArea(inventoryResult, 10, 60);

        JScrollPane pane = new JScrollPane(text);

        JOptionPane.showMessageDialog(null, pane, "Customer Log",
                Type_Message);
    }

    public void displaySingleCustomer(Customer customer, int Type_Message)
    {

        String customerInfo = "Name: " + customer.getName() + "\n";
        customerInfo += String.format("Last name: ", customer.getLastname()) + "\n";
        customerInfo += "Age: " + customer.getAge() + "\n";

        JTextArea text = new JTextArea(customerInfo, 10, 30);

        JScrollPane pane = new JScrollPane(text);

        JOptionPane.showMessageDialog(null, pane,
                customer.getName() + " Details", Type_Message);
    }
}
