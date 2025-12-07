abstract class Shape {
    abstract void area();
}
class Triangle extends Shape{
    float base = 30, height = 15;
    void area(){
        System.out.println("AREA OF TRIANGLE  = " + (0.5 * base * height));
    }
}
class Rectangle extends Shape {
    float length = 30, height = 20;
    void area() {
        System.out.println("AREA OF RECTANGLE  = " + (length * height));
    }
}
class Circle extends Shape {
    float radius = 9;
    void area() {
        System.out.println("AREA OF CIRCLE  = " + (3.14 * radius * radius));
    }
}

public class FindArea {
    public static void main(String [] args){
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
        Circle c  = new Circle();
        t.area();
        r.area();
        c.area();

    }
}
