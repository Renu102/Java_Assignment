package com.lab4.exercises;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		
		double a;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number");
		a=scan.nextDouble();
		
		if(a>0) {
			System.out.println("given number is Positive");
		}else if(a<0) {
			System.out.println("given number is Negative");
		} else if(a==0) {
			System.out.println("given number is Zero");
		}
		

	}

}
