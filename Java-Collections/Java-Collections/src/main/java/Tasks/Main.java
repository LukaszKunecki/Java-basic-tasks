package Tasks;

import Implementations.Methods;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//      Create a map that assigns month names to their numbers.
//      Add some month and numbers and get the month number based on the name.
        System.out.println("Task nr 1");
        Map<String, Integer> monthMap = new HashMap<>(){{put("January", 1);put("February", 2);put("March", 3);}};
        String targetMonth = "March";
        System.out.println("Value assigned to "+ targetMonth +" is: "+ Methods.monthNumber(targetMonth, monthMap));

//      Make a list of 10 integers. Remove every second item from the list.
        System.out.println("Task nr 2");
        List<Integer> exampleList1 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        System.out.println(Methods.deleteSecondElement(exampleList1));
//
//      Create a list of strings representing people's names. Sort this list alphabetically.
        System.out.println("Task nr 3");
        List<String> namesList = new ArrayList<>(List.of("John", "Greg", "Anna", "Bruce", "Kate"));
        System.out.println(Methods.sortnames(namesList));
//
//      Create a set of integers. Remove all even numbers from it.
        System.out.println("Task nr 4");
        Set<Integer> exampleSet = new HashSet<>(List.of(1,5,7,3,8,5,2,11,4,24));
        System.out.println(Methods.removeEven(exampleSet));
//
//      Create a map that assigns products to their prices.
//      Write code that checks whether a given product is on the map (if it is available) based on the product name.

    }
}