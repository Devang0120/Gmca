abstract class Account { 

    protected String accountNo; 

    protected double balance; 

 

    public Account(String accountNo, double balance) { 

        this.accountNo = accountNo; 

        this.balance = balance; 

    } 

    public abstract void displayAccountDetails(); 

} 

class SavingAccount extends Account { 

    private double interestRate; 

 

    public SavingAccount(String accountNo, double balance, double interestRate) { 

        super(accountNo, balance); 

        this.interestRate = interestRate; 

    } 

    public void displayAccountDetails() { 

        System.out.println("Savings Account Number: " + accountNo); 

        System.out.println("Balance: " + balance); 

        System.out.println("Interest Rate: " + interestRate + "%"); 

    } 

} 

class CurrentAccount extends Account { 

    private double overdraftLimit; 

 

    public CurrentAccount(String accountNo, double balance, double overdraftLimit) { 

        super(accountNo, balance); 

        this.overdraftLimit = overdraftLimit; 

    } 

 

    public void displayAccountDetails() { 

        System.out.println("Current Account Number: " + accountNo); 

        System.out.println("Balance: " + balance); 

        System.out.println("Overdraft Limit: " + overdraftLimit); 

    } 

} 

public class Prog20 { 

    public static void main(String[] args) { 

        SavingAccount savings = new SavingAccount("101", 5000.0, 5.5); 

        savings.displayAccountDetails(); 

        CurrentAccount current = new CurrentAccount("201", 5000.0, 2500.0); 

        current.displayAccountDetails(); 

    } 

} 