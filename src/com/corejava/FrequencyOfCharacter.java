package com.corejava;

public class FrequencyOfCharacter {
	public static void main(String[] args) {
		String str="JaVa";
		str=str.toLowerCase();
		char ch[]=str.toCharArray();
		for(char cha='a';cha<='z';cha++) {
			int count=0;
			for(int j=0;j<ch.length;j++) {
				if(cha==ch[j]) {
					count++;
					
				}
			}
			if(count>0) {
				System.out.println(cha+"-"+count);
			}
			
		}
	}

}
