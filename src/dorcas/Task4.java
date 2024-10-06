package dorcas;

import java.util.*;
import java.util.Scanner;

public class Task4 {
    public class reverseNumber {

        public static void main(String[] args) {
            int number = -35;
            int reversedNumber = reverse(number);
            System.out.println("reversedNumber = " + reversedNumber);
        }

        public static int reverse(int number) {
            int reversedNumber = 0;
            while (number != 0) {
                reversedNumber = reversedNumber * 10 + number % 10;
                number = number / 10;
            }
            return reversedNumber;
        }
    }
}








