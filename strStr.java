package com.programs2;
import java.util.Arrays;
import java.util.Scanner;

// This program finds the index of the first occurrence of a substring in a string. 

public class strStr {
	public static void main(String[] args) {
	// Declarations and initializations
	StringBuilder text = new StringBuilder("'Write a function to find the index of the first occurrence of a substring in a string.'");
	StringBuilder substring = new StringBuilder("occurrence");
	int indexStrStr = 0;
	int testWordLength = 0;
			
	// Printing the given text
	System.out.println("Text:\n" + text);
			
	// Implementing string matching
		loop1: for (int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == substring.charAt(0)) {
				for (int j = 0; j < substring.length(); j++) {					
					if(text.charAt(i+j) == substring.charAt(j)) {										
						testWordLength += 1;
					}
					else if(text.charAt(i+j) != substring.charAt(j)) {
						testWordLength = 0;
					}
					if (testWordLength == substring.length()) {
						indexStrStr = i;
						break loop1;
					}
				}
			}	
		}
	// Printing result
	System.out.println("Index of the first occurrence of substring '" + substring + "' is: " + indexStrStr);
	}
}
