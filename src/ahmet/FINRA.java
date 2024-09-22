package ahmet;

import java.util.Scanner;

/*
Write a function that prints out the numbers from 1 to 30 but for numbers that are a multiple of 3,
print "FIN" instead of the number, and for numbers that are a multiple of 5, print "RA" instead of the number.
For numbers that are a multiple of both 3 and 5, print "FINRA" instead of the number.

 */
public class FINRA {
    public static void main(String[] args) {
       /*
        //print from 1 to 30 but
            for (int i = 1; i <= 30; i++) {
                // divide 3 and 5 numbers
                switch ((i % 3 == 0 ? 1 : 0) + (i % 5 == 0 ? 2 : 0)) {
                    // not divide by 3 and 5
                    case 0:
                        System.out.print(" "+i);
                        break;
                        // divide by 3
                        case 1:
                            System.out.print(" "+"FIN");
                            break;
                            // divide by 5
                        case 2:
                            System.out.print(" "+"RA");
                            break;
                            // divide by 3 and 5
                        case 3:
                            System.out.print(" "+"FINRA");
                            break;

        }

        }

        */

        //creat for loop from 1 to 30
        for(int i = 1 ; i <= 30 ;i++) {

            if (i % 3 == 0) { // if divide by 3
                System.out.print(" " + "FIN");
            } else if (i % 5 == 0) { // if divide by 5
                System.out.print(" " + "RA");
            } else if (i % 3 == 0 && i % 5 == 0) { // if divide by both 3 and 5
                System.out.print(" " + "FINRA");
            }else {
                System.out.print(" "+ i);
            }
        }
    }
}
