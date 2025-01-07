package test;

import java.util.Arrays;
import java.util.Scanner ;

public class findChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	 
		System.out.print("Enter the String: ");
		String input = scan.nextLine();
		
		char [] c = input.toCharArray();
		
		System.out.println();
		System.out.println("Before Sorting Complete"+Arrays.toString(c));
		
		for(int i = 0; i<c.length; i++) {
			
			for(int j = i+1; j<c.length; j++) {
				
				if(c[i]>c[j])
				{
					char backup = c[j] ;
					
					c[j] = c[i];
					
					c[i] = backup;
					
				}
			}
		}
		
		System.out.println();
		System.out.println("After Sorting Complete: "+Arrays.toString(c));
	}

}
