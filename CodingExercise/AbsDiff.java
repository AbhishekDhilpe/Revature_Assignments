package com.java.practice;

public class AbsDiff {
	public static int absDiff(int n) {
		if(n>51) {
			return Math.abs(51-n)*3;
		}else {
		return Math.abs(51-n);
		}
	}
	public static void main(String[] args) {
		System.out.println("N= 30, abs diff is "+absDiff(30));
		System.out.println("N= 60, abs diff is "+absDiff(60));
	}
}
