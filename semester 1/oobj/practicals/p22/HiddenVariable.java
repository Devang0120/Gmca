class A{
     static int x = 51;
}

class B extends A{
    int x = 10;

    void display(){
        System.out.println("X From Class B : "+x);
        System.out.println("X From Class A : "+super.x);
    }
}
public class HiddenVariable {
    public static void main(String [] args){
        B b1 = new B();
        b1.display();
    }
}
