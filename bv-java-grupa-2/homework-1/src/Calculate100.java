
/**
 * 1. Calculate the sum of the first 100(n) numbers higher than 0
 */

public class Calculate100 {
    public static void main(final String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            //System.out.println(sum);
        }
        System.out.println("The sum is: " + sum);
    }

}