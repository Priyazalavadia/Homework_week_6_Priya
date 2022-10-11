package homworkweek6;

import java.util.Scanner;

public class AddMulSubDivReminder {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the 1st Num: ");
        int A = sca.nextInt();
        System.out.println("Enter the 2nd Num: ");
        int B = sca.nextInt();
        int C = A + B;
        int D = A - B;
        int E = A * B;
        int F = A / B;
        int G = A % B;

        System.out.println(A + "+" + B + " = " + C);
        System.out.println(A + "-" + B + " = " + D);
        System.out.println(A + "*" + B + " = " + E);
        System.out.println(A + "/" + B + " = " + F);
        System.out.println(A + "%" + B + " = " + G);
    }
}
