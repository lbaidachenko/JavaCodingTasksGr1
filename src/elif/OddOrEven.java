package elif;

public class OddOrEven {

    public static void main(String[] args) {

        identify(4);
        identify(3);
        identify(6);
        identify(7);


    }


    public static void identify(int num){

        if(num % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }


    }

}

/*

Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */