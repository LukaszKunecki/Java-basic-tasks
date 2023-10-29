package Tasks;


import Implementations.Methods;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

//      Create a function that will reverse the string (e.g. "Hello" becomes "olleH").
        System.out.println("Task nr 1");
        String exampleString = "Hello";
        System.out.println(Methods.reverseString(exampleString));

//      Create a function that will count the number of occurrences of a given character in a string
        System.out.println("Task nr 2");
        char targetChar = 'a';
        String exampleString2 = "dsafdgadsfdgfaaafdsa";
        System.out.println(Methods.occuranceNumber(exampleString2,targetChar));

//      Create a function that will remove spaces from a given string.
        System.out.println("Task nr 3");
        String exampleString3 = "This is test string with spaces";
        System.out.println(Methods.removeSpaces(exampleString3));

//      Create a function that will check whether the string is a palindrome.
        System.out.println("Task nr 4");
        String exampleString4 = "kajak";
        System.out.println("Is word "+ exampleString4 +" a palindrome?: "+ Methods.isPalindrome(exampleString4));
//
//      Create a function that will convert the first letter of each word in the string to upper case
//      (e.g. "hello world" becomes "Hello World").
        System.out.println("Task nr 5");
        String exampleString5 = "hello world example text";
        System.out.println(Methods.firstCapital(exampleString5));
//
//      Create a function that will check whether two strings are anagrams (consist of the same letters).
        System.out.println("Task nr 6");
        String exampleString6 = "arbuz";
        String exampleString7 = "burza";
        System.out.println("Are strings " + exampleString6 + " and " + exampleString7 + " anagrams?: " +
                           Methods.isAnagram(exampleString6,exampleString7));
//
//      Create a function that will remove all occurrences of a specific character from a string.
        System.out.println("Task nr 7");
        char targetChar1 = 'a';
        String exampleString8 = "Example text";
        System.out.println(Methods.removeChar(exampleString8, targetChar1));
//
//      Create a function that will detect whether a string contains only numbers.
        System.out.println("Task nr 8");
        String exampleString9 = "6543567543";
        System.out.println(Methods.containsDigit(exampleString9));

//      Create a function that will split a string based on a specified separator and return an array of parts.
        System.out.println("Task nr 9");
        String exampleString10 = "Hello world example string";
        String separator = " ";
        System.out.println(Arrays.toString(Methods.splitString(exampleString10, separator)));
//
//      Create a function that will convert all letters in a string to lowercase.
        System.out.println("Task nr 10");
        String exampleString11 = "HELLo WorLD";
        System.out.println(Methods.lowerCase(exampleString11));

//      Create a function that returns the reversed order of words in a sentence
//      (e.g. "Hello World" becomes "World Hello").
        System.out.println("Task nr 11");
        String exampleString12 = "Hello World";
        System.out.println(Methods.reverseOrder(exampleString12));
//
//      Create a function that will remove all special characters (e.g. periods, commas) from a string.
        System.out.println("Task nr 12");
        String exampleString13 = "Hell!o^ ^Wo*rl#d";
        System.out.println(Methods.specialChars(exampleString13));
//
//      Create a function that returns the first non-repeating character in a string.
        System.out.println("Task nr 13");
        String exampleString14 = "abcabcgabcdef";
        System.out.println(Methods.nonRepeated(exampleString14));
//
//      Create a function that will remove all consonants from a string.
        System.out.println("Task nr 14");
        String exampleString15 = "Hello world";
        System.out.println(Methods.isConson(exampleString15));
    }
}