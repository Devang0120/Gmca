
final class FinalClass {

    final int SPEED_LIMIT = 120;  


    final void displaySpeed() {
        System.out.println("Speed Limit = " + SPEED_LIMIT);
    }
}


public class FinalMethod {
    public static void main(String[] args) {


        FinalClass obj = new FinalClass();
        obj.displaySpeed();

      
    }
}
