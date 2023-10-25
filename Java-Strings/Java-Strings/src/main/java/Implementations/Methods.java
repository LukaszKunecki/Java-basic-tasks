package Implementations;

public class Methods {

    public static String reverseString(String text){
        return new StringBuilder(text).reverse().toString();
    }

    public static int occuranceNumber(String text, char character){
        int occurences = 0;
        for (int i=0; i<text.length(); i++){
            if (text.charAt(i) == character){
                occurences += 1;
            }
        }
        return occurences;
    }

    public static String removeSpaces(String text){
        return text.replace(" ", "");
    }

    public static boolean isPalindrome(String text){
        return new StringBuilder(text).reverse().toString().equals(text);
    }

    public static String firstCapital(String text){
        String[] splitedText = text.split(" ");
        StringBuilder capitalString = new StringBuilder();
        for (String word : splitedText) {
            char c = Character.toUpperCase(word.charAt(0));
            capitalString.append(c).append(word.substring(1)).append(" ");
        }
        return capitalString.toString().trim();
    }

    public static boolean isAnagram(String text, String text2){
        

    }

}
