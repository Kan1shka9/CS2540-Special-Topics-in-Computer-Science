/**
 * Enter a number by a user , then check if that number is prime or not.
 */

import java.util.*;

public class primenumberchecker {
	public static void main(String args[]){
		boolean isPrime = true;
		
		/**
		 * Taking an input from the user
		 */
		Scanner num = new Scanner(System.in);
		System.out.print("Enter a number :- ");
		int in_num = num.nextInt();
		
		/**
		 * Prime number checker
		 */
		for (int i = 2; i<=in_num/2; i++)
		{
			int temp = in_num % i;
			if (temp == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		if(isPrime)
		{
			System.out.println(in_num + " is a prime number");
		}
		else
		{
			System.out.println(in_num + " is not a prime number");
		}
	}
}


