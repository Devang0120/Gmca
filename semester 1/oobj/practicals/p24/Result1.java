package student;

public class Result1 {

    public int rollno,java,rdbms,wtp;
	public String name,course;
    public Result1(Student s1,int...arr){
        this.rollno = s1.rollNo;
        this.name = s1.name;
        this.course = s1.course;
        this.java = arr[0];
        this.rdbms = arr[1];
        this.wtp = arr[2];
    }

    public void displayResult(){
        System.out.println("--------------------------------------");
        System.out.println("Name of Student : "+name);
        System.out.println("Name of Rollno : "+rollno);
        System.out.println("Name of Course : "+course);
        System.out.println("Marks of Student: "+java+","+rdbms+","+wtp);
        System.out.println("Total Marks : "+(java+rdbms+wtp));
        System.out.println("Percentage : "+(java+rdbms+wtp)/3.0);
        System.out.println("--------------------------------------");
    }
}
