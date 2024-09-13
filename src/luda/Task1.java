package luda;

public class Task1 {
    public static void main(String[] args) {

        identify(3);
        identify(-2);
        identify(0);
        identify(10);
    }
    public static void identify(int number){
        if(number % 2 == 0){
            System.out.println("number " + number + " is even");
        } else {
            System.out.println("number " + number + " is odd");
        }
    }
}
/*
Java Coding Tasks - Week 1

  Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */
