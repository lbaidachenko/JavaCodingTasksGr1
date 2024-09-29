package huseyin;

import java.util.Scanner;

/**
 * This class demonstrates swapping the values of two integer variables without using a third variable.
 * It uses a scanner to input the values of the variables and performs the swap using basic arithmetic operations.
 */
public class Week3_SwapTwoNumbers {

    /**
     * The main method that executes the program.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        //Swap two int variables' values without using a third variable using a scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int a = scanner.nextInt();

        System.out.println("Enter the second integer:");
        int b = scanner.nextInt();

        // Check if b is zero to avoid division by zero
        if (b == 0) {
            System.out.println("b value cannot be zero, enter a different number");
            b = scanner.nextInt();
        }

        // Perform the swap using basic arithmetic operations
        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
