package practice_java;
																	
class Raashith {

	void Doing_work()
	{																		
		System.out.println("He can do anything");					
		System.out.println("He can eat");					//One Super Class
		System.out.println("He can work hard etc.....");
	}
}																						//This is Single Inheritance

class Clone extends Raashith{
	void Clone_worker()										//One Derived Class							
	{
		System.out.println("He is the clone of raashith");
	}
}

public class single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clone c = new Clone();
		c.Clone_worker();
		c.Doing_work();
	}

}
