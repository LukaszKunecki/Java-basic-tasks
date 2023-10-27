package Implementations;

import java.util.Arrays;

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
        char[] textArray = text.toCharArray();
        char[] text2Array = text2.toCharArray();
        Arrays.sort(textArray);
        Arrays.sort(text2Array);
        return Arrays.equals(textArray,text2Array);
    }

    public static String removeChar(String text, char character){
        StringBuilder newString = new StringBuilder();
        for (int i=0; i<text.length(); i++){
            if (text.charAt(i) != character){
                newString.append(text.charAt(i));
            }
        }
        return newString.toString();
    }

    public static boolean containsDigit(String text){
        for (int i = 0; i < text.length(); i++){
            if (!Character.isDigit(text.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static String[] splitString(String text, String separator){
        String[] stringsArray = text.split(separator);
        return stringsArray;
    }

    public static String lowerCase(String text){
        return text.toLowerCase();
    }

    public static String reverseOrder(String text){
        String[] strArr = text.split(" ");
        StringBuilder newStr = new StringBuilder();
        for (int i = strArr.length-1; i >= 0; i-- ){
            newStr.append(strArr[i]).append(" ");
        }
        return newStr.toString().trim();
    }

    public static String specialChars(String text){
        return text.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static char nonRepeated(String text){

    }

}
