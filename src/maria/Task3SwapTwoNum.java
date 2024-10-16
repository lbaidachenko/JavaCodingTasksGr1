package maria;

import java.sql.SQLOutput;

public class Task3SwapTwoNum {
    public static void main(String[] args) {


        // Swap two int variables' values without using a third variable

        int num1 = 10;
        int num2 = 20;
        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Swapping using addition and subtraction
        num1 = num1 + num2; // 30
        num2 = num1 - num2; // 30 - 20 = 10
        num1 = num1 - num2; // 30 - 10 = 20

        System.out.println("After swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);




    }
}
