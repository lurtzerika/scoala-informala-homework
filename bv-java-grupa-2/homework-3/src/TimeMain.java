package TimeValidation;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("What time is it?");

        System.out.println("Add hour: ");
        int h = s.nextInt();

        System.out.println("Add minutes: ");
        int m = s.nextInt();

        timeValid(h, m);
    }


    public static void timeValid(int h, int m) {

        if (h < 0 || h > 23 || m < 0 || m > 59) {
            System.out.println("Incorrect time!");

        } else {
            String hh = String.valueOf(h);
            String mm = String.valueOf(m);

            if (h < 10) {
                hh = "0" + hh;

                if (m < 10) {
                    mm = "0" + mm;
                }
            }
            String time = hh + ":" + mm;
            System.out.println("The time is " + time + " now.");
        }
    }
}