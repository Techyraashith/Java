public class Methods {
    /* void method */
    void Hello(){
        System.out.println("Hey There! Welcome to Java Program");
    }

    /* returning method */
    int Method1(){
        return 95;
    }
    int returning(){
        return Method1();
    }

    /* returning using parameters */
    int Add(int a, int b){
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        Methods code = new Methods();
        code.Hello();
        code.Hello();
        int r = code.returning();
        int a = code.Add(2,8);

        System.out.println("The returning value is : "+r);
        System.out.println("Addition of data is : "+a);
    }
}
