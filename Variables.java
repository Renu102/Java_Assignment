package com.lab2.exercises;

class Tester {

	
	public static void printInt(int a) {
		System.out.println(a);
		}
	
	public static void printDouble(double d) {
		System.out.println(d);
	}
	
	public static void printChar(char c) {
		System.out.println(c);
	}
	
	public static void printString(String str) {
		System.out.println(str);
	}
	

}

 class Variables extends Tester{
	
	 public static void main(String[] args) {
		 
		 printInt(10);
		 printDouble(200);
		 printChar('M');
		 printString("happen");
		 
		
	 }
}
