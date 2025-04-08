package com.corejava;

public class OccurancesInJava {
	public static void main(String[] args) {
		String str="welcome ToThe Java, Java is Simple, java is Programmming";
		String word="java";
		String[]words=word.toLowerCase().split(" ");
		int count=0;
		for(String str1:words) {
			if(str1.equals(word)) {
				count++;
				
			}
		}
		System.out.println(count);
	}

}
