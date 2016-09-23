import java.util.*;

public class primenumbersequence {

	public static void main(String args[]){
		
		boolean isPrime = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number till which the prime number sequence has to be generated :- ");
		int input = sc.nextInt();
		
		for (int i = 2; i < input; i++){
			for (int j = 2; j < i; j++){
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime){
				System.out.print(i + " ");
			}
			isPrime = true;
		}
	}
}