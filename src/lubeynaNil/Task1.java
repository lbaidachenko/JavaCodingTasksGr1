package lubeynaNil;

public class Task1 {

    private static String identify(int i) {
        if (i % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(identify(5)); // Odd
        System.out.println(identify(6)); // Even

        // Test with negative numbers
        System.out.println(identify(-5)); // Odd
        System.out.println(identify(-6)); // Even


    }



}
/*Java Coding Tasks - Week 1 🥇

1️⃣  Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"*/
