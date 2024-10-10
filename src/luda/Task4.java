package luda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/*
reverseNegativeNumber
//Write a return method that can reverse digits of a negative number and return it as int
//input: -35  output: -53
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println("reverseNegativeNumbers(\"-13\") = " + reverseNegativeNumbers("-13"));
    }

    public static int reverseNegativeNumbers(String negative_number){
        String reversed = "-";
        for (int i = negative_number.length()-1; i > 0; i--) {
            reversed += negative_number.charAt(i);
        }
        int num = Integer.parseInt(reversed);

        return num;
    }
}
