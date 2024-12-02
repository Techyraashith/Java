import java.util.Scanner;
public class fibonacy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int n = 0;
        int fibo = 1;
        
        for(int i = 0; i <= count; i++){
            
            int k = n;
            n = fibo;
            fibo = k + n;

            System.out.println("K = "+k+" + "+"n = "+n+" fibo "+fibo);
        }
    }
}
