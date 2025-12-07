import java.util.Scanner;

class StringMethods {

    String str;


    void acceptString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
    }

    void displayMethods() {

        System.out.println("Length: " + str.length());
        System.out.println("Trimmed String: '" + str.trim() + "'");
        System.out.println("Upper Case: " + str.toUpperCase());
        System.out.println("Lower Case: " + str.toLowerCase());
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Substring (2 to 6): " + str.substring(2, 6));
        System.out.println("Replace Java with Python: " + str.replace("Java", "Python"));
        System.out.println("Starts with Ja: " + str.startsWith("Ja"));
        System.out.println("Ends with ng: " + str.endsWith("ng"));
    }
}


public class JavaStringMethod{
    public static void main(String[] args) {
        
        StringMethods obj = new StringMethods();

        obj.acceptString();
        obj.displayMethods();
    }
}
