package com.lab5.exercises;

import java.util.Scanner;

public class PrimeNumberInRange {

	public static void main(String[] args) {
		int x,y;
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the two numbers to find the prime numbers in 2 inputs range");
		x=scan.nextInt();
		y=scan.nextInt();
		
		for(int k=x; k<=y; k++) {
			int count=0;
			//int rem;
			for (int i=2; i<=k/2; i++) {

				if(k%i==0) {
					count++;
				}
				

			}
			if(count>0) {
				System.out.println(k+" is a Prime number");
			} else {
				System.out.println(k+" is NOT a Prime number");
				
			}
		}


	}

}
