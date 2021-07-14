package com.java.practice;

public class IfString {
	public static String ifString(String str) {
		if(str.charAt(0)=='i' && str.charAt(1)=='f') {
			return str;
		}else {
		return "if"+str;
		}
	}
	public static void main(String[] args) {
		System.out.println("given string= ifnot o/p=> "+ifString("ifnot"));
		System.out.println("given string= not o/p=> "+ifString("not"));
	}
}
