package com.andrew;

import java.util.ArrayList;

/**
 * Created by Andrew on 08-May-18.
 */
public class Branch {
    private ArrayList<Customer> branchCustomers = new ArrayList<>();
    private String branchName;

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    private Customer createCustomer(String customerName, double initialTransaction) {
        Customer customer = new Customer(customerName, initialTransaction);
        return customer;
    }

    public void addCustomer(String customerName, double initialTransaction) {
        if (initialTransaction < 0){
            System.out.println("Amount cannot be less than 0");
    }
        branchCustomers.add(createCustomer(customerName, initialTransaction));
    }

    public void addTransaction(String cusmtomerName, double transaction) {
        if (transaction < 0) {
            System.out.println("Amount cannot be less than 0");
        }
            int index = findCustomerIndex(cusmtomerName);
            if (index == -1) System.out.println("Customer not found");
            else {
                addTransaction(index, transaction);
            }

    }

    private int findCustomerIndex(String customerName) {
        int y = -1;
        for (int i = 0; i < branchCustomers.size(); i++) {
            if (customerName.equals(branchCustomers.get(i).getCustomerName())) {
                y = i;
            }
        }

        return y;
    }

    private void addTransaction(int customerIndex, double transaction){
        branchCustomers.get(customerIndex).addTransaction(transaction);
    }

    public String getBranchName(){
        return branchName;
    }

    public boolean checkCustomers(String customerName){
        if (findCustomerIndex(customerName)>=0){
                return true;
            }
        else return false;
        }

    public void printCustomers(){
        for (int i = 0; i < branchCustomers.size(); i++) {
            System.out.println("Customer " + (i+1) + ": " +branchCustomers.get(i).getCustomerName());
            }
        }

    public void printCustomerswithTransactions(){
        for (int i = 0; i < branchCustomers.size(); i++) {
            System.out.println("Customer " + (i+1) + ": " +branchCustomers.get(i).getCustomerName());
            branchCustomers.get(i).printTransactionList();
            }
        }
}








