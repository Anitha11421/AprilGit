package com.corejava;


public class Armstrong {
	public static void main(String[] args) {
		int n=153;
		int remainder,sum=0,original;
		int length=String.valueOf(n).length();
		original=n;
		while(n>0) {
			remainder=n%10;
			sum+=Math.pow(remainder, length);
			n=n/10;
			
		}
		if(original==sum) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
	}
}
