import java.util.Scanner;

class Exception1{

    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // first block
        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;  
            System.out.println("Division Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } finally {
            System.out.println("This is finally block for division");
        }

        // sencond block
        try {
            System.out.print("\nEnter your age: ");
            int age = sc.nextInt();

            checkAge(age); 

        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This is finally block for age check");
        }

        // third block
        try {
            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error occurred");
        } finally {
            System.out.println("This is finally block for array");
        }
    }
}
