package homworkweek6;

public class InstanceVariables {
    int a = 5;
    int b = 2;

    public static void main(String[] args) {
        InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.myMethod();
    }


    //Instance method
    public void myMethod() {
        System.out.println(a);
        System.out.println(b);

    }
}
