import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to be reversed :- ");
		int input = sc.nextInt();
		
		int reverse = 0;
		while (input != 0){
			reverse = (reverse * 10) + (input % 10);
			input = input / 10;
		}
		System.out.print("Number after reversing :- " + reverse);
	}
}
