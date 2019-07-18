package javaAlgorithm;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		System.out.println(gcd(12,18));
		
		int num1 ,num2;
		
		Scanner scan = new Scanner(System.in);
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		int big;
		int small;
		int gcd = 1;
		
		if(num1 > num2) {
			 big = num1;
			 small = num2;
		} else {
			 small = num2;
			 big = num1;
		}
		
		for(int i = 1; i <= small; i++) {
			if(big % i ==0 && small % i ==0) {
				gcd = i;
			}
		}
		
		System.out.println(gcd);
	}
	
	public static int gcd(int a, int b) {

	while(b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return Math.abs(a);
	}

	
}
