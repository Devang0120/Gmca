
public class CountFrequency {

    public static void main(String []args){
        if (args.length == 0) {
            System.out.println("Please provide a string as a command-line argument.");
            return;
        }
        // combine String 
        String join = String.join(" ",args);

        int letters = 0;
        int digits = 0 ;

        // loop for each character
        for(int i=0;i<join.length();i++){
            char ch = join.charAt(i);
            if(Character.isLetter(ch))
            letters++;
            else if(Character.isDigit(ch))
            digits++;
        }

        System.out.println("String : "+join);
        System.out.println("Number Of Letter : "+letters);
        System.out.println("Number  Of Digits : "+digits);
    }
    
}
