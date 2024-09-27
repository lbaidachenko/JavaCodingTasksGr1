package dorcas;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Swap two int variables' values without using a third variable using a scanner

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer:");

        int a = scanner.nextInt();

        System.out.println("Enter the second integer:");

        int b = scanner.nextInt();

        scanner.close();

        a = a + b;

        b = a - b;

        a = a - b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);


    }
}
