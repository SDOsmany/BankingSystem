package com.Banking;

public class Customer {
    private String name, lastname, accountNumber;
    private int age;

    public Customer(String name, String lastname, int age){
        this.name = name;
        this.lastname = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
