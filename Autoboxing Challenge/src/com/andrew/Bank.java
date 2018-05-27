package com.andrew;

import java.util.ArrayList;

/**
 * Created by Andrew on 08-May-18.
 */
public class Bank {
    ArrayList<Branch> branches = new ArrayList<>();



    public void addBranch(String branchName){
    branches.add(createBranch(branchName));
    System.out.println("Created branch " + branchName);
}

private Branch createBranch(String branchName){
    Branch branch = new Branch(branchName);
    return branch;
}

public void createCustomer(String branch, String customerName, double initalTransaction){
   int branchIndex = getBranchIndex(branch);
    if (branchIndex<0) {
       System.out.println("Branch name not known");
   }
   else if (branches.get(branchIndex).checkCustomers(customerName)){
       System.out.println("Customer already exists");
   }
   else {
        branches.get(branchIndex).addCustomer(customerName,initalTransaction);
    }
}

public void addTransaction(String branch, String customerName, double transaction){
    int branchIndex = getBranchIndex(branch);
    if (branchIndex<0) {
        System.out.println("Branch name not known");
    }
    else if (!(branches.get(branchIndex).checkCustomers(customerName))){
        System.out.println("Customer is not known");
    }
    else branches.get(branchIndex).addTransaction(customerName, transaction);
}

private int getBranchIndex(String branchName){
    int y = -1;
    for (int i = 0; i < branches.size(); i++) {
        if (branchName == branches.get(i).getBranchName()) {
            y = i;
        }
    }
    return y;
}

public void showCustomers(String branchName){
    int branchIndex = getBranchIndex(branchName);
    if (branchIndex >=0){
        branches.get(branchIndex).printCustomers();
    }
    else System.out.println("Branch not known");
}

public void showCustomersTransactions(String branchName){
    int branchIndex = getBranchIndex(branchName);
    if (branchIndex >=0){
        branches.get(branchIndex).printCustomerswithTransactions();
    }
    else System.out.println("Branch not known");
}



}

