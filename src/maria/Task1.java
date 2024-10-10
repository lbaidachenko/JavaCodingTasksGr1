package maria;

public class Task1 {

    public static void main(String[] args) {

        System.out.println(identify(5));
        System.out.println(identify(6));


    }

    public static String identify(int n){
        if(n % 2 == 1){
            return "Odd";
        }else{
            return "Even";
        }
    }



}


/*
Java Coding Tasks - Week 1 🥇

1️⃣  Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */


