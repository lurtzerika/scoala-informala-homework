
/**
 * 8. Input 3 numbers and display the biggest one
 */

import java.util.Scanner;

public class BiggestNum {
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int a = s.nextInt();

        System.out.println("Input the second number: ");
        int b = s.nextInt();

        System.out.println("Input the last number: ");
        int c = s.nextInt();

        int temp = Integer.MIN_VALUE;

        if (a > temp) {
            temp = a;
        }

        if (b > temp) {
            temp = b;
        }
        if (c > temp) {
            temp = c;
        }
        System.out.println("The biggest number is: " + temp);
    }
}