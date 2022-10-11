package homworkweek6;

import java.util.Scanner;

public class AddBinaryNumbers {
    public static void main(String[] args) {
        long B1, B2;
        int i = 0, remainder = 0;
        int[] sum = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input the first Binary Num :");
        B1 = sc.nextLong();
        System.out.println(" Input the second Binary Num :");
        B2 = sc.nextLong();
        while (B1 != 0 || B2 != 0) {
            sum[i++] = (int) ((B1 % 10 + B2 % 10 + remainder) % 2);
            remainder = (int) ((B1 % 10 + B2 % 10 + remainder) / 2);

            B1 = B1 / 10;
            B2 = B2 / 10;

        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two Binary Numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }
}

