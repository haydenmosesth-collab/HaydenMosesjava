package sumnumbers;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N:");
		int n = sc.nextInt();
		if (n<0) {
			System.out.println("Invalid input: N cannot be negative");
		}
		else {
			int sum = 0;
			for(int i=1; i<=n;i++) {
				sum += i;
			}
			System.out.println("Sum from 1 to " + n + " is " + sum);
		}
		
		Scanner dc = new Scanner(System.in);
		int number = dc.nextInt();
		System.out.println("The Number is " +number);
		sc.close();
	}
}
