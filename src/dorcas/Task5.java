package dorcas;

public class Task5 {

//Write a return method that can find the frequency of characters
//Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
public static void main(String[] args) {
    System.out.println(frequencyOfChars("AAABBCDD"));  // Output: A3B2C1D2
}

    public static String frequencyOfChars(String str) {
        int[] frequency = new int[26];  // Array for A-Z frequencies

        // Count frequencies
        for (char ch : str.toCharArray()) frequency[ch - 'A']++;

        // Build new  string
        String result = "";
        for (char ch = 'A'; ch <= 'Z'; ch++)
            if (frequency[ch - 'A'] > 0) result += ch + "" + frequency[ch - 'A'];

        return result;
    }
    }

