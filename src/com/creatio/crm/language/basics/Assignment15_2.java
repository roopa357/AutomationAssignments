package com.creatio.crm.language.basics;

public class Assignment15_2 {

	public static void main(String[] args) {
		String s1 = "A man, a plan, a canal: Panama";
		s1 = s1.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		String reverse1 = new StringBuilder(s1).reverse().toString();
		if(s1.equals(reverse1)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		String s2 = "race a car";
	    s2 = s2.replaceAll(" ", "");
        String reverse2 = new StringBuilder(s2).reverse().toString();
		
		if(s2.equals(reverse2)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		

	}

}
