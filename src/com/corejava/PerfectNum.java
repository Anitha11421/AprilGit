package com.corejava;

public class PerfectNum {
	public static void main(String[] args) {
		int n=6,sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
				
			}
		}
		if(sum==n) {
			System.out.println(n+"is perfectnum");
		}
		else {
			System.out.println(n+"not perfect");
		}
	}

}
