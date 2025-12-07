class Number_1<T>{
    T value ;
    Number_1(T value){
        this.value = value;
    }

    void display(){
        System.out.println("Value : "+value);
    }
}

public class GenericClass {
    public static void main(String [] args){
        // integer obj
        Number_1 <Integer> obj1 = new Number_1<>(115);
        obj1.display();
        
        // float obj
        Number_1 <Float> obj2 = new Number_1<>(151.23f);
        obj2.display();

        return;
    }
}
