package elif;

public class SwapVariables {

    public static void main(String[] args) {



        int num1 = 5;
        int num2 = 10;

        num1 = num1 + num2; // num1 = 15
        num2 = num1 - num2; // num2 = 5
        num1 = num1 - num2; // num1 = 10

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);


    }


}

/*
Java Coding Tasks - Week3
swapTwoNumbers:
Swap two int variables' values without using a third variable
 */