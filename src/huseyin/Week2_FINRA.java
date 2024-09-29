package huseyin;

public class Week2_FINRA {
    /**
 * This function prints out the numbers from 1 to 30, replacing multiples of 3 with "FIN", multiples of 5 with "RA",
 * and multiples of both 3 and 5 with "FINRA".
 *
 * @param args Command line arguments (not used in this function)
 */
public static void main(String[] args) {

    String result = "";
    for (int i = 1; i <= 30 ; i++) {

        if (i % 3 == 0 && i % 5 == 0 ) {  // Check if the number is a multiple of both 3 and 5
            result = "FINRA";
        }
        else if (i % 3 == 0){            // Check if the number is a multiple of 3
            result = "FIN";

        } else if (i % 5 == 0) {         // Check if the number is a multiple of 5
            result = "RA";

        }else {                         // If the number is not a multiple of 3 or 5, print the number itself
            result = " " + i;
        }
        System.out.println("result = " + result);
    }
    System.out.println("----------------------------------------------------------------------");

    finra();
}


    /**
 * This function prints out the numbers from 1 to 30, replacing multiples of 3 with "FIN", multiples of 5 with "RA",
 * and multiples of both 3 and 5 with "FINRA".
 *
 * @since 1.0
 */
public static void finra() {
    // Loop through numbers from 1 to 30
    for (int i = 1; i <= 30; i++) {
        // Check if the number is a multiple of both 3 and 5
        if (i % 15 == 0) {
            System.out.println("FINRA");
        }
        // Check if the number is a multiple of 3
        else if (i % 3 == 0) {
            System.out.println("FIN");
        }
        // Check if the number is a multiple of 5
        else if (i % 5 == 0) {
            System.out.println("RA");
        }
        // If the number is not a multiple of 3 or 5, print the number itself
        else {
            System.out.println(i);
        }
    }
}
}

/*
Write a function that prints out the numbers from 1 to 30 but for numbers that are a multiple of 3,
print "FIN" instead of the number, and for numbers that are a multiple of 5, print "RA" instead of the number.
For numbers that are a multiple of both 3 and 5, print "FINRA" instead of the number.

 */