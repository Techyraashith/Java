package projectlib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BorrowRecord {
    private String custName;
    private String bookName;
    private String borrowDate;

    public BorrowRecord(String custName, String bookName, String borrowDate) {
        this.custName = custName;
        this.bookName = bookName;
        this.borrowDate = borrowDate;
    }

    public String getUsername() {
        return custName;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBorrowDate() {
        return borrowDate;
    }
}




public class LibManagSystem {
	
    static Map<String, Integer> bookCount = new HashMap<>();
    static Map<String, Integer> bookValidity = new HashMap<>();
    static ArrayList<BorrowRecord> custBorrowRecords = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        bookCount.put("book1", 1);
        bookCount.put("book2", 2);
        bookCount.put("book3", 3);
        bookValidity.put("book1", 3);
        bookValidity.put("book2", 4);
        bookValidity.put("book3", 5);

        boolean system = true;
        while (system) {
            System.out.println("--------------------------------------");
            System.out.println("1. Customer \n2. Admin \n3. Logout From the System");
            System.out.println("Please select from the above options:");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    custLogin();
                    break;
                case 2:
                	
                	//Admin side.
                    break;
                    
                case 3:
                	 system = false;
                	 System.out.println("Logging out.....");
                	
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

	public static void custLogin() { //Method starts
        System.out.println("Enter your username:");
        String custName = scan.next();

        System.out.println("Welcome, " + custName);

        boolean userMenu = true;
        while (userMenu) {
            System.out.println("1. Borrow Book\n2. Return Book\n3. View Borrowed Details\n4. exit");
            System.out.println("\nSelect an option:");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                	System.out.println("Please enter the book name: ");           
                	String bname = scan.next();
                    borrowBook(custName,bname);
                    break;
                case 2:
                	
                    returnBook(custName);
                    break;
                case 3:
                    //viewBorrowDetails(custName);
                    break;
                case 4:
                    System.out.println("Exit from the menu...");
                    userMenu = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
	
	
	} //Method end

	private static void returnBook(String custName) {
		// TODO Auto-generated method stub
		
	System
		
	}

	private static void borrowBook(String custName,String bookName) {
		// TODO Auto-generated method stub
		
		if(bookCount.containsKey(bookName)) {
			int copiesAvailable = bookCount.get(bookName);
			if(copiesAvailable > 0) {
				bookCount.put(bookName, copiesAvailable - 1);
				
	            System.out.println("Enter the borrow date (dd-MM-yyyy):");
	            String inputDate = scan.next(); 

				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	            dateFormat.setLenient(false); 
	            
	            try {
					Date borrowDate = dateFormat.parse(inputDate);
				} 
	            catch (ParseException e) {
					// TODO Auto-generated catch block
					
	                System.out.println("Invalid date format. Please enter the date in dd-MM-yyyy format.");
				}
                bookCount.put(bookName, copiesAvailable - 1);

	            
				custBorrowRecords.add(new BorrowRecord(custName, bookName, inputDate));
				
				System.out.println("The Book: "+bookName+" is Borrowed Sucessfully in This Date: "+inputDate+".");
			}
			
			else {
				System.out.println("Sorry The Book: "+bookName+" is Currently Not Available.");
			}
		}
		
		else {
			System.out.println("Sorry The Given Book:"+bookName+" is Not Here.");
		}
	}
}




