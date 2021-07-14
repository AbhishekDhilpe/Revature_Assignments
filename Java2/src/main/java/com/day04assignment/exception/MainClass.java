package com.day04assignment.exception;

public class MainClass {
	public static void main(String[] args) {	
		
		int age1 = 12;
		int age2 = 22;
	// 01
		 try {
			 abc(age1);
		 }catch (GetMessage e){
			 System.out.println(e.getMessage());
		 }
		 try {
			 abc(age2);
		 }catch (GetMessage e){
			 System.out.println(e.getMessage());
		 }
		 
	// 02	
		 System.out.println();
		 try {
			 abc(age1);
		 }catch (GetMessage e){
			 System.out.println(e.getDivMsg());
		 }
		 try {
			 abc(age2);
		 }catch (GetMessage e){
			 System.out.println(e.getDivMsg());
		 }
	// 03	 
		 System.out.println();
		 try {
			 
			 System.out.println("Starting try block");

			 System.exit(0); //05
			 abc(age1);
			 System.out.println("Ending try block");
			 
		 }catch (GetMessage e){
			 System.out.println("Starting catch block");
			 System.out.println(e.getDivMsg());
			 System.out.println("Ending catch block");
		 }finally {
			 System.out.println("Good bye");
		 }
	// 04
		 System.out.println();
		 
		 
		 
		 
		 
		
	}
	
	
	public static void abc(int age) throws GetMessage 
	{
		if(age<18) {
			throw new GetMessage();
		}else{
			System.out.println("Good to go!! ");
		}
	}
}
