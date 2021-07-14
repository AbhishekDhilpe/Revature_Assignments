package com.day03assignment.java;

public class Alphabets {
	static char[] getAlphabetArray() {
		
		char[] charArray= new char[26];
		for(int i=0;i<26;i++) {
			charArray[i]=(char)(97+i);
		}
		return charArray;
	}
	public static void main(String[] args) {
		System.out.println(getAlphabetArray());
	}
}
