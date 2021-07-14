package com.day04assignment.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayHash {
	public static void main(String[] args) {
	
	//01	
		ArrayList<String>  friends= new ArrayList<String>();
		friends.add("Shivam");
		friends.add("Jasdhir");
		friends.add("Astha");
		System.out.println(friends);
		System.out.println();
		
		HashSet<String> setHash = new HashSet<String>();
		setHash.add("Choudhary");
		setHash.add("Singh");
		setHash.add("Pandya");
		System.out.println(setHash);
		System.out.println();
	//02	
		Iterator itr1= friends.iterator();
		Iterator itr2= setHash.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	
	//03	
		
		
		
	}
}
