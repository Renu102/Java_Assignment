package com.lab3.exercises;

 interface Tester3 {
	
	void intreast();

}

class Tester4 implements Tester3{
	
	public void intreast(){
		
		System.out.println("Intreast calculation in Tester 3 class");
		
	}
}

class Tester5 implements Tester3 {
	
	public void intreast() {
		System.out.println("Intreast calculation in Tester 4 class");
	}
}

public class BankIntreast{
	
	public static void main(String[] args) {
		
		Tester4 rv1= new Tester4();
		rv1.intreast();
		
		Tester5 rv2=new Tester5();
		rv2.intreast();
		
	}
	
}
