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

//      Write a function that, using the Stream API, groups strings from a given list by their length.
        System.out.println("Task nr 5");

//      Write a function that, using the Stream API, reverses strings in a given collection of strings.
        System.out.println("Task nr 6");

//      Write a function that, using the Stream API, sorts integers in a given list in descending order.
        System.out.println("Task nr 7");

//      Write a function that, using the Stream API, finds the sum of squares of numbers from a given list.
        System.out.println("Task nr 8");

//      Write a function that, using the Stream API, finds the first string from a given list that
//      starts with a specified letter.
        System.out.println("Task nr 9");

//      Write a function that, using the Stream API, selects only even numbers from a given list of integers.
        System.out.println("Task nr 10");

//      Write a function that, using the Stream API, concatenates strings from a given list into one long string,
//      separating them by a specified separator.
        System.out.println("Task nr 11");

//      Write a function that, using the Stream API, calculates the average length of strings
//      in a given collection of strings.
        System.out.println("Task nr 12");

//      Write a function that, using the Stream API, finds the maximum and minimum values
//      in a given collection of integers.
        System.out.println("Task nr 13");

//      Write a function that, using the Java Stream API, selects only unique elements from a given list.
        System.out.println("Task nr 14");

//      Write a function that, using the Java Stream API, filters words in a given collection of strings
//      that contain a specific word or letter.
        System.out.println("Task nr 15");

//      Write a function that, using the Java Stream API, concatenates strings from a given list into
//      one long string without using a separator.
        System.out.println("Task nr 16");

//      Write a function that, using the Java Stream API, finds the first element in a given collection
//      that meets a specific condition.
        System.out.println("Task nr 17");

//      Write a function that, using the Java Stream API, calculates the sum and product of elements
//      in a given collection of integers.
        System.out.println("Task nr 18");

//      Write a function that, using the Java Stream API, selects only unique elements from a given list.
        System.out.println("Task nr 19");

//      Write a function that, using the Java Stream API, filters elements in a given collection
//      that meet a specific condition, for example, selects only numbers greater than 10.
        System.out.println("Task nr 20");

//      Write a function that, using the Java Stream API, sorts strings in a given collection by their length.
        System.out.println("Task nr 21");

//      Write a function that, using the Java Stream API, concatenates strings from a given list
//      into one long string, adding a separator between them.
        System.out.println("Task nr 22");


    }
}