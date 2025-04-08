package com.pract;

public class NonStaticPrg {
	
	int sal=50000;
	String name="dragon";
	
	int add() {
		String result=sal+name;
		System.out.println(sal+"****"+name);
		return sal;
		
	}
	
	
	
public static void main(String[] args) {
	System.err.println("nonstatic variables and methods access through object only");
	NonStaticPrg n=new NonStaticPrg();
	n.add();
	
}
}
