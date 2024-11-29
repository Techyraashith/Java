import java.lang.System;
import java.util.Scanner;

public class add {
    public static void main(String[] args) 
    {
        Scanner Code = new Scanner(System.in);
        int a = Code.nextInt(); 
        int b = Code.nextInt();
        int c = a + b ;
        System.out.println("The Sum of "+a+" and "+b+" = "+c);
    }
}
