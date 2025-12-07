import java.util.*;
public class p6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number A :");
        int a = sc.nextInt();
        System.out.print("Enter number B :");
        int b = sc.nextInt();
        System.out.print("Enter number C :");
        int c = sc.nextInt();
        
        int min = a<b ? (a<c?a:c) : (b<c?b:c);
        System.out.println(min);
    }
}
