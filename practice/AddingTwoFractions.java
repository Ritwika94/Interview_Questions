package com.ritwika.practice;

public class AddingTwoFractions {

	public static void main(String[] args) {
		int num1=1, den1=500, num2=2, den2=1500;  
	    System.out.print(num1+"/"+den1+" + "+num2+"/"+den2+" is equal to "); 
	    addFraction(num1, den1, num2, den2); 

	}

	private static void addFraction(int n1, int d1, int n2, int d2) {
		int d3=gcd(d1,d2);
		d3=(d1*d2)/d3;
		
		int n3=(d3/d1)*n1+(d3/d2)*n2;
		int temp=gcd(n3,d3);
		 n3=n3/temp;
		 d3=d3/temp;
		 System.out.println("Required Sum in Reduced Form:"+n3+"/"+d3);
		
		
	}

	private static int gcd(int d1, int d2) {
		if(d2==0) {
			return d1;
		}
		int x=gcd(d2,d1%d2);
		return x;
	}

}
