package fibonaccisequencerecursion;
import java.util.Scanner;

public class FibonacciSequence {
	static int functionCalls = 0;
	static long fib(int n) {
		functionCalls++;
		if(n == 0) { 
			return 0;
			}
		if(n == 1) { 
			return 1;
			}
		return fib(n - 1) + fib(n - 2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n <= 0) {
			System.out.println("Invalid input");
			sc.close();
			return;
		}
		for (int i = 0; i < n ; i++) {
			System.out.print(fib(i));
			if(i < n-1) {
				System.out.print(" ");
			}
		}
		sc.close();
	}

}
