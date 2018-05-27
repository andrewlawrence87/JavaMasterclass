/**
 * Created by Andrew on 01-May-18.
 */
public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int deposit) {
        this.balance = (this.balance + deposit);
        System.out.println("You have deposited $" + deposit + "\n Your total balance is now $"+ balance + "\n");
    }

    public void withdrawFunds(int withdrawl){
        if(this.balance-withdrawl>0){
            this.balance = this.balance - withdrawl;
            System.out.println("You have withdrawn $" + withdrawl + "\n Your total balance is now $" + balance + "\n");
        }
        else System.out.println("Insufficient Funds \n");
    }


}
