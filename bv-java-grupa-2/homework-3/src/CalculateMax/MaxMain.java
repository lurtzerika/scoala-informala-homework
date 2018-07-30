package CalculateMax;

import java.lang.Math;
import java.util.Scanner;
import java.lang.String;

public class MaxMain {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please input 3 integers: ");

        int num1 = Integer.parseInt(s.nextLine());
        int num2 = Integer.parseInt(s.nextLine());
        int num3 = Integer.parseInt(s.nextLine());

        System.out.println("The biggest value of the three numbers is: " + getMax(getMax(num1, num2), num3));
    }


    public static int getMax(int num1, int num2) {


        int max = Math.max(num1, num2);
        return max;

    }
}
