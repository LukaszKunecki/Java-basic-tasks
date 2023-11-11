package Implementation;

import java.util.*;

public class Methods {

    public static int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int largestElement(int[] array) {
        int largest = 0;
        for (int element : array) {
            if (element > largest) {
                largest = element;
            }
        }
        return largest;
    }

    public static float averageFloat(float[] array) {
        float sum = 0;
        for (float element : array) {
            sum += element;
        }
        return sum / array.length;
    }

    public static int[] reverseOrder(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            newArray[j] = array[i];
        }
        return newArray;
    }

    public static boolean isPresent(int[] array, int target) {
        for (int element : array) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    public static Set<Integer> duplicates(int[] array) {
        Set<Integer> newSet = new HashSet<>();
        for (int element : array) {
            newSet.add(element);
        }
        return newSet;
    }

    public static int[] sortAsc(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public static String[] sortAlphab(String[] array) {
        Arrays.sort(array);
        return array;
    }

    public static int[] zeroToStart(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            if (array[i] == 0) {
                temp = array[index];
                array[index] = array[i];
                array[i] = temp;
                index++;
            }
        }
        return array;
    }

    public static int mostFreq(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int element : array) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0)+1);
        }

        int mostFrequentElement = array[0];
        for (int element : frequencyMap.keySet()) {
            if (frequencyMap.get(element) > frequencyMap.get(mostFrequentElement)) {
                mostFrequentElement = element;
            }
        }
        return mostFrequentElement;
    }
}

