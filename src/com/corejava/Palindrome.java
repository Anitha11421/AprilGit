package com.corejava;

public class Palindrome {
	public static void main(String[] args) {
		int n=121;
		int remainder,sum=0,original;
		original=n;
		while(n>0) {
			remainder=n%10;
			sum=sum*10+remainder;
			n=n/10;
			
		}
		if(original==sum) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
