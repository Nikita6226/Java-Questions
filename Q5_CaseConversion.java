package com.que;
//Convert lowercase to Uppercase n vice versa
public class Q5_CaseConversion {

	public static void main(String[] args) {
		String string="JaVa";
		StringBuilder sb=new StringBuilder();
		for(char c:string.toCharArray()) {
			if (Character.isUpperCase(c)) 
                sb.append(Character.toLowerCase(c));
             else if (Character.isLowerCase(c)) 
                sb.append(Character.toUpperCase(c));
            else 
                sb.append(c); 
		}
		System.out.println(sb.toString());
	}
	
}