
/**
 * 5. Display all the prime numbers lower than a given number
 */

public class LowerPrimes {
    public static void main(final String[] args) {

        int n = 1100; //This is the number variable to determine the lower prime numbers
        int i = 0;
        int num = 0;
        String primeNumbers = ""; //Empty String

        for (i = 1; i <= n; i++) {
            int counter = 0;

            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }

            if (counter == 2) {
                primeNumbers = primeNumbers + i + " "; //Adding the prime number to the String
            }
        }

        System.out.println("Prime numbers from 1 to " + n + " are :");
        System.out.println(primeNumbers);
    }
}