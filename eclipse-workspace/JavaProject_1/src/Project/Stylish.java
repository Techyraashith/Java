package Project;

import java.util.Scanner;
import java.util.ArrayList;

class Customer{
	  
		String name;
	    int age;
	    String gender;
	    String address;
	    String email;

public Customer(String name, int age, String gender, String address, String email) {
	this.name = name;
    this.age = age;
    this.gender = gender;
    this.address = address;
    this.email = email;
    }
}


public class Stylish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		ArrayList<Customer> cust = new ArrayList<>();
		
		System.out.print("Enter the number of Customer: ");
		int numOfCust = scan.nextInt();
		scan.nextLine();
		
		System.out.println();
		for(int i = 0; i < numOfCust; i++) {
			
			System.out.print("Name: ");
			String name = scan.nextLine();
			
			System.out.print("Age: ");
			int age = scan.nextInt();
			
			scan.nextLine();
			
			System.out.print("Gender: ");
			String gender = scan.nextLine();
			
			System.out.print("Address: ");
			String address = scan.nextLine();
			
			System.out.print("Email: ");
			String email = scan.nextLine();

			
			cust.add(new Customer(name,age,gender,address,email));
			
			System.out.println();
		}
		
		System.out.println("Here the Details: ");
		
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("Name   "+"Age   "+"Gender   "+"Address   "+"Email");
		for(int j = 0; j < cust.size(); j++) {
			
			Customer custget = cust.get(j);
			
			System.out.println("--------------------------------------------------------------------------------------------------------");
			System.out.println(custget.name+"   "+custget.age+"   "+custget.gender+"   "+custget.address+"   "+custget.email);
		}
	}

}



















