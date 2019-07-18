package javaAlgorithm;

public class Factorial {

	public static void main(String[] args) {
		int input = 5;
		
		System.out.println(fact(input));
		
		int result = 1;
		
		for(int i = 1; i <= input; i++) {
			result *= i;
		}
		
		System.out.println(result);
		
		result = 1;
		
		for(int i = input; i >= 1; i--) {
			result *= i;
		}
		
		System.out.println(result);
	}
	
	public static int fact(int n) {
		if(n <= 1) {
			return n;
		} else {
			return fact(n-1) * n;
	}
	}
}
