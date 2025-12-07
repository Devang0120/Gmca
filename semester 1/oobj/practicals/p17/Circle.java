class CircleRadius{
    double radius;
    static int count= 0 ;

    CircleRadius(){
        this(1);
        count++;
    }
    CircleRadius(double radius){
        this.radius = radius;
    }
}
public class Circle {
    public static void main(String [] args){
        CircleRadius c1 = new CircleRadius(15);
        CircleRadius c2 = new CircleRadius();
        CircleRadius c3 = new CircleRadius();
        System.out.println("Total Objects created by using default cunsructor : "+CircleRadius.count);

    }
}
