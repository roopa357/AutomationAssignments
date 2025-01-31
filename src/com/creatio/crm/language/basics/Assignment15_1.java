package com.creatio.crm.language.basics;

public class Assignment15_1 {

	public static void main(String[] args) {
		String input = " I Love Dogs ";
		input = input.replaceAll(" ", "").toLowerCase(); // remove spaces and convert to lowercase

		 char[] chars = input.toCharArray();

	        for (int i = 0; i < chars.length; i++) {
	            for (int j = i + 1; j < chars.length; j++) {
	                if (chars[i] != chars[j]) { // check if letters are not the same
	                    System.out.println(chars[i] + "" + chars[j]);
	                }
	            }
	        }


	}

}
