class Threads extends Thread{
    Threads(){

    }
    public void run(){
        for(int i=0;i<5;i++){
        if(this.getName().equals("Thread1")){
            System.out.println("Thread 1 is Runing ");
            try{
                sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else{
            System.out.println("Thread 2 is Runing ");
              try{
                sleep(4000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    }
}
public class TwoThread {
    public static void main(String [] args){
    Threads t1= new Threads();
    Threads t2= new Threads();
    t1.setName("Thread1");
    t2.setName("Thread2");
    t1.start();
    t2.start();
    }
}
