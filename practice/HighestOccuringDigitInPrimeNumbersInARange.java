package com.ritwika.practice;

import java.util.Arrays;

public class HighestOccuringDigitInPrimeNumbersInARange {

	public static void main(String[] args) {
		int L = 1, R = 20; 
        System.out.println("Highest occuring digit in prime numbers between "+L+" "
        		+ "to "+R+" is:" +maxDigitInPrimes(L, R)); 

	}

	private static int maxDigitInPrimes(int l, int r) {
		boolean prime[]=new boolean[r+1];
		Arrays.fill(prime, true);
		prime[0]=false;
		prime[1]=false;
		seiveOfEratosthenes(prime,r);
		int[] freq=new int[10];
		for(int i=l;i<=r;i++) {
			if(prime[i]) {
				
				int temp=i;
				while(temp>0) {
					
					freq[temp%10]++;
					temp=temp/10;
				}
			}
		}
		
		int max=freq[0];
		int digit=0;
		
		for(int i=0;i<freq.length;i++) {
			System.out.println(freq[i]);
			if(freq[i]>max) {
				max=freq[i];
				digit=i;
			}
		}
		return digit;
	}

	private static void seiveOfEratosthenes(boolean[] prime, int r) {
		for(int p=2;p*p<=r;p++) {
			if(prime[p]==true) {
				
				for(int i=p*2;i<=r;i=i+p)
					 prime[i]=false;
			}
		}
		
	}

}
