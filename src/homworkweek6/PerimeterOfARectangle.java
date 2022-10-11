package homworkweek6;

import java.util.Scanner;

public class PerimeterOfARectangle {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);


        System.out.print(" Enter the Width of Rectangle: ");
        float a = sca.nextFloat();
        System.out.print(" Enter the Height of Rectangle: ");
        float b = sca.nextFloat();

        float area = a * b;
        float peri = 2 * (a + b);

        System.out.println("\n Area = " + area);
        System.out.println(" Perimeter = " + peri);


    }
}
