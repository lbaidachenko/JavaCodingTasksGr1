package samed;

//Write a return method that can reverse digits of a negative number and return it as int
//input: -35  output: -53
public class Task4_reVerseNum {

    public static void main(String[] args) {
        int number = -35;
        int reversedNumber = reverse(number);
        System.out.println("reversedNumber = " + reversedNumber);
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number!=0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }
        return reversedNumber;
    }

}
