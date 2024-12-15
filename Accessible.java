public class Accessible {

    class Dad{
        int Bank = 2000000;
    }
    
    class son extends Dad{
    }
    public static void main(String[] args) {
        
        son s1 = new son();
        System.out.println(s1.Bank);
    }
}