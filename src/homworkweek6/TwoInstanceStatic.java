package homworkweek6;

public class TwoInstanceStatic {

    int a = 100;
    int b = 200;
    static int c = 300;
    static int d = 400;

    public static void main(String[] args) {
        mySecondMethod();
        TwoInstanceStatic obj = new TwoInstanceStatic();
        obj.myMethod();

    }

    //instance method
    public void myMethod() {
        System.out.println(a);
        System.out.println(b);
        TwoInstanceStatic Int = new TwoInstanceStatic();
        System.out.println(TwoInstanceStatic.c);
        System.out.println(TwoInstanceStatic.d);
    }

    // Static method
    public static void mySecondMethod() {
        System.out.println(c);
        System.out.println(d);
        TwoInstanceStatic Int = new TwoInstanceStatic();
        System.out.println(Int.a);
        System.out.println(Int.b);

    }

}
