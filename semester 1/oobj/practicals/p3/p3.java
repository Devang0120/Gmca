import java.util.*;
public class p3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to check is palindrome Number or Not : ");
        int num = sc.nextInt();
        int temp = num;
        int box = 0;
        while(num>0){
            int rem = num % 10;
            box = box * 10 + rem;
            num = num / 10;  
        }
        if(temp==box){ 
            System.out.print("It is Palindrome Number : "+box);
        }  
        else{
            System.out.println("It is not Palindrome Number : "+box);
        }     
    }
}