package practice_java;

class Minato {
	void Teacher(){
		System.out.println("Minato is Master!");
		System.out.println("He Teaching Ninjutsu");
	}
}

class Kakashi extends Minato {
	void stud1() { 
		System.out.println("Kakashi is a student of Minato");
		System.out.println("He learn more from Minato");
	}
}

class Obito extends Minato{
	void stud2() {
		System.out.println("Obito is a student of Minato");
		System.out.println("He Quite Learning Ninjutsu from Minato");
	}
}

public class hiherarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kakashi k = new Kakashi();
		Obito o = new Obito();
		o.Teacher();
		o.stud2();
		
		System.out.println(); 
		
		k.Teacher();
		k.stud1();
		
	}

}
