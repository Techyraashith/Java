package dayByday;

import java.util.Scanner;

public class declareArr {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       
            System.out.println("Enter the size:");
            int size = scan.nextInt();
            int[] array = new int[size];

                for (int i = 0; i < size; i++) {
                    try {
                        System.out.print("Enter the elements: ");
                        array[i] = scan.nextInt();
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter an integer.");
                        scan.next();
                        i--;
                    }
                }

                
                System.out.println("Array elements are:");
           
                for (int i = 0; i < size; i++) {
                	
                	System.out.print(array[i] + " ");
                }
 
        }
   }
