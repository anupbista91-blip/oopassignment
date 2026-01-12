public class Palindrome {

    public static void main(String[] args) {

        int number = 121;   // number to check
        int original = number;
        int reverse = 0;

        while (number > 0) {
            int lastDigit = number % 10;   // get last digit
            reverse = reverse * 10 + lastDigit;
            number = number / 10;          // remove last digit
        }

        if (original == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}
