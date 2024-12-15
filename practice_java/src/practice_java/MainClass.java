package practice_java;

	class Dad{
		int bank = 2000;
	}
	
	class Son extends Dad{
		
	}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son s = new Son();
		System.out.println(s.bank);
		
	}

}
