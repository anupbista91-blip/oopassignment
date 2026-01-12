import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Loop from 1 to 10
        System.out.println("Multiplication Table of " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

        // Close scanner
        sc.close();
    }
}
