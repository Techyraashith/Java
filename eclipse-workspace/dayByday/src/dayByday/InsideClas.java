package dayByday;

public class InsideClas {
	
	private String User;
	
	
	int i = 10;
	class Inner1{
		int j = 20;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InsideClas.Inner1 in = new InsideClas().new Inner1();    // creating object for inner and outer class.
		InsideClas o = new InsideClas(); 
		
		System.out.println(in.j + o.i);
		
		
	}

}
