package Implementation;

import java.util.*;

public class Methods {

    public static int arraySum (int[] array){
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static int largestElement (int[] array){
        int largest = 0;
        for (int element : array){
            if (element > largest){
                largest = element;
            }
        }
        return largest;
    }

    public static float averageFloat (float[] array){
        float sum = 0;
        for (float element : array) {
            sum += element;
        }
        return sum/array.length;
    }

    public static int[] reverseOrder (int[] array){
        int[] newArray = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            newArray[j] = array[i];
        }
        return newArray;
    }

    public static boolean isPresent (int[] array, int target){
        for (int element : array) {
            if (element == target){
                return true;
            }
        }
        return false;
    }

    public static Set<Integer> duplicates(int[] array){
        Set<Integer> newSet = new HashSet<>();
        for (int element:array) {
            newSet.add(element);
        }
        return newSet;
    }


}
