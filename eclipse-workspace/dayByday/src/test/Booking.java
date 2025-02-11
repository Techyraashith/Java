package test;

import java.util.ArrayList;
import java.util.Optional;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.HashMap;


public class Booking {

	static int id = 1; 
	static int TicketsAvailable = 2;
	static int FirstClass = 2, SecondClassAc = 2, SecondClassNonAc = 2;
	static int WaitingLimit = 0;
	static List<Passenger> BookedPassengers = new ArrayList<Passenger>();
	static List<Passenger> WaitingList = new ArrayList<Passenger>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 //  HashMap<String, Integer> Train = new HashMap<String, Integer>();
	    
	 //  Train.put("VRI->MS",TicketsAvailable);
	    
		System.out.println("Hey There! Welcome.\n");
		
		
		Scanner scan = new Scanner(System.in);
		
		//String con = "Y";
		
		boolean cont = true;
		
		while(cont == true) {
			
			System.out.println("1. Book Ticket. \n2.View Ticket. \n3.Cancel Ticket. \n4. Waiting List Current Status.");
			
			System.out.print("\nChoose Your Options Please: ");
			
			int choice = scan.nextInt();
			scan.nextLine();
			switch(choice) {
				
			case 1:
				
				String Name = "";
				int berth = 0;
				try {
					System.out.print("\nPlease Enter Name: ");
					Name = scan.nextLine();
					 
					System.out.println("\n\n1.FirstClass. \n2.SecondClassAc. \n3.SecondClassNonAc");
					
					System.out.print("\nPlease Enter Berth: ");
					berth = scan.nextInt();
					
					if(!Name.matches("[a-zA-Z]+")) {   //checking if the given value is string or not
						throw new InputMismatchException("Please Enter Alphabets");
					}
					
					if(berth < 0) {   //checking if the given value is string or not
						throw new Exception("Please Enter numaric Options");
					}
					
				}
				
				catch(InputMismatchException e){
					System.out.println(e.getMessage());
				}
				
				catch(Exception e){
					System.out.println(e.getMessage());
				}
				
				
				//Berth berth1 = Berth.valueOf(berth);
				
				
				
				
				Passenger p = new Passenger(id,Name,berth); 
				
				Bookticket(p);
				
				break;
				
			case 2:
				System.out.println(BookedPassengers);
				break;
				
			case 3:
				
				System.out.print("Please enter your Id: ");
				id = scan.nextInt();
				
				CancelTicket(id);
				break;
				
			case 4:
				break;
			}
			
			System.out.print("Do You Want To Continue Y/N: ");
			String c = scan.next();
			// con = c; 
			
			cont = c.equalsIgnoreCase("Y");
		}
		
	}
	
	
	static void allocateBerth(Passenger p){
		
		switch(p.getPreferBerth()) {
		
		case 1:
			
				if(FirstClass > 0) {
					p.setAllocatedBerth(1);
					FirstClass --;
				}
				else if( SecondClassAc > 0) {
					p.setAllocatedBerth(2);
					SecondClassAc--;
				}
				else {
					p.setAllocatedBerth(3);
					SecondClassNonAc--;
				}
				
			break;
			
		case 2:
			
			if(SecondClassAc > 0) {
				p.setAllocatedBerth(2);
				SecondClassAc--;
			}
			else if( FirstClass > 0) {
				p.setAllocatedBerth(1);
				FirstClass --;
			}
			else {
				p.setAllocatedBerth(3);
				SecondClassNonAc--;
			}
		
			break;
			
		case 3:

			if(SecondClassNonAc > 0) {
				p.setAllocatedBerth(3);
				SecondClassNonAc--;
			}
			else if( SecondClassAc > 0) {
				p.setAllocatedBerth(2);
				SecondClassAc--;
			}
			else {
				p.setAllocatedBerth(1);
				FirstClass --;
			}
		
			break;
	}
	}
	private static void Bookticket(Passenger p) {
		// TODO Auto-generated method stub
		if(TicketsAvailable == 0) {
			if(WaitingLimit <= 3) {
				System.out.println("Your are in Waiting List");
				p.setWaitingListLimit(WaitingList.size());
				WaitingList.add(p);
				WaitingLimit++;
			}
			else {
				System.out.println("Regret.");
				return;
			}
		}
		else {
			allocateBerth(p);
			BookedPassengers.add(p);
			TicketsAvailable--;
			
			System.out.println("Your Ticket Booked Successfully!");
			id++;
			
		} 
	}
	
	private static void CancelTicket(int pid) {
		Optional <Passenger> CancelBooking = BookedPassengers.stream().filter(e->e.getPid().equals(pid)).findFirst();
		
		if(CancelBooking.isEmpty()) {
			System.out.println("You did not Booked Any tickets");
		}
		else {
			Passenger p = CancelBooking.get();
			
			if(WaitingList.isEmpty()) {
				if(p.getAllocatedBerth().equals(1)) {	
					FirstClass++;
				}
				
				else if(p.getAllocatedBerth().equals(2)) {
					SecondClassAc++;
				}
				
				else {
					SecondClassNonAc++;
				}
				
				TicketsAvailable++;
			}
			
			else {
				WaitingList.get(0).setAllocatedBerth(p.getAllocatedBerth());
				BookedPassengers.add(WaitingList.get(0));
				
			}
			BookedPassengers.removeIf(e->e.getPid().equals(pid));
			System.out.println("Your Ticket Canceled Successfully");
			id--;
		}
		
		
	}



}
