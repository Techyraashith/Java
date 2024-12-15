package practice_java;

abstract class Vehicle {
	
	abstract void speed();
	
	void brand()
	{
		System.out.println("New Brand bike");
	}
}

class Bike extends Vehicle{
	
	void speed() {
		System.out.println("The top speed of the bike 285km/h");
	}
}

public class abst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b = new Bike();
		b.brand();
		b.speed();

	}

}
