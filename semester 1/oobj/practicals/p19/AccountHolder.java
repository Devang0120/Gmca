abstract class Account{
    int account_no;
    double balance;

    Account(int account_no,double balance){
        this.account_no = account_no;
        this.balance  = balance;
    }

    void deposite(double amount){
        balance += amount;
    }

    void balanceCheck(){
        System.out.println("Total Balance is : "+balance);
    }

}

class Saving extends Account{
    float interest_rate;

    Saving(int account_no,double balance,float interest_rate){
        super(account_no,balance);
        this.interest_rate = interest_rate;
    }

    void getWithdraw(int amount){
        if(amount<=balance){
            balance -= amount;
        System.out.println(amount+" Amount Withdraw Successfully"); 
        }
        else 
        System.err.println("Insufficient Balance");
    }

    void setInterest(){
        double total_interest = (balance * interest_rate)/100.0; 
        balance += total_interest;
        System.out.println("Total Interest is : "+total_interest);
    } 
}

class Current extends Account {
    double ol ;

    Current(int account_no, double balance, double ol){
        super(account_no, balance);
        this.ol  = ol;
    }

    void withdraw(double amount) {
        if (amount <= (balance + ol)) {
            balance -= amount;
            System.out.println(amount+" Amount Withdraw Successfully");
        } else {
            System.out.println("Overdraft limit exceede!");
        }
    }


}


public class AccountHolder {
    public static void main(String []args){
        Saving a1 = new Saving(101,15026,5.6f);
        System.out.println("Saving Account");
        System.out.println("-------------------------------");
        a1.deposite(1000);
        a1.getWithdraw(10526);
        a1.setInterest();
        a1.balanceCheck();
        System.out.println("-------------------------------");

        System.out.println("Current Account");
        System.out.println("-------------------------------");
        Current a2 = new Current(201,29404,15000);
        a2.deposite(2545);
        a2.withdraw(26001);
        a2.balanceCheck();
        System.out.println("-------------------------------");
    }
}
