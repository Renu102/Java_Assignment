package com.lab2.exercises;

public class Tester2 {
	
	 int  age=21;
	static String name="veermallesh";
	double sal=1000;
	
	Tester2(){
		
		System.out.println("Tester2 class Constructer");
	}
	
	public static void test1(){
		System.out.println("Name= "+ Tester2.name);
		//System.out.println(("age= "+ age));
		//System.out.println("sal= "+ sal);
	}
	
	public void test2() {
		
		System.out.println(("age= "+ age));
		System.out.println("sal= "+ sal);
	}
	
	
	
	

	public static void main(String[] args) {
		
		test1();
		
		Tester2 rv=new Tester2();
		rv.test2();
		

	}

}
