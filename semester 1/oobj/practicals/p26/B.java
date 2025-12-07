package mypackb;
import mypack_a.A;

public class B extends A{
    public void displayB(){
        System.out.println("From class B");
        System.out.println("Public Variable : "+x);
        System.out.println("Protected Variable : "+y);
        super.display();
    }
}
