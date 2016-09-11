/**
 * Find whether the given string is palindrome or not.
 */

import java.util.*;

public class palindrome {
	public static void main(String args[]){
		String original, reverse = "";
		boolean isPalindrome = true;
		
		/**
		 * Taking an input from the user
		 */
		Scanner in_string = new Scanner(System.in);
		System.out.print("Enter the string for which the palindrome condition has to be checked :- ");
		original = in_string.nextLine();
		
		/**
		 * Reverse the string
		 */
		int length = original.length();
		
		for(int i = length-1; i >= 0; i--)
		{
			reverse = reverse + original.charAt(i);
		}
		
		char[] first  = original.toLowerCase().toCharArray();
		char[] second = reverse.toLowerCase().toCharArray();
		
		for(int j = 0; j < length; j++){
			if(first[j] != second[j])
			{
				isPalindrome = false;
				break;
			}
			else
			{
				isPalindrome = true;
			}
		}
			
		if (isPalindrome)
		{
			System.out.println(original + " is a palindrome.");
		}
		else
		{
			System.out.println(original + " is not a palindrome.");
		}	
	}
}