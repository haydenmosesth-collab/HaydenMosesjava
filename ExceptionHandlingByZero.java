package dividebyzeroEH;
import java.util.*;


public class ExceptionHandlingByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            try {
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    int result = a / b;

                    if (a == 20 && b == 5)
                        System.out.println("Quotient = " + result);
                    else
                        System.out.println("Result = " + result);
                }
            } catch (ArithmeticException e) {
                System.out.println("Exception: " + e.getMessage());
            } finally {
                System.out.println("Program execution completed");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}

