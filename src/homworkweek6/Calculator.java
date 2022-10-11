package homworkweek6;

public class Calculator {
    int a = 5;
    int b = 10;
    static int c = 15;
    static int d = 20;

    public static void main(String[] args) {

        addition();
        subtract();
        multiplication();
        division();
    }

    public static void addition() {
        Calculator Cal = new Calculator();
        String st = (Cal.a) + (Cal.b) + c + d + "addition";
        System.out.println(st);
    }

    public static void subtract() {
        Calculator Cal = new Calculator();
        String st = (Cal.a) - (Cal.b) - c - d + "subtract";
        System.out.println(st);
    }

    public static void multiplication() {
        Calculator Cal = new Calculator();
        String st = (Cal.a) * (Cal.b) * c * d + "multiplication";
        System.out.println(st);
    }

    public static void division() {
        Calculator Cal = new Calculator();
        String st = (Cal.a) / (Cal.b) / c / d + "divison";
        System.out.println(st);
    }

}
