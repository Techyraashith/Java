package exercies;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class CreateLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	LinkedList<String> emp = new LinkedList<>();
		
		emp.add("Wade Willson");
		emp.add("Steve");
		emp.add("Tony");
		emp.add("Bruce");
		emp.add("Clint Barton");
	
		System.out.println(emp.contains("Steve"));
		System.out.println(emp.get(3));
		System.out.println(emp.getLast());
		emp.set(3,"Banner");
		System.out.println(emp);
		
		System.out.println();
		
		System.out.println("All detail in Linked List are shown below: ");
		System.out.println();
		Iterator<String> i = emp.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	
	}

}
 
