import java.util.*;

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number A : ");
        int a = sc.nextInt();
        System.out.print("Enter a Number B : ");
        int b = sc.nextInt();
        System.out.print("Enter a Number C : ");
        int c = sc.nextInt();
        System.out.print("Enter a Number D : ");
        int d = sc.nextInt();

        if(a>b){
            if(b>c){
                if (a>d) System.out.println(a+" is Biggest Number.");
                else System.out.println(d+" is Biggest Number.");
            }
        }
        else if(b>c){
            if (b>d) System.out.println(b+" is Biggest Number.");
            else System.out.println(d+" is Biggest Number.");
        }
        else{
            if(c>d) System.out.println(c+" is Biggest Number.");
            else System.out.println(d+" is Biggest Number.");
        }
    }
}
