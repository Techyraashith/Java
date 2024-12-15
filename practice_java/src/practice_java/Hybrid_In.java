package practice_java;

class Animal{
	void eat_meat() {
		System.out.println("This animal eats Meat");
	}
}

class Scar extends Animal{
	void ruthless() {
		System.out.println("Scare is a ruthless Lion");
	}
}

class Mufasa extends Animal{
	void Brave() {
		System.out.println("Mufasa is Fearless Lion");
	}
}

class King extends Mufasa{
	void rule() {
		System.out.println("Mufasa is the King of the Forest");
	}
}

public class Hybrid_In {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mufasa m = new Mufasa();
		Scar s = new Scar();
		King k = new King();
		
		k.rule();
		k.Brave();
		k.eat_meat();
		
		System.out.println();
		
		m.Brave();
		m.eat_meat();
		
		System.out.println();
		
		s.ruthless();
		s.eat_meat();
		
		
		
	}

}
