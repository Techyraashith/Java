package dayByday;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("output.txt");
		
		if(f.createNewFile()) {
			System.out.println("File Created Successfully.");
		}
		else {
			System.out.println("File is Already Created");
		}
		
		f.setReadOnly();
		
		FileWriter fwrite = new FileWriter(f);
		
		fwrite.append("Hey there! Welcome to JAVA\n");
		fwrite.append("Need Any Help?");
		fwrite.close();
		
		Scanner scan = new Scanner(f);
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}	
		
	}

}
