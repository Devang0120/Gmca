import java.util.*;
class Student{
    int std_id,total_marks;
    String std_name;
    static int students_total_marks;

    Student(int std_id,int marks[],String std_name){
        this.std_id = std_id;
        this.std_name = std_name;
        for(int i=0;i<marks.length;i++){
            total_marks += marks[i];
        }
    }
    // all Student count marks method
     void calculate(int marks){
            students_total_marks += marks;
        }

     public void display(){
            System.out.println("Student Id : "+std_id+" Name : "+std_name+" Total Marks : "+total_marks);
        }

}
public class StudentLinkedList{
    public static void main(String [] args){
        
        List <Student> m = new LinkedList<Student>();
        m.add(new Student(1,new int[]{85,89,78,85,65},"Devang"));
        m.add(new Student(1,new int[]{87,89,98,85,75},"Meet"));
        m.add(new Student(1,new int[]{75,69,48,65,55},"Kalpesh"));
        m.add(new Student(1,new int[]{55,59,68,75,55},"Sahil"));
        
        Iterator <Student> itr = m.iterator();
        // find particular Student by name
        if(args.length>0 && args.length<2){
            while(itr.hasNext()){
            Student s = itr.next();
            if(args[0].equalsIgnoreCase(s.std_name)){
                s.display();
                }
            }
        }
        else {
             // display and calculate method call
             while(itr.hasNext()){
                Student s = itr.next();
                s.calculate(s.total_marks);
                s.display();
        }
            System.out.println("All Students Marks : "+Student.students_total_marks);
        }   
    }
}