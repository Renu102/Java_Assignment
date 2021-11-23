package com.lab4.exercises;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {

		char ch;
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the character");
		ch=scan.next().charAt(0);

		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){

			switch(ch) {

			case 'A': 
				System.out.println("its vowel");
				break;

			case 'E': 
				System.out.println("its vowel");
				break;

			case 'I': 
				System.out.println("its vowel");
				break;

			case 'O': 
				System.out.println("its vowel");
				break;

			case 'U': 
				System.out.println("its vowel");
				break;

			case 'a': 
				System.out.println("its vowel");
				break;

			case 'e': 
				System.out.println("its vowel");
				break;

			case 'i': 
				System.out.println("its vowel");
				break;

			case 'o': 
				System.out.println("its vowel");
				break;

			case 'u': 
				System.out.println("its vowel");
				break;

			default:
				System.out.println("its Consonant");

			}
		}

		else {

			System.out.println("Its not a alphabet");

		}

	}

}
