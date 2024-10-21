package maria;

public class FrequencyOfCharacters {

    public static String frequencyOfChars(String str) {
        String result = "";  // This will store the final result
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;  // To keep track of the frequency of the character
            // Check if the character has already been added to the result
            if (result.indexOf(ch) == -1) {
                // If not, count how many times it appears in the string
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch) {
                        count++;
                    }
                }
                // Append the character and its frequency to the result
                result += ch + "" + count;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "AAABBCDD";
        System.out.println(frequencyOfChars(input));  // Output: A3B2C1D2
    }
}
