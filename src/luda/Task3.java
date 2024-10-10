package luda;
/*
 swapTwoNumbers:
Swap two int variables' values without using a third variable
 */
public class Task3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("----------------------------------------");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }

}
