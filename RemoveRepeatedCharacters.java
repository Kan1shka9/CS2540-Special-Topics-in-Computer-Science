/**
 * Write a Java program to take a String as input( for eg say "google") and remove the repeating characters from this string and display only the non repeating characters in output ( for "google" it should display "le" as output).
 */

import java.util.*;

public class RemoveRepeatedCharacters {
	public static void main(String args[]){
		String new_string;
		Scanner in_string = new Scanner(System.in);
		System.out.print("Enter the string :- ");
		new_string = in_string.nextLine();
		String out_string = remove_repeated_char(new_string);
		System.out.println("String after removing repeated characters : - " + out_string);
		in_string.close();
	}
	
	private static String remove_repeated_char(String str)
	{
	    StringBuilder result = new StringBuilder();
	    HashMap<Character, Integer> items = new HashMap<>();

	    for (int i = 0; i < str.length(); i++)
	    {
	        Character current = str.charAt(i);
	        Integer ocurrence = items.get(current);
	        if (ocurrence == null)
	            items.put(current, 1);
	        else
	            items.put(current, ocurrence + 1);
	    }

	    for (int i = 0; i < str.length(); i++)
	    {
	        Character current = str.charAt(i);
	        Integer ocurrence = items.get(current);
	        if (ocurrence == 1)
	            result.append(current);
	    }
	    return result.toString();
	}
}