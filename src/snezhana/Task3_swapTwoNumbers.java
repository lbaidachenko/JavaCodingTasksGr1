package snezhana;

public class Task3_swapTwoNumbers {
    public static void main(String[] args) {

        int num1 = 18, num2 =13;

        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        num1= num1+num2;//21
        num2= num1-num2;//8
        num1= num1-num2;//13

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);


    }
}
/*
Swap two int variables' values without using a third variable
 */