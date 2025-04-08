package com.corejava;

public class ReverseWord {
	public static void main(String[] args) {
		String str="Welcome to java";
		String output="";
		String[] words=str.toLowerCase().split(" ");
		for(int i=words.length-1;i>=0;i--) {
			output=output+words[i]+" ";
		}
		System.out.println(output);
		
	}

}
