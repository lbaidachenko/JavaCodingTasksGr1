package maria;

public class reverseNegativeNumber {

    public static void main(String[] args) {
        System.out.println(reversedMethod(-35));
        System.out.println(reversedMethod(-123));
    }
    public static int reversedMethod(int number){
        String sayiString = String.valueOf(number);
        String reversed = "-";
        for (int i = sayiString.length()-1; i >0 ; i--) {
            reversed += sayiString.charAt(i);
        }
        int num1 = Integer.parseInt(reversed);
        return num1;
    }

}
