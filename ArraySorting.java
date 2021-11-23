package com.lab7.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
	
	public static void intarrysort(int [] arr) {
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n; i++) {
			for(int j=1; j<(n-i); j++) {
				if((arr[j-1]) > arr[j]) {
					temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp; 
				}
			}
		}
		
	}
	
	public static void stringsort(String[] arr) {
		String temp="";
		int len=arr.length;
		for(int i=0; i<len-1; i++) {
			for(int j=i+1; j<len; j++) {
				if((arr[i].compareTo(arr[j])>0)) {
					temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp; 
				}	
			}
		}
		
	}
	
	public static void display(int[] arr) {
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the integer to sort(max 8)");
		int[] b= new int[8];
		
		for(int i=0 ; i<b.length; i++) {
			b[i]=scan.nextInt();
			
		}
		
		display(b);
		intarrysort(b);
		display(b);
		
		int[] a= {10,2,4,45,8};
		display(a);
		intarrysort(a);
		display(a);
		
		String [] str= {"Ciaz", "Alto", "Swift", "Dezire", "Brezza"};
		System.out.println(Arrays.toString(str));
		stringsort(str);
		System.out.println(Arrays.toString(str));
		

	}

}
