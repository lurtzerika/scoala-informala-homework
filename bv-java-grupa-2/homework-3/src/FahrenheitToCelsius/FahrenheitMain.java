package FahrenheitToCelsius;

import java.util.*;

public class FahrenheitMain {

    public static void main(String[] args) {
        double tempF;
        Scanner s = new Scanner(System.in);

        System.out.println("Please specify your body temperature in Fahrenheit: ");
        tempF = s.nextInt();

        if (toCelsius(tempF) > 37) {
            System.out.println("Your body temperature in Celsius degrees is: " + toCelsius(tempF) + ". Warning, you are ill!");
        } else {
            System.out.println("Your body temperature in Celsius degrees is: " + toCelsius(tempF));
        }

    }

    public static double toCelsius(double tempF) {

        double tempC = ((tempF - 32) * 5 / 9);
        return tempC;

    }

}
