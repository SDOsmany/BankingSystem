package com.Banking;

import java.util.ArrayList;

public class Database {
    private ArrayList<BankAccount> list;
    private BankAccount bankAccount;

    private int index;
    private boolean found;

    //Database Constructor
    public Database(){
        list = new ArrayList<BankAccount>();
        bankAccount = null;
        index = 0;
        found = false;
    }

    //search for a customer
    public void search(String account){
        found = false;

        int i = 0;
        while (!found && i< list.size()){

            BankAccount c = list.get(i);
            if(c.getCustomer().getAccountNumber().equalsIgnoreCase(account)) {
                bankAccount = c;
                found = true;
                index = i;
            }else{
                i++;
            }
        }
    }

    public void add(BankAccount newBankAccount){
        list.add(newBankAccount);
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

    public BankAccount delete(int i){
        return  list.remove(i);
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public BankAccount getBankAccount(){
        return this.bankAccount;
    }

    public ArrayList<BankAccount> getList()
    {
        return list;
    }

}
