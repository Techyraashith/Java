package dayByday;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter two integers:");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = a / b;
            System.out.println("The Final result is: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception! Please give valid input.");
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception: Please enter valid integers.");
        } 
    }
}

