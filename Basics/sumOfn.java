import java.util.Scanner;
public class sumOfn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for(int a = 0; a <= n; a++){
             sum += a;
        }

        System.out.println("The Sum of given "+n+" is "+sum);
    }
}
