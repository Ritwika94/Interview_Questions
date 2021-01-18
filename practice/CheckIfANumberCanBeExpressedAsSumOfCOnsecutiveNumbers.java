package com.ritwika.practice;

public class CheckIfANumberCanBeExpressedAsSumOfCOnsecutiveNumbers {

	public static void main(String[] args) {
		int n=15;
		System.out.println(canBeSumofConsec(n) ? "true" : "false"); 
		System.out.println(canBeSumofConsec(32) ? "true" : "false"); 

	}

	private static boolean canBeSumofConsec(int n) {
		//checking if n is a power of 2 or not
		return ((n&(n-1))!=0 && n!=0);
	}

}
