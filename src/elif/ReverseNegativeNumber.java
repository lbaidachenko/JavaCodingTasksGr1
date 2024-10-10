package elif;

public class ReverseNegativeNumber {

    public static void main(String[] args) {


        System.out.println("reverseNegativeNumber(-35) = " + reverseNegativeNumber(-35));
        System.out.println("reverseNegativeNumber(-64) = " + reverseNegativeNumber(-64));


    }


    public static int reverseNegativeNumber(int number){

        int reversed = 0; // first run reversed -5, second run -3 == -53

        while(number != 0){

            int lastDigit = number % 10; //get the last digit // -35 = -5 -> second time -3
            reversed = reversed * 10 + lastDigit; // -5 -> second time -3
            number = number/10; // number = -3 -> second time 0

        }

        return reversed;


    }


}

/*
//Write a return method that can reverse digits of a negative number and return it as int
//input: -35  output: -53
 */
