package dorcas;

import java.util.*;

public class Task2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= 30; i++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FINRA");
            } else if (num % 3 == 0) {
                System.out.println("FIN");
            } else if (num % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(num);
            }
            num++;  // Increment the number before the next iteration to avoid printing the same number twice.  //Your task is to complete the function as described above.
        }



    }
}
//Write a function that prints out the numbers from 1 to 30 but for numbers that are a multiple of 3, print "FIN" instead of the number,
// and for numbers that are a multiple of 5, print "RA" instead of the number.
// For numbers that are a multiple of both 3 and 5, print "FINRA" instead of the number.