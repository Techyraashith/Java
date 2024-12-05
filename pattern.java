public class pattern {
    public static void main(String[] args) {
        int row = 4 ; 
        int col = 1;
        int space = row - 1;

        for(int i = 1; i<= row; i++){
            for(int j = 1; j <= space; j++){
                System.err.print(" "+" ");
            }
            space-= 1;
            for(int k = 1; k <= col; k++){
                System.out.print("*"+" ");
            }

            System.err.println();
            col+= 2;
        }
    }
}
