package test;

import java.util.Scanner;

public class findRepeatno { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the value to find: ");
		
		int input = scan.nextInt();
		
		int [] a = {5,6,7,5,5,6,7,7,7,7,8};
		

		int count = 0;
		
		int i = 0;

		
		while(i<a.length) {
		
			if(input == a[i]) {
				count++;
			}
			
			i++;
		}
		
		System.out.println(count+" => "+input);
	}

}
