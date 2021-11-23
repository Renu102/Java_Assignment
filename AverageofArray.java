package com.lab6.exercises;

public class AverageofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] arr= new double[5];
		arr[0]=12;
		arr[1]=20;
		arr[2]=5;
		arr[3]=17;
		arr[4]=9;
		
		double sum=0;
		
		for(int i=0; i<arr.length; i++) {
			
			sum=sum+arr[i];
		}
		
		double avg=sum/arr.length;
		System.out.println(arr.length);
		System.out.println("average length of array is="+avg);

	}

}
