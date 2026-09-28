package exceptionhandlingfordividebyzero;import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandlingForDivideByZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int dividend = sc.nextInt();
            int divisor = sc.nextInt();

            // Pre-validation of zero divisor
            if (divisor == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            int quotient = dividend / divisor;
            System.out.println("Result = " + quotient);
        }

        catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }

        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        finally {
            System.out.println("Program execution completed");
        }

        sc.close();
    }
}