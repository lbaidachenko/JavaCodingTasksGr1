package ahmet;
/*
Write a function that prints out the numbers from 1 to 30 but for numbers that are a multiple of 3, print
"FIN" instead of the number, and for numbers that are a multiple of 5, print "RA" instead of the number.
For numbers that are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */


public class FINRA {
    public static void main(String[] args) {
        System.out.println();
        /*
    for (int i = 1 ; i <= 30 ; i++) {
        if (i % 3 == 0){
            System.out.print(" "+"FIN");
        }else if( i % 5 == 0){
            System.out.print(" "+"RA");
        } else if (i % 3 == 0 && i % 5 == 0) {
            System.out.print(" "+"FINRA");
        }else {
            System.out.print(" "+i);
        }
    }
         */
        // create 1 up to 30 in a single line of code using a switch statement.
        for (int i = 1 ; i <= 30 ; i++ ){
            switch (i % 3 == 0&& i % 5 == 0 ? 3:i % 3 == 0 ? 1 : i % 5 == 0 ? 2 :  0){// 0- FIN, 1- FIN, 2- RA, 3- FINRA
              case 0: // not divide by 3 and 5
                  System.out.print(" "+i);
                break;
              case 1: // only divide by 3
                System.out.print(" "+"FIN");
                break;
              case 2:// only divide by 5
                  System.out.print(" "+"RA");
                break;
              case 3://  divide by 3 and 5
                    System.out.print(" "+"FINRA");
                break;
            }
        }
        System.out.println();
    }
}
