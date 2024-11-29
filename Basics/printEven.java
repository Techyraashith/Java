import java.util.Scanner;
public class printEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Here the Even Numbers are:");
        for(int a = 1; a <= n; a++){
            if(a % 2 == 0){
                System.out.println(a);
            }
        } 
    }
}
