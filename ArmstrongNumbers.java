public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 to 100:");

        for (int i = 1; i <= 100; i++) {
            if (isArmstrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int numDigits = countDigits(number);
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    private static int countDigits(int number) {
        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}