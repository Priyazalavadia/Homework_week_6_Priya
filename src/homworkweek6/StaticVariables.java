package homworkweek6;

public class StaticVariables {

    static int a = 5;
    static int b = 10;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        myMethod();

    }


    //static method
    public static void myMethod() {
        System.out.println(a);
        System.out.println(b);

    }
}
