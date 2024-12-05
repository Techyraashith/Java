public class find {

    static int a = -21;
    static boolean check = true ; 
    public static void main(String[] args) {
        
        if(check == true){
            
            if(a > 0){
                System.out.println(a+" is a Positive Number.");
            }
            else if(a == 0){
                System.out.println(a+" is Not Positive and Negative Number.");
            }
            else if(a < 0){
                System.out.println(a+" is Negative Number.");
            }
    
        }

        else {
            System.out.println("Please allow to check the given number.");
        }
    }
}
