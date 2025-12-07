import java.util.*;
public class p5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int temp = num;
    
        // Find lenght of num
        int i = num;
        int count =0;
        while(i>0){
            i = i /10;
            count++;
        }

        //calculation armstrong
        int box = 0;
        while(num>0){
            int rem = num % 10;
            int a = 1;
            for(int j=0;j<count;j++)
                a *= rem;
            box  = box + a;
            num = num / 10;
        }
        // check number is armstong or not
        if(temp == box){
            System.out.println("It is Armstrong Number : "+box);
        }
        else{
            System.out.println("It is not Armstrong Number : "+ box);
        }
    }    
}
