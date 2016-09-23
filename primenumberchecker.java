/**
 * Enter a number by a user , then check if that number is prime or not.
 */

import java.util.Scanner;

public class primenumberchecker {

	public static void main(String[] args) {
		
		boolean isPrime = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :- ");
		int n = sc.nextInt();
		
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) {
			System.out.println(n + " is a prime number");
		}
		else {
			System.out.println(n + " is not a prime number");
		}

	}

}