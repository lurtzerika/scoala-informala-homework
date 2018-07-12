
/**
 * 7. Input the lenght of the side of a square and display its area. Produce an error message if the length is negative.
 */

import java.util.Scanner;

public class Square {
    public static void main(final String[] args) {
        System.out.print("Input side of a Square: ");
        Scanner s = new Scanner(System.in);
        double side = s.nextDouble();

        if (side >= 0) {
            double area = side * side;
            System.out.println("Area of this Square is: " + area);
        } else //(side < 0)
        {
            System.out.println("Error! The lenght can not be a negative a number. Please, enter a positive one!");
        }
    }
}