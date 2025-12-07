class FinalExample {
    final int n = 501;
    public void display() 
    {
    System.out.println("Value of N is :"+n);
    }
}

public class Final {
    public static void main(String[] args) 
    {
        FinalExample f1 = new FinalExample();
        f1.display();
        System.out.println("Using Object : "+f1.n);
        
    } 
}
