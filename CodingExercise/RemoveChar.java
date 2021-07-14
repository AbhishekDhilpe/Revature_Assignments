package com.java.practice;

public class RemoveChar {
	public static String removeChar(int i, String str) {
		if(i==-1) {
			i=str.length()-1;
		}
		return str.replaceFirst(String.valueOf(str.charAt(i)), "");
	}
	public static void main(String[] args) {
		System.out.println("String = abhishek, index = 2 => "+ removeChar(2,"abhishek"));
		System.out.println("String = abhishek, index = -1 => "+ removeChar(-1,"abhishek"));
	}
}
