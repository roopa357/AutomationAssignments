package com.creatio.crm.language.basics;

public class ArraysLoops_Ass11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Define the array of numbers
		int[] numbers = {12,34,11,36,87,98,93};
		
		//Initialize variables to store the large, secondLargestNumber and thirdLargestNumber values
		int large = Integer.MIN_VALUE;  //Initialize large to the smallest possible integer value
		int secondLargestNumber = Integer.MIN_VALUE; //Initialize secondLargestNumber to the smallest possible integer value
		int thirdLargestNumber = Integer.MIN_VALUE; //Initialize thirdLargestNumber  to the smallest possible integer value

		//Iterate over the array of numbers
        for(int num : numbers) {
			if(num > large) {
				thirdLargestNumber = secondLargestNumber;
				secondLargestNumber = large;
				large = num;
			}
			else if(num > secondLargestNumber && num != large){
				thirdLargestNumber = secondLargestNumber;
				secondLargestNumber = num;
				
			}
			else if(num >thirdLargestNumber && num != large && num != secondLargestNumber) {
				thirdLargestNumber = num;
				
			}
		}
        
        // Print the second and third largest numbers
        System.out.println("Second largest number: " + secondLargestNumber);
		System.out.println("Third largest number: " + thirdLargestNumber);
		
	}
		
}


