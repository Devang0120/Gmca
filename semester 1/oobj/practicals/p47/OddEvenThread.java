class Threads extends Thread{
    Threads(){

    }
    public void run(){
        for(int i=1;i<=50;i++){
        if(i % 2 !=0){
          System.out.println(i+" is odd Number");
            try{
                sleep(100);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else{
            System.out.println(i+" is even Number");
              try{
                sleep(100);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    }
}
public class OddEvenThread {
    public static void main(String [] args){
    Threads t1= new Threads();
    t1.start();

    }
}
