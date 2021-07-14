package com.java.practice;

public class SumOfInt {

	public static int sum(int a, int b) {
		int c=0;
		if(a==b) {
			c=(a*2)*3;
		}else {
			c=a+b;
		}
		return c;
	}
	public static void main(String[] args) {
		System.out.println("a=3 ,b=6 => "+sum(3,6));
		System.out.println("a=4 ,b=4 => "+sum(4,4));
	}
}
