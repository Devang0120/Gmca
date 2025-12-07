import java.util.*;
public class p2 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Stating Number : ");
        int s = sc.nextInt();
        System.out.print("Enter Ending Number  : ");
        int e = sc.nextInt();
        System.out.print("Prime Number : ");

        // prime number
        for(int i=s+1;i<=e;i++){
             boolean isprime = true;
            for(int j=2;j<i;j++){
                 if(i % j==0){
                    isprime = false;
                    break;
                }
            }if(isprime){
                System.out.print(i+" ");
            }
        }
        
        //fibonacci number
        int a = 0, b = 1;
        System.out.print("\nFibonacci Number : ");
        while(a<=e){
            if(a>=s){
                System.out.print(a+" ");
            }
            int result = a + b;
            a = b;
            b = result;
        }

     }

}
