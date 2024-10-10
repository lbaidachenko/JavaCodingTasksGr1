package Abdel;

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