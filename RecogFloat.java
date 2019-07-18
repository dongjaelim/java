package javaAlgorithm;

public class RecogFloat {
	boolean isPrimeNumber = true;
	
	
	public static void main(String[] args) {
		RecogFloat ex = new RecogFloat();
		
		System.out.println(ex.Calc(12)+" is float number.");
	}
	
	public boolean Calc(int a) {
		for(int i = 2; i <= a - 1; i++) {
			if(a % i == 0) {
				isPrimeNumber = false;
			}
		}
		return isPrimeNumber;
	}

}
