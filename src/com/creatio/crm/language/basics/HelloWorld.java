package com.creatio.crm.language.basics;

import java.util.logging.Logger;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print the data and ends with new line
		System.out.println("Hello World");
		
		//print the data and stay on same line
		System.out.print("Hello");
		System.out.print("World");
		System.out.println();
		
		//print statements to print with specific format
		System.out.printf("My name is %s and my age is %d.%n", "Roopa", 23);
		
		//print statements to print explicit format of digits
		System.out.format("pi value is approx %.2f",3.14159);
		System.out.println();
		
		//print the char based on ASCII
		System.out.write(65);
		System.out.println();
		
		//print the error messages
		System.err.println("Error while converting ASCII to normal Char");
		
		//print informational message along with time stamp
		Logger.getLogger("MyLogger").info("Error while converting ASCII to normal Char");
		

	}

}
