package ahmet;

public class swapTwoNumbers {
    public static void main(String[] args) {
        int num1 = 1 ;
        int num2 = 2 ;
        int num3 = num1;

        num3 = num1 ;
        num1 = num2 ;
        num2 = num3 ;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }
}
