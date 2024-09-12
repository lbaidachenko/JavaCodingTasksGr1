package ahmet;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Step 1 : enter a number
        System.out.print("Enter a number => ");
        //  Step 2: creat Scanner object
        Scanner number = new Scanner (System.in);
        // Step 3 : read a integer number
        int num = number.nextInt();
        // Step 4: check a number is an ood or even
        if ( num % 2 == 0 ){
            System.out.println(num + " is an even number");
        }else{
            System.out.println(num + " is an odd number");
        }
        // exit the Scanner class
        number.close();
    }
}
/*
Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */
