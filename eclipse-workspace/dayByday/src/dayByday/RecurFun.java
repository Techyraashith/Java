package dayByday;

public class RecurFun {

	// base condition
	
	static void forceTOstop (int i) {
		
		if(i == 8) {
			System.out.println("Stop!");
			System.out.println("Command Acccepted it stoped.");
			return;
		}
		
		System.out.println("if you want to stop: "+i);
		forceTOstop(i+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		forceTOstop(1);
		
	}

}
