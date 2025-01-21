package com.creatio.crm.language.basics;

public class StrOperations_Ass13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//count the total no.of words in the sentence
		String sentence = "Java programming is fun and challenging";
      	String[] words = sentence.split(" ");
        System.out.println("Total number of words: " + words.length);
		
        
        //print the sentence words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        
        
        //covert the first character of each word to upper case and print original sentence
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }
        System.out.println("");
        System.out.print(String.join(" ", words));
       
    
	}

}
