package com.corejava;

public class BiggestElementInArray {
	public static void main(String[] args) {
		int a[]= {6,5,8,3,4};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Biggest no is:"+max);
	}

}
