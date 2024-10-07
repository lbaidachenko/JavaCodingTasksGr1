package ahmet;

public class reverseNegativeNumber {
    public static void main(String[] args) {

        //Write a return method that can reverse digits of a negative number and return it as int
        //input: -35  output: -53
        reverse(-35);
    }

public static void reverse (int input) {
            System.out.println("Given input : "+input);
        int output = 0;
            while (input != 0) {
                int rem = input % 10;
                output = output * 10 + rem;
                input = input / 10;
            }
            System.out.println("Reversed integer : "+output);
        }

    }
