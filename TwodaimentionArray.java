package com.lab6.exercises;

import java.util.Scanner;

public class TwodaimentionArray {

	public static void main(String[] args) {
		
		int arr[][]= new int[10][10];
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int row;
		int col;
		
		System.out.println("Enter the number of rows of array (max is 10)");
		row=scan.nextInt();
		System.out.println("Enter the number of columns of array (max is 10)");
		col=scan.nextInt();
		System.out.println("Enter 2 Daimentional array elements");
		for(int i=0 ;i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Printing 2 Daimention array as like below");
		for(int m=0; m<row; m++) {
			for(int n=0; n<col; n++) {
				
				System.out.print(arr[m][n]+" ");
			}
			System.out.println();
		}

	}

}
