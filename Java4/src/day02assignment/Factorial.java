package day02assignment;

import java.util.Scanner;

public class Factorial {
	static int factorial(int n) {
		if (n <= 1)
	        return 1;
	    else
	    	return n*factorial(n-1);
		
	}
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in); 
		System.out.println("Factorial:- Enter a number :"); 
		int num=scan.nextInt();
		System.out.println(factorial(num));
	}
}
