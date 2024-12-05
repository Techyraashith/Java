import java.util.Scanner;

public class Odd_or_Even {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        int a = scan.nextInt();
        if (a % 2 != 0){
            System.out.println(a+" is Odd Number");
        }
        else if(a % 2 == 0){
            System.out.println(a+" is Even Number");
        }
        else{
            System.out.println("Pls enter the Valid number");
        }
    }
}