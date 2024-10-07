package ahmet;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53
    public static void main(String[] args) {
        reverse(-35);
        System.out.println("-*-*-*-*-*-*-*");
        reverse(-243);
        System.out.println("-*-*-*-*-*-*-*");
        reverse(-12345);

    }
    public static void reverse(int input) {
        System.out.println("Given input : "+input);
       int output = 0;
        while (input != 0 ){
            int remainder = input % 10;
            output = output * 10 + remainder;
            input /= 10;
        }
        System.out.println("Reversed int : "+output);


    }
}
