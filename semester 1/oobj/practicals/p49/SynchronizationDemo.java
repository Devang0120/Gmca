
class Account {

    int balance = 1000; 

    synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amount);

        if (balance >= amount) {
            System.out.println("Processing withdrawal for " + Thread.currentThread().getName());

            try {
                Thread.sleep(1000); 
            } catch (Exception e) {
                System.out.println(e);
            }
            balance = balance - amount;
            System.out.println("Withdrawal successful by "+ Thread.currentThread().getName()+ " Remaining Balance = " + balance);
        } 
        else {
            System.out.println("Insufficient balance for " + Thread.currentThread().getName());
            
        }

        System.out.println();
    }
}

class MyThread extends Thread {

    Account acc;

    MyThread(Account acc) {
        this.acc = acc;
    }

    public void run() {
        acc.withdraw(700);
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) {

        Account obj = new Account();   // shared object

        MyThread t1 = new MyThread(obj);
        MyThread t2 = new MyThread(obj);
        MyThread t3 = new MyThread(obj);

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
