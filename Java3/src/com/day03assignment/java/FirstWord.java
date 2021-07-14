package com.day03assignment.java;
import java.util.Arrays;

public class FirstWord {
	public static String findFirstWord1(String str1, String str2) {
		String[] arr1 = {str1,str2};
		Arrays.sort(arr1);
		return arr1[0];

	}
	public static char findFirstWord(String str1, String str2) {
		char[] ch= (str1+str2).toCharArray();
		Arrays.sort(ch);
		return ch[0];
	}
	public static void main(String[] args) {
		char res = findFirstWord("dhilpe","abhishek");
		System.out.println(res);
		
	}
}
