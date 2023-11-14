package Implementations;

import java.util.*;

public class Methods {

    public static int monthNumber (String monthName, Map<String, Integer> map){
        int number = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(monthName)){
                number =  entry.getValue();
                break;
            }
        }
        return number;
    }

    public static List<Integer> deleteSecondElement (List<Integer> list){
        for (int i=list.size()-1; i>0; i-=2){
            list.remove(i);
        }
        return list;
    }

    public static List<String> sortnames(List<String> list){
        Collections.sort(list);
        return list;
    }

}
