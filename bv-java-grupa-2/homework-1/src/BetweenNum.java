
/**
 * 9. Input 2 values: start and finish, then display the numbers from start to finish
 */

import java.util.Scanner;

public class BetweenNum {
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int a = s.nextInt();

        System.out.println("Input the second number: ");
        int b = s.nextInt();

        int i = 0;
        String betweenNum = ""; //Empty String

        if (a < b) {
            for (i = (a + 1); i <= (b - 1); i++) {
                betweenNum = betweenNum + i + ", ";
            }
            System.out.println("The numbers between " + a + " and " + b + " are: " + betweenNum);
        } else if (a == b) {
            System.out.println("The two numbers provided are identical (" + a + "), there are no other numbers between.");
        } else // a > b
        {
            int temp = a;
            a = b;
            b = temp;

            for (i = (a + 1); i <= (b - 1); i++) {
                betweenNum = betweenNum + i + ", ";
            }
            System.out.println("The numbers between " + a + " and " + b + " are: " + betweenNum);
        }
    }
}