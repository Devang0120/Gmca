class Vehicle {
    protected String vehicle_type ;
    public Vehicle(String vehicle_type){
        this.vehicle_type = vehicle_type;
    }
    void display(){
        System.out.println("Vehicle Type : "+vehicle_type);
    }
}
class CarDetails extends Vehicle {
    private String model_type,company_name; 

    CarDetails(String vehicle_type,String model_type,String company_name){
        super(vehicle_type);
        this.model_type = model_type;
        this.company_name = company_name;
    }
    void display(){
        System.out.println("-------------------------");
        super.display();
        System.out.println("Model Type :"+model_type);
        System.out.println("Company Name : "+company_name);
        System.out.println("-------------------------");
    }
}
public class Car {  
    public static void main(String [] args){
        CarDetails c1 = new CarDetails("Four Wheeler", "Suv", "TATA");
        CarDetails c2 = new CarDetails("Four Wheeler", "Luxury", "BMW");
        c1.display();
        c2.display();
 
    }
}
