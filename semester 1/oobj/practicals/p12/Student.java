

class Students {
    int en_no,marks,age;
    String name,gender;
    static int count = 0;

    Students(){
        this(0,"Unknown","Other",0);    
    }
    Students(String name,String gender){
        this(10,name,gender,32);
    }

    Students(int en_no, String name, String gender, int marks){
        this.en_no=en_no;
        this.name=name;
        this.gender=gender;
        this.marks=marks;
        count++;

    }

    void display(){
        System.out.println("----------------------------------------------");
        System.out.println("Student Name is "+name+" and Gender is "+gender);
        System.out.println("Enrollment Number : "+en_no);
        System.out.println("Marks : "+marks);
        System.out.println("----------------------------------------------");
    }
}
public class Student {  
public static void main (String []args){
    Students s1 = new Students();
    Students s2 = new Students("Meet","Male");
    Students s3 = new Students(1234,"Devang","Male",95);
    s1.display();
    s2.display();
    s3.display();
    System.out.println("Total Student : "+Students.count);
    } 
}
