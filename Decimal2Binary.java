/**
 * Write a Program to convert integer to Binary:
 * Output:
 * Binary representation of 50: 
 * 110010
 */

import java.util.*;

public class Decimal2Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a decimal number : ");
		int n = sc.nextInt();
		
		int r;
        String s="";
        
        char dig[]={'0','1'};
        
        while(n>0)
        {
            r=n%2; //finding remainder by dividing the number by 2
            s=dig[r]+s; //adding the remainder to the result and reversing at the same time
            n=n/2;
        }
        System.out.println("Binary representation of number : " + s);
        sc.close();
	}
}