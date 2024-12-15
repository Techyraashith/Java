package oops;

class Person{
	
	public String name;
	protected int age;
	private String socialSecutrityNumber;
	String address;
	
	
	Person(String name, int age, String ssn, String add){                       
		                                                          //Creating Constructor person.
		this.name = name;
		this.age = age;                                 
		this.socialSecutrityNumber = ssn;
		this.address = add;
	}
}

class Employee extends Person{                           
	       
	Employee(String name, int age, String ssn, String add){        //Creating Constructor Employee
		
		super(name, age, ssn, add);                                // ---> This attributes are stored in person class attributes
	}
}

public class details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee("Raashith", 20, "rtx41t3", "Chennai");   // ---> This Values are go employee class attributes 
		
		System.out.println("His Name is "+e.name);
		System.out.println("His Age is "+e.age);
		System.out.println("He living in "+e.address);
	}

}
