package com.java.practice;

public class Within {
	public static boolean check(int n) {
		if((Math.abs(100-n) <= 20) || (Math.abs(300-n) <= 20)) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println("n= 90 => "+check(90));
		System.out.println("n= 600 => "+check(600));
	}
}
