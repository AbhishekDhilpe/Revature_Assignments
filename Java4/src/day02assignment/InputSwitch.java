package day02assignment;

import java.util.Scanner;

public class InputSwitch {
		

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in); 
			int flag=0;
			while(flag == 0){System.out.println("Select :[1 - Move right, 2 - Move Left, 3 - Move Up, 4 - Move Down, q - exit program]"); 
			String c=scan.nextLine();
			
			switch(c) {
			case "1":
				System.out.println("Moving Right");	
				break;
			case "2":
				System.out.println("Moving Left");
				break;
			case "3":
				System.out.println("Moving Up");
				break;
			case "4":
				System.out.println("Moving Down");
				break;
			case "q":
				flag=1;
				break;
			default:
				System.out.println("Try again. Acceptable input: [1 - Move right, 2 - Move Left, 3 - Move Up, 4 - Move Down, q - exit program]");
				break;
			}
			}
		}
}
