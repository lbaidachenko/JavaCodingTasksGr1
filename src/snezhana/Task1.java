package snezhana;

/**
 * This class contains a main method and a static method to identify if a given number is even or odd.
 */
public class Task1 {

    /**
     * The main method is the entry point of the program.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        //Write a method that can identify  a given number is even or odd.
        int number = 5;
        
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }

    /**
     * This method checks if a given number is even or odd.
     *
     * @param number The number to be checked.
     * @return A string indicating whether the number is even or odd.
     */
    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return number + " is even";
        } else {
            return number + " is odd";
        }
    }



    }

