
class InsufficientFundException extends Exception {
    public InsufficientFundException(String msg) {
        super(msg);
    }
}


class BankAccount {
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs " + amount);
        System.out.println("Current Balance: Rs " + balance);
    }

    void withdraw(double amount) throws InsufficientFundException {
        if (amount > balance) {
            throw new InsufficientFundException("Not Sufficient Fund");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: Rs " + amount);
            System.out.println("Current Balance: Rs " + balance);
        }
    }
}

public class Account {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        try {
            acc.deposit(1000);
            acc.withdraw(400);
            acc.withdraw(300);
            acc.withdraw(500);

        } catch (InsufficientFundException e) {
            System.out.println("Exception Occurred: " + e.getMessage());
        }
    }
}
