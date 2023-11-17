package Implementations;

import java.util.List;
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



}
