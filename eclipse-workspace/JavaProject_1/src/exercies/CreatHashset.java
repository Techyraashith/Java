package exercies;

import java.util.HashSet;

public class CreatHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<String> emp = new HashSet<>();
		emp.add("Wade Willson");
		emp.add("Steve");
		emp.add("Tony");
		
		emp.add("Steve");		// --> Duplicate Not supported.	
		
		emp.add("Bruce");
		emp.add("Clint Barton");
		
		System.out.println(emp);
		System.out.println(emp.contains("Steve"));
		
		
		System.out.println();
		emp.remove("Wade Willson");	
		System.out.println("After removing:");
		System.out.println(emp);
		
	}

}
