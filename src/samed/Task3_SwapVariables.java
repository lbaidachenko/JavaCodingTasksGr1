package samed;

/*
    Swap two int variables' values without using a third variable
 */
public class Task3_SwapVariables {
    public static void main(String[] args) {

        int x = 10;
        int y = 15;

        x = x + y; // 25
        y = x - y; // 25 - 15 = 10
        x = x - y; // 25 - 10 = 15

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
