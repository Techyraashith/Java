package dayByday;

import java.io.File;

public class Del_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("output.txt");
		
		if(f.delete()) {
			System.out.println("File Deleted Successfully");
		}
		else {
			System.out.println("This File is Already Deleted");
		}
	}

}
