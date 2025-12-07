// package Exam;
interface Exam1 {
    boolean Pass(int mark);
}
interface Classify {
    String Division(int average);
}
class Result implements Exam1, Classify {
    public boolean Pass(int mark) {
        return mark >= 50;
    }

    public String Division(int average) {
        if (average >= 60)
            return "First";
        else if (average >= 50)
            return "Second";
        else
            return "No division";
    }
}
public class Exam{
    public static void main(String[] args) {
        Result r = new Result();

        int mark = 67;
        int avg = 67;

        System.out.println("Pass Status: " + r.Pass(mark));
        System.out.println("Division: " + r.Division(avg));
    }
}
