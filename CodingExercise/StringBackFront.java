package com.java.practice;

import java.util.Scanner;

public class StringBackFront {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str =scan.next();
		if(str.length()>0) {
			System.out.println(str.charAt(str.length()-1)+str+str.charAt(str.length()-1));
		}else {
			System.out.println("Invalid string Error!!");
		}
		
	}
}
