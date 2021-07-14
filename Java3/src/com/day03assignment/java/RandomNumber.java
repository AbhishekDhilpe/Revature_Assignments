package com.day03assignment.java;

public class RandomNumber {
	public static void main(String[] args) {
		System.out.println(rndm());
	}
	static int rndm() {
	      double d = Math.random();
	      d = d * 50 + 1;
	      int randomInt = (int) d;
	      return randomInt;
	}
}
