package com.java.practice;

public class Thirty {
	public static boolean check(int a, int b) {
		if(a+b==30 || a==30 || b==30)
		{
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(" a=14, b=16 => "+check(14,16));
		System.out.println(" a=14, b=30 => "+check(14,30));
		System.out.println(" a=30, b=16 => "+check(30,16));
		System.out.println(" a=13, b=26 => "+check(13,26));
	}
}
