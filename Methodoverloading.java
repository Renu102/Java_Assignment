package com.lab3.exercises;

public class Methodoverloading {
	
	double res;
	public void calculatePerimeter(int a) {
		
		System.out.println("area of circle");
		res=a*a;
		System.out.println(res);
		
	}
	
	public void calculatePerimeter(int len, int wid) {
		
		System.out.println("area of Rectanagle");
		res=2*len + 2*wid;
		System.out.println(res);
		
	}
	
	public void calculatePerimeter(double leng , double base) {
		
		System.out.println("area of Triangle");
		res=(leng*base)/2;
		System.out.println(res);
	}

	public static void main(String[] args) {
		
		Methodoverloading rv= new Methodoverloading();
		rv.calculatePerimeter(4);
		rv.calculatePerimeter(5, 10);
		rv.calculatePerimeter(10.00, 20.00);
		

	}

}
