class MyThread extends Thread {
    public void run() {
        System.out.println("This is child thread");
    }
}

public class SimpleThread{
    public static void main(String[] args) {
        MyThread t = new MyThread(); 
        t.start();                  
        System.out.println("This is main thread");
    }
}
