
class This{
    int en_no,marks;
    String name,gender;
    static int count = 0;

    This(){
        this(0,"Unknown","Other",0);
    }
    This(int en_no,String name, String gender, int marks){
        this.en_no=en_no;
        this.name=name;
        this.gender=gender;
        this.marks=marks;
        this.count++;
    }
    void display(){
        System.out.println("----------------------------------------------");
        System.out.println("Student Name is "+name+" and gender is "+gender);
        System.out.println("Enrollment no : "+en_no);
        System.out.println("Marks : "+marks);
        System.out.println("Total Student : "+this.count);
        System.out.println("----------------------------------------------");
    }
}
public class ThisKeyWord {
    public static void main(String [] args){
        This t1 = new This();
        This t2 = new This(123,"Devang","Male",95);
        t1.display();
        t2.display();
    }
}
