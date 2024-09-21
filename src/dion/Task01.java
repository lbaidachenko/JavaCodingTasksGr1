package dion;

import java.util.Scanner;

public class Task01 {

    public static String identify (int number) {
        if (number % 2 == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("The number is " + identify(number));

        sc.close();
    }
}

