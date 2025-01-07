package dayByday;

import java.util.Scanner;

public class fibonacy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  Scanner scan = new Scanner(System.in);
		  System.out.print("Enter Number: ");
	        int count = scan.nextInt();
	        int n = 0;
	        int fibo = 1;
	        
	        for(int i = 0; i <= count; i++){
	            
	            int k = n;
	            n = fibo;
	            fibo = k + n;

	            System.out.println("K = "+k+" + "+"n = "+n+" fibo "+fibo);
	        }
	}

}
