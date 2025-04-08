package com.pract;

public class StaticPrg {
	
	static int a=10;
	static int b=20;
	static void display() {
		int result=a+b;
		System.out.println("result is:"+result);

	}
	
	
	
	public static void main(String[] args) {
		System.err.println("static variables calling direct,through class,through object");
		System.out.println("direct calling:"+a);                  //directly calling by their names
		System.out.println("direct calling:"+b);
		display();
		
		
		
		int a1=StaticPrg.a;
		System.out.println("through class name:"+a1);
		int a2=StaticPrg.b;
		System.out.println("through class name:"+a2);
		
		
		StaticPrg s=new StaticPrg();
		System.out.println("through object"+s.a);
		System.out.println("through object:"+s.b);
		
		
	
	}

}
