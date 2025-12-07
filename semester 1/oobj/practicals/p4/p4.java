import java.util.*;
public class p4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        System.out.print("Enter Power : ");
        int p = sc.nextInt();
        int box = 1;
        for(int i=1;i<=p;i++){
            box = box * num ;           
        }
        System.out.println("x^n is "+box);

    }
}
