package day02assignment;

import java.util.Scanner;

public class Vowel {
	    public static void main(String ...args) {
	    	
	    	int counter=0;
	    	Scanner scan=new Scanner(System.in); 
			System.out.println("Enter a string in lower case: "); 
			String str=scan.nextLine();
	        for(char i : str.toCharArray()) {
	        	if(i =='a'||i=='e'||i=='i'||i=='o'||i=='u') {
	        	counter++;
	        	}
	        }
	    	System.out.println("Number of vowels are "+" "+counter); 
	    }
}
