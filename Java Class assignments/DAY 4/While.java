public class While {
    static int a = 10;
    static int t = 2;
    static int n = 0;
    public static void main(String[] args) {
        int i = 1;
        while ( i <= a) {
          n = i * t;   
          System.out.println(i + " x " + t + " = " + n);

          i++;
        }
    }
}
