import java.util.*;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

class SumOfDigits {
    public static void main(String[] args) {
        try {
            System.out.print("Enter the number");
            Scanner input = new Scanner(System.in);

            int number = input.nextInt();
            ; // Replace with your desired number

            if (number < 100 || number > 999) {
                throw new InvalidNumberException("Number should be between 100 and 999 (inclusive).");
            }

            int sum = calculateSumOfDigits(number);
            System.out.println("Sum of digits of " + number + " is: " + sum);
        } catch (InvalidNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
