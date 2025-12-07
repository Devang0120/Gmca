import java.util.Scanner;

class CaseCheck {
    String str;

    void acceptString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
    }

    void checkCase() {
        if (str.equals(str.toUpperCase())) {
            System.out.println("The string is in UPPER CASE.");
        } 
        else if (str.equals(str.toLowerCase())) {
            System.out.println("The string is in LOWER CASE.");
        } 
        else {
            System.out.println("The string is in MIXED CASE.");
        }
    }

    void reverseCase() {
        String reversed = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                reversed += Character.toLowerCase(ch);
            } 
            else if (Character.isLowerCase(ch)) {
                reversed += Character.toUpperCase(ch);
            } 
            else {
                reversed += ch;
            }
        }

        System.out.println("Case Reversed String: " + reversed);
    }
}

public class CaseReverseObject {
    public static void main(String[] args) {

        CaseCheck c1 = new CaseCheck();

        c1.acceptString();
        c1.checkCase();
        c1.reverseCase();
    }
}
