package Implementations;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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

    public static List<String> reverseString(List<String> list){
        return list.stream().map(e -> new StringBuilder(e).reverse().toString()).toList();
    }

}
