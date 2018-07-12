
/**
 * 3. Display the max digit from a number. Read the number from keyboard.
 */

import java.util.Scanner;

public class MaxDigit {
    public static void main(final String[] args) {
        System.out.println("Enter a multi-digit number: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n > 0) {
            int max = Integer.MIN_VALUE;

            while (n > 0) {
                int digit = n % 10;
                max = Math.max(max, digit);
                n /= 10;
            }
            System.out.println("The highest digit from the number is: " + max);
        } else if (n < 0) {
            n = -n;
            int max = Integer.MIN_VALUE;

            while (n > 0) {
                int digit = n % 10;
                max = Math.max(max, digit);
                n /= 10;
            }
            System.out.println("The highest digit from the number is: " + max);
        } else //(n == 0)
        {
            System.out.println("The highest digit from the number is: " + n);
        }
    }
}