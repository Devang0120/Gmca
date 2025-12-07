interface Animal {
    void sound();
}

interface Movable {
    void move();
}

class Dog implements Animal, Movable {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void move() {
        System.out.println("Dog run fast");
    }
}


public class Interface {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
        d1.move();
    }
}
