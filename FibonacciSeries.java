/**
 * Write a program to print Fibonacci series.
 * Output:
 * Fibonacci Series Upto: 10
 * 0 1 1 2 3 5 8 13 21 34
 */

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Fibonacci Series Upto: 10 ");
		for (int i = 0 ; i <= 10; i++){
			System.out.print(fibonacci(i) + " ");
		}
	}
	
	public static int fibonacci(int number){
		if (number == 0) {
			return 0;
		}
		else if (number == 1) {
			return 1;
		}
		else {
			return fibonacci(number-1) + fibonacci(number-2);
		}
	}

}
