package com.corejava;

public class SecondLargestNum {
public static void main(String[] args) {
	int a[]= {6,7,4,8,9};
	int lar1=a[0],lar2=0;
	for(int i=1;i<a.length;i++) {
		if(a[i]>lar1) {
			lar2=lar1;
			lar1=a[i];
		}
		else if(a[i]>lar2) {
			lar2=a[i];
		}
	}
	System.out.println("sec lar no is:"+lar2);
	System.out.println("first lar1 no is:"+lar1);
}
}
