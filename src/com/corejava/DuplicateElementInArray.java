package com.corejava;

public class DuplicateElementInArray {
	public static void main(String[] args) {
		int a[]= {3,5,1,5,3,3};
		System.out.println("duplicate elements are:");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
					
				}
			}
		}
	}

}
