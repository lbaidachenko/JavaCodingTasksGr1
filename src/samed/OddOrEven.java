package samed;

import java.util.Scanner;

public class OddOrEven {

    // creating method to check if number is odd or even

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("This number > "+num+" is EVEN" );
        }else {
            System.out.println("This number > "+num+" is ODD");
        }

        sc.close();

    }
}
