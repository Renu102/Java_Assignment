package com.lab7.exercises;

public class LowercaseUppercase {

	public static void main(String[] args) {

		String str="AbCdefGHijklMNOpqRstUVwxyZ@%*234";
		String uper="";
		String lower="";
		String num="";
		String spe="";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 65 && str.charAt(i)<=90) {
				uper=uper+str.charAt(i);
			} else if(str.charAt(i) >= 97 && str.charAt(i)<=122) {
				lower=lower+str.charAt(i);
			} else if (str.charAt(i) >= 48 && str.charAt(i)<=57){
				num=num+str.charAt(i);
			} else {
				spe=spe+str.charAt(i);
			}
		}

		System.out.println(str);
		System.out.println(uper);
		System.out.println(lower);
		System.out.println(num);
		System.out.println(spe);

		System.out.println(str.length());
		System.out.println(uper.length());
		System.out.println(lower.length());
		System.out.println(num.length());
		System.out.println(spe.length());

	}

}
