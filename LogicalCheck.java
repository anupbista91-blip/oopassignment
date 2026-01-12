package Assignment2.Tutorials;

import java.util.Scanner;

public class LogicalCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.print("Enter third number: ");
            int c = sc.nextInt();

            if ((a + b == c) && (c > 0)) {
                System.out.println("✔ Third number is the sum of first two and is positive");
            } else {
                System.out.println("✘ Condition not satisfied");
            }

            System.out.print("Do you want to check again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program ended. Thank you!");
        sc.close();
    }
}
