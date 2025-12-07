import student.Student;
import student.Result1;


public class Package1{
	public static void main(String[] args){
		Student s1 = new Student(1,"abc");
		
		int[] tempMarks = {96, 68, 77};
		Result1 r1 = new Result1(s1, tempMarks);
		
		r1.displayResult();
	}
}
