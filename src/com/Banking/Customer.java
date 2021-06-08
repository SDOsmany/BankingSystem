package com.Banking;

public class Customer {
    private String name, lastname, accountNumber, age;

    public Customer(String name, String lastname,String accountNumber, String age){
        this.name = name;
        this.lastname = name;
        this.age = age;
        this.accountNumber = accountNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAge() {
        return age;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCustomerInfomation()
    {
        String result = "";
        result += String.format("\t", this.name);
        result += String.format("\t", this.lastname);
        result += String.format("\t", this.age);
        return result;
    }
}
