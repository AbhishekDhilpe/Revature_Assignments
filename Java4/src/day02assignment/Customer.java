package day02assignment;

public class Customer {
	private int id;
	private String name;
	private static int count=0;
	private static String SHOP= "BigBazaar";
	Customer(){}
	Customer(int id1){
		id=id1;
		count++;
	}
	int add(int a, int b) {
		return a+b;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		Customer C1= new Customer(101);
		Customer C2= new Customer(102);
		C1.name="Abhishek";
		C2.name="Shivam";
		
		System.out.println(C1.add(250, 1000));
		System.out.println(C2.add(200,120,1500));
		System.out.println(C1);
		System.out.println(C2);
	}
}
