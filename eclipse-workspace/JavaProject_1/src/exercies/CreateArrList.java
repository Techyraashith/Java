package exercies;

import java.util.ArrayList;

public class CreateArrList {

	public static void main(String[] args) {
		
		ArrayList<String> emp = new ArrayList<>();
		
		emp.add("Wade Willson");
		emp.add("Steve");
		emp.add("Tony");
		emp.add("Bruce");
		emp.add("Clint Barton");
	
		System.out.println("Original List: ");
		System.out.println(emp);
		
		emp.remove(0);
		
		System.out.println();
		
		System.out.println("Updated List: ");
		System.out.println(emp);
	}
	
}
