package huseyin;

public class Week1_OddEvenNumber {
    public static void main(String[] args) {

        oddEvenNumber(7);

    }
    /**
     * This method identifies whether a given number is odd or even.
     * @param number The number to be checked. It should be an integer.
     * @return A string indicating whether the number is odd or even.
          */
    private static void oddEvenNumber(int number) {
        // explain the logic behind this method here
        String result = "";

        if (number % 2 == 0){ // Check if the number is even

            result = number + " is even number";

        }else { // If the number is odd
            result = number + " is odd number";
        }
        System.out.println(result);
    }
}

/*
Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */
