import java.util.*; 
class Division{
    int num,d;
    float ans = 0.0f;

    Division(int num,int d){
        this.num=num;
        this.d=d;
    }

    void div(){
        try{
        ans = num/(float)d;
         System.out.println("Asnwer is :"+ans);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }

}

public class Div {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num,divisor;
        System.out.print("Enter Number : ");
        num = sc.nextInt();
        System.out.print("Enter Divisor : ");  
        divisor = sc.nextInt();      
        Division d = new Division(num, divisor); 
        d.div();
    }
}
