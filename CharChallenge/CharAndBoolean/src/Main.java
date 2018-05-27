public class Main {

    public static void main(String[] args) {
/*
        BankAccount bank = new BankAccount();

        bank.depositFunds(5000);
        bank.withdrawFunds(300);
        bank.depositFunds(7500);
        bank.withdrawFunds(400);
        bank.withdrawFunds(80000);
*/

VipCustomer andrewVIP = new VipCustomer("Andrew",152000);

        System.out.println("Customer Name is " + andrewVIP.getName() + "\nCredit Limit is $" + andrewVIP.getCreditLimit() + "\n Email Address is " + andrewVIP.getEmailAddress());


    }

    public int noTeenSum(int a, int b, int c){
        return(fixTeen(a)+fixTeen(b)+fixTeen(c));
    }

    public int fixTeen(int n){
        if((n>=13&&n<=14)||(n>=17&&n<=19)){
            return 0;
        }
        return n;
    }


}
