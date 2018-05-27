package com.andrew;

/**
 * Created by Andrew on 08-May-18.
 */
public class Main {
    public static void main(String[] args){
        Bank bank = new Bank();

        bank.addBranch("Andrew Branch");
    //    bank.addBranch("Jess Branch");

        bank.createCustomer("Andrew Branch","Scully",50.00);
    //    bank.createCustomer("Andrew Branch","Colin",650.00);
    //    bank.createCustomer("Jess Branch","Milo",150.00);
   //     bank.createCustomer("Andrew Branch","Otis",1510.00);

  //      bank.addTransaction("Jess Branch","Scully",456.00);
        bank.addTransaction("Andrew Branch","Scully",456.00);



        bank.showCustomersTransactions("Andrew Branch");

    }
}
