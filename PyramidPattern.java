package Assignment2.Tutorials;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();

            if (rows <= 0) {
                System.out.println("Number of rows must be positive!");
            } else {
                for (int i = 1; i <= rows; i++) {
                    for (int space = 1; space <= rows - i; space++) {
                        System.out.print(" ");
                    }
                    for (int star = 1; star <= (2 * i - 1); star++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }

            System.out.print("Do you want to print another pyramid? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program ended. Thank you!");
        sc.close();
    }
}
