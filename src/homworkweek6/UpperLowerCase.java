package homworkweek6;

import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print(" input your String: ");
        String Line = in.nextLine();
        Line = Line.toLowerCase();
        System.out.println(" output String: " + Line);


    }
}

