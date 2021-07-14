package com.java.practice;

public class Replace {
	public static String replace(String str) {
		String first = String.valueOf(str.charAt(0));
		String last = String.valueOf(str.charAt(str.length()-1));
		str = str.replaceFirst(last,first);
		return str.replaceFirst(first,last);
	}
	public static void main(String[] args) {
		System.out.println("String = abhishek => "+ replace("abhishek"));
		System.out.println("String = look => "+ replace("look"));
	}
}
