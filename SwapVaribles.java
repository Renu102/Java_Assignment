package com.lab2.exercises;

public class SwapVaribles {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println("before swapping");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		//a=a+b;
		//b=a-b;
		//a=a-b;
		a=(b-a)+(b=a);
		
			
		System.out.println("after swapping");
		System.out.println("a= "+a);
		System.out.println("b= "+b);

	}

}
