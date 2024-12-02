import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int prime = 1;

        for(int i = 2; i < n; i++){
            if (n % i == 0)
            {    
                prime = 0;
                break;
            }
        }

        if(prime == 1){
            System.out.println(n+" is Prime Number");
        }
        else{
            System.out.println(n+" is not Prime Number");
        }
    }
}
