package com.day03assignment.java;

public class SquareArray {
	static float[] square(int a, int b, int c,int d) {
	    float[] arr = new float[4];
	    arr[0]=a*a;
	    arr[1]=b*b;
	    arr[2]=c*c;
	    arr[3]=d*d;
	    System.out.println();
		return arr;
	}
	public static void main(String[] args) {
		float[] array = square(2,4,5,3);
		System.out.println(array[0]);
	}
}
