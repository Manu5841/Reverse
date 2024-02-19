
/**Write a program that takes an integer as input and returns an integer with reversed digit
ordering
 */

public class Reverse {
    public static class ReverseInteger {

        public static int reverseInteger(int number) {
            int reversed = 0;
            int remainder;

            while (number != 0) {
                // Extract the last digit
                remainder = number % 10;

                // Shift the reversed number one position to the left
                reversed = reversed * 10 + remainder;

                // Remove the last digit from the original number
                number /= 10;
            }

            return reversed;
        }

        public static void main(String[] args) {
            int number = 12345;
            int reversedNumber = reverseInteger(number);
            System.out.println("Reversed number: " + reversedNumber); // Output: 54321
        }
    }
}
