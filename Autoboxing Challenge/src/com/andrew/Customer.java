package com.andrew;

import java.util.ArrayList;

/**
 * Created by Andrew on 08-May-18.
 */
public class Customer {
    private String CustomerName;
    private ArrayList<Double> transationList = new ArrayList<>();

    public Customer(String customerName, Double initialTransation) {
        CustomerName = customerName;
        transationList.add(initialTransation);
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void addTransaction(double transaction){
        transationList.add(transaction);
    }

    public void printTransactionList(){
        for(int i=0; i < transationList.size(); i++){
            System.out.println("Transaction" + (i+1) + ": " + transationList.get(i));
        }
    }
}
