package com.corejava;

public class SortElementsGivenArray {
	public static void main(String[] args) {
		int a[]= {5,3,4,6,7,8,1};
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {//j=1/j=i+1
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
		}
	}
		System.out.println("sorted Array is:");
		for(int num:a) {
			System.out.println(num);
		}

}}
