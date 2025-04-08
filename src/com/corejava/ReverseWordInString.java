package com.corejava;

public class ReverseWordInString {
	public static void main(String[] args) {
		String str="welcome to the java ";
		String[] words=str.toLowerCase().split("");
		String output="";
		for(int i=str.length()-1;i>=0;i--) { //for(int i=0;i<str.length();i++) 
			output=output+words[i];
			
			
		}
		System.out.println(output);
	}

}
