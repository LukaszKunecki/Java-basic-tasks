package Implementations;

import java.util.*;
import java.util.stream.Collectors;

public class Methods {
    public static int integerSum(List<Integer> list){
        return list.stream().mapToInt(Integer::intValue).sum();
    }

    public static double doubleAvg(List<Double> list){
        return list.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public static List<String> filterString (List<String> list){
        return list.stream().filter(e -> e.length()>3).toList();
    }

    public static Optional<String> longestStr (List<String> list){
        return list.stream().max(Comparator.comparingInt(String::length));
    }

    public static Map<Integer, List<String>> groupStrings (List<String> list){
        return list.stream().collect(Collectors.groupingBy(String::length));
    }

    public static List<String> reverseString (List<String> list){
        return list.stream().map(e -> new StringBuilder(e).reverse().toString()).toList();
    }

    public static List<Integer> sortDesc (List<Integer> list){
        return list.stream().sorted((a,b) -> Integer.compare(b,a)).toList();
    }

    public static int sumofSq (List<Integer> list){
        return list.stream().map(number -> number*number).mapToInt(Integer::intValue).sum();
    }

    public static String firstString (List<String> list, char letter){
        return list.stream().filter(string -> string.startsWith(String.valueOf(letter))).findFirst().toString();
    }

    public static List<Integer> evenNumbersOnly (List<Integer> list){
         return list.stream().filter(number -> number % 2 == 0).toList();
    }

    public static String concatenateStrings (List<String> list){
        return list.stream().collect(Collectors.joining("_"));
    }

    public static OptionalDouble averageLength (List<String> list){
        return list.stream().mapToInt(String::length).average();
    }

    public static List<OptionalInt> minAndMax (List<Integer> list){
        OptionalInt max = list.stream().mapToInt(Integer::intValue).max();
        OptionalInt min = list.stream().mapToInt(Integer::intValue).min();
        List<OptionalInt> minMax = new ArrayList<>(List.of(min,max));
        return minMax;
    }

    public static List<String> uniqueElements (List<String> list){
        return list.stream().distinct().toList();
    }

    public static List<String> wordsWithLetter (List<String> list, char target){
       return list.stream().filter(str ->str.contains(String.valueOf(target))).toList();
    }

    public static String concatenateStringsNoSeparator (List<String> list){
        return list.stream().collect(Collectors.joining());
    }

    public static List<String> sortByLength (List<String> list){
        return list.stream().sorted(Comparator.comparing(String::length)).toList();
    }

}
