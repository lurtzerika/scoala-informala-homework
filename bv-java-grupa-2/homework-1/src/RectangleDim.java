
/**
 * 6. Input the dimensions of a rectangle and display area and perimeter
 */


import java.util.Scanner;

public class RectangleDim {
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input the width: ");
        final double width = s.nextDouble();
        System.out.print("Input the height: ");
        final double height = s.nextDouble();

        double area = width * height;
        double perimeter = 2 * (height + width);

        System.out.println("Area is " + width + " x " + height + " = " + area);
        System.out.printf("Perimeter is 2 x (" + width + " + " + height + ") = " + perimeter);

        //System.out.printf("Area is %.2f x %.2f = %.2f\n",width,height,area);
        //System.out.printf("Perimeter is 2x(%.2f + %.2f) = %.2f \n",width,height,perimeter);
    }
}
