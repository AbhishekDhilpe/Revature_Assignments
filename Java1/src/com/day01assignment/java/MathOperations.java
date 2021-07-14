package com.day01assignment.java;

public class MathOperations {
	static int add(int a,int b) {
		return a+b;
	}
	static int mul(int a,int b) {
		return a*b;
	}
	static int div(int a,int b) {
		return (a/b);
	}
	static int sub(int a, int b) {
		return a-b;
	}
	public static void main(String[] args) {
		System.out.println(add(20,10));
		System.out.println(sub(20,10));
		System.out.println(mul(20,10));
		System.out.println(div(20,10));
		
	}

}
