package Tasks;

import Implementations.Methods;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//      Write a function that, using the Stream API, sums all integers from a given list.
        System.out.println("Task nr 1");
        List<Integer> examplelist1 = new ArrayList<>(List.of(1,2,4,8,5,4,9,8,6,5,2,7));
        System.out.println(Methods.integerSum(examplelist1));

//      Write a function that, using the Stream API, finds the average value of numbers from a given list
//      of double-point numbers.
        System.out.println("Task nr 2");
        List<Double> examplelist2 = new ArrayList<>(List.of(1.5D,2.4D,4.2D,8.0D,5.1D,4.9D,9.6D,8.7D,6.2D,5.5D));
        System.out.println(Methods.doubleAvg(examplelist2));

//      Write a function that, using the Stream API, filters all strings from a given
//      list that have more than 3 characters.
        System.out.println("Task nr 3");
        List<String> examplelist3 = new ArrayList<>(List.of("Hello", "World", "Test", "List", "Str"));
        System.out.println(Methods.filterString(examplelist3));

//      Write a function that, using the Stream API, finds the longest string in a given collection of strings.
        System.out.println("Task nr 4");
        List<String> examplelist4 = new ArrayList<>(List.of("Hello", "World", "Test", "List", "Str", "Developer"));
        System.out.println(Methods.longestStr(examplelist4));

//      Write a function that, using the Stream API, groups strings from a given list by their length.
        System.out.println("Task nr 5");
        List<String> examplelist5 = new ArrayList<>(List.of("Hello", "World", "Test", "List", "Str", "Developer"));
        System.out.println(Methods.groupStrings(examplelist5));

//      Write a function that, using the Stream API, reverses strings in a given collection of strings.
        System.out.println("Task nr 6");
        List<String> examplelist6 = new ArrayList<>(List.of("Hello", "World", "Test"));
        System.out.println(Methods.reverseString(examplelist6));

//      Write a function that, using the Stream API, sorts integers in a given list in descending order.
        System.out.println("Task nr 7");
        List<Integer> examplelist7 = new ArrayList<>(List.of(1,2,4,8,5,4,9,8,6,5,2,7));
        System.out.println(Methods.sortDesc(examplelist7));

//      Write a function that, using the Stream API, finds the sum of squares of numbers from a given list.
        System.out.println("Task nr 8");
        List<Integer> examplelist8 = new ArrayList<>(List.of(9,6,4,18,5,4,9,18,6,3,2,8));
        System.out.println(Methods.sumofSq(examplelist8));

//      Write a function that, using the Stream API, finds the first string from a given list that
//      starts with a specified letter.
        System.out.println("Task nr 9");
        List<String> examplelist9 = new ArrayList<>(List.of("Hello", "World", "Test", "List", "Washington", "Windows"));
        char targetLetter = 'W';
        System.out.println(Methods.firstString(examplelist9, targetLetter));

//      Write a function that, using the Stream API, selects only even numbers from a given list of integers.
        System.out.println("Task nr 10");
        List<Integer> examplelist10 = new ArrayList<>(List.of(9,6,4,18,5,4,9,18,6,3,2,8));
        System.out.println(Methods.evenNumbersOnly(examplelist10));

//      Write a function that, using the Stream API, concatenates strings from a given list into one long string,
//      separating them by a specified separator.
        System.out.println("Task nr 11");
        List<String> examplelist11 = new ArrayList<>(List.of("Hello", "World", "Test"));
        System.out.println(Methods.concatenateStrings(examplelist11));

//      Write a function that, using the Stream API, calculates the average length of strings
//      in a given collection of strings.
        System.out.println("Task nr 12");
        List<String> examplelist12 = new ArrayList<>(List.of("Hello", "World", "Test", "List", "Washington", "Windows"));
        System.out.println(Methods.averageLength(examplelist12));

//      Write a function that, using the Stream API, finds the maximum and minimum values
//      in a given collection of integers.
        System.out.println("Task nr 13");
        List<Integer> examplelist13 = new ArrayList<>(List.of(9,6,4,18,5,4,9,18,6,3,2,8));
        System.out.println(Methods.minAndMax(examplelist13));

//      Write a function that, using the Java Stream API, selects only unique elements from a given list.
        System.out.println("Task nr 14");
        List<String> examplelist14 = new ArrayList<>(List.of("Hello", "World", "Test", "Hello", "World", "Element"));
        System.out.println(Methods.uniqueElements(examplelist14));

//      Write a function that, using the Java Stream API, filters words in a given collection of strings
//      that contain a specific letter.
        System.out.println("Task nr 15");
        List<String> examplelist15 = new ArrayList<>(List.of("Hello", "World", "Test", "Hello", "World", "Element"));
        char targetChar = 's';
        System.out.println(Methods.wordsWithLetter(examplelist15, targetChar));

//      Write a function that, using the Java Stream API, concatenates strings from a given list into
//      one long string without using a separator.
        System.out.println("Task nr 16");
        List<String> examplelist16 = new ArrayList<>(List.of("Hello", "World", "Test", "Hello", "World", "Element"));
        System.out.println(Methods.concatenateStringsNoSeparator(examplelist16));

//      Write a function that, using the Java Stream API, sorts strings in a given collection by their length.
        System.out.println("Task nr 17");
        List<String> examplelist17 = new ArrayList<>(List.of("Hello", "World", "Test", "Hello", "World", "Element"));
        System.out.println(Methods.sortByLength(examplelist17));

    }
}