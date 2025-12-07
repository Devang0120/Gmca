class RunThread implements Runnable{

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" "+(i+1));
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class RunnableThread {
  public static void main(String []args){
    RunThread obj = new RunThread();
    Thread t1 = new Thread(obj);
    t1.setName("Thread is Runing");
    t1.start();
  }  
}
