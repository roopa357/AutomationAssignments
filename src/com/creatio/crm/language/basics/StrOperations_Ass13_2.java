package com.creatio.crm.language.basics;

public class StrOperations_Ass13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		String wordToSearch = "Java";

		// Divide into multiple words
        String[] words = paragraph.split(" ");

        // Find total number of occurrences of the word
        int count = 0;
        System.out.println("Word: " + wordToSearch);
        System.out.print("Indexes: ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(wordToSearch)) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Count: " + count);

		

	}

}
