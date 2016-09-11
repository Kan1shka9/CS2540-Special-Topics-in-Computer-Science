/**
 * Take GPA from the user and give him appropriate grade.
 */

import java.util.*;

public class gpa {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your GPA :- ");	
		double gpa = in.nextDouble();
			if(gpa >= 3.7)
			{
				System.out.println("A");
			}
			else if(gpa > 3.3 & gpa < 3.69)
			{
				System.out.println("B+");
			}
			else if(gpa > 3.0 & gpa <3.29)
			{
				System.out.println("B");
			}
	}
	
}
