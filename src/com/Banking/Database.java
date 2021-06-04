package com.Banking;

import java.util.ArrayList;

public class Database {
    private ArrayList<Customer> list;
    private Customer customer;

    private int index;
    private boolean found;

    //Database Constructor
    public Database(){
        list = new ArrayList<Customer>();
        customer = null;
        index = 0;
        found = false;
    }

    //search for a customer
    public void search(String account){
        found = false;

        int i = 0;
        while (!found && i< list.size()){

            Customer c = list.get(i);
            if(c.getAccountNumber().equalsIgnoreCase(account)) {
                customer = c;
                found = true;
                index = i;
            }else{
                i++;
            }
        }
    }

    public void add(Customer newCustomer){
        list.add(newCustomer);
    }

    public int getIndex(){
        return this.index;
    }

    public boolean inList(){
        return found;
    }

    public int size(){
        return list.size();
    }

    public Customer delete(int i){
        return  list.remove(i);
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public ArrayList<Customer> getList()
    {
        return list;
    }
    
}
