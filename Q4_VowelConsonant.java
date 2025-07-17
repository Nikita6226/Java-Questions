package com.que;

public class Q4_VowelConsonant {

	public static void main(String[] args) {
		String string="HelloNikita";
		int vowels=0, consonants=0;
		for(char c:string.toLowerCase().toCharArray()) {
			if(Character.isLetter(c)) {
				if("aeiou".indexOf(c)!=-1)
					vowels++;
				else 
					consonants++;
			}				
		}
		System.out.println("Vowels: "+vowels+", Consonats: "+consonants);
	}

}
