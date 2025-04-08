package com.corejava;

public class Factorial {
	public static void main(String[] args) {
		int n=5;int product=1;
		for(int i=1;i<=n;i++) {   //or   for(int i=n;i>0;i--)
			product=product*i;
		}
		System.out.println(product);
	}

}
