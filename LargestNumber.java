package com.lab4.exercises;

public class LargestNumber {
	

	public static void main(String[] args) {
		
		int x=40;
		int y=30;
		int z=60;
		
		if((x>y) && (x>z)) {
			
			System.out.println("largest number is:"+x);
		} else if((y>x) && (y>z)) {
			
			System.out.println("largest number is:"+y);		
		} else {
			System.out.println("largest number is:"+z);
		}
		

	}

}
