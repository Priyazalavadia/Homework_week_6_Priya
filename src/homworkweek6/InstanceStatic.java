package homworkweek6;

public class InstanceStatic {
    int a = 15;
    static int b = 20;

    public static void main(String[] args) {
        InstanceStatic obj = new InstanceStatic();

        obj.myMethod();

        mySecondMethod();


    }

    //instance method
     void myMethod() {

        System.out.println(a);
        System.out.println(InstanceStatic.b);
    }

    //static method
    public static void mySecondMethod() {

         System.out.println(InstanceStatic.b);
         InstanceStatic Int = new InstanceStatic();
         System.out.println(Int.a);


    }
}

