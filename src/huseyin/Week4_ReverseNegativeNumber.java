package huseyin;

public class  Week4_ReverseNegativeNumber {
    public static void main(String[] args) {

        System.out.println(reversedMethod(-43));


    }
    // Method declaration for reversedMethod
// This method takes an integer as input and returns the reversed version of the negative number

public static int reversedMethod(int number){

    // Convert the input number to a string
    String stringNumber = String.valueOf(number);

    // Initialize a new string variable with a value of "-"
    // This variable will be used to store the reversed version of the input number
    String reversed = "-";

    // Loop through each character of the stringNumber in reverse order
    // Start from the last character (index stringNumber.length()-1) and end at the second character (index 1)
    for (int i = stringNumber.length()-1; i > 0 ; i--) {
        // Append each character to the reversed string
        reversed += stringNumber.charAt(i);

    }

    // Convert the reversed string back to an integer
    int num = Integer.parseInt(reversed);

    // Return the reversed integer
    return num;
}

}
