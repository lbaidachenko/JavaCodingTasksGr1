package samed;

public class Task5_FrequencyChar {

    public static void main(String[] args) {
        frequencyChars("AAABBCDD");
    }

    public static void frequencyChars(String str){
        String result ="";
        for(int j = 0;j<str.length();j++){
            char c = str.charAt(j);
            int count = 0;
            for(int i =0;i<str.length();i++){
                if(str.charAt(i) == c){
                    count++;
                }
            }

            if(result.contains(c+"")){
                continue;
            }
            result += c + "" +count;
        }
        System.out.println("frequency = " + result);
    }
}

