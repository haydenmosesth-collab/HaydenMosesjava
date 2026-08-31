package primeornot;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PrimeOrNot {

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Check whether a single number is prime
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if (isPrime(n)) {
                System.out.println(n + " is Prime");
            } else {
                System.out.println(n + " is Not Prime");
            }

            // Find prime numbers between two numbers
            System.out.print("\nEnter the starting number and ending number: ");
            int start = sc.nextInt();
            int end = sc.nextInt();

            System.out.println("Prime numbers between " + start + " and " + end + ":");

            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter valid integers.");
        }

        sc.close();
    }
}