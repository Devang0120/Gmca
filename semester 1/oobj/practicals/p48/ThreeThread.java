class Threads extends Thread{
    public void run(){
        if(this.getName().equals("A")){
            for(int i=0;i<20;i++){
                System.out.println("Thread A is Runing Number is : "+(i+1));
            }
        }
        else if(getName().equals("B")){
            for(int i=0;i<30;i++){
                System.out.println("Thread B is Runing Number is : "+(i+1));
            }
        }
        else if(getName().equals("C")){
             for(int i=0;i<15;i++){
                System.out.println("Thread C is Runing Number is : "+(i+1));
            }
        }
    } 
}
public class ThreeThread {
    public static void main(String []args){
        Threads t1 = new Threads();
        Threads t2 = new Threads();
        Threads t3 = new Threads();
        t1.setName("A");
        t2.setName("B");
        t3.setName("C");
        t1.start();
        t2.start();
        t3.start();
    }    
}
