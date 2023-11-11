package Tasks;

import Implementation.Methods;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//      Create an array of integers and calculate the sum of all its elements.
        System.out.println("Task nr 1");
        int[] exampleArray1 = {5,3,7,6,5,9,8,2,1,4,3,6,7};
        System.out.println(Methods.arraySum(exampleArray1));

//      Find the largest element in a given array of integers.
        System.out.println("Task nr 2");
        int[] exampleArray2 = {5,3,7,6,5,9,8,2,1,4,3,6,7};
        System.out.println(Methods.largestElement(exampleArray2));

//      Calculate the average of the elements in an array of floating point numbers.
        System.out.println("Task nr 3");
        float[] exampleArray3 = {5.4F,3.7F,7.2F,6.8F,5.1F,9.3F,8.2F,2.9F,1.0F,4.6F,3.5F,6.1F,7.3F};
        System.out.println(Methods.averageFloat(exampleArray3));

//      Reverse the order of elements in a given array.
        System.out.println("Task nr 4");
        int [] exampleArray4 = {5,3,56,8,9,1,3};
        System.out.println(Arrays.toString(Methods.reverseOrder(exampleArray4)));

//      Check if a given integer is present in the array.
        System.out.println("Task nr 5");
        int targetInteger = 7;
        int[] exampleArray5 = {5,3,7,6,5,9,8,2,1,4,3,6,7};
        System.out.println(Methods.isPresent(exampleArray5, targetInteger));

//      Remove duplicates from a given integer array.
        System.out.println("Task nr 6");
        int[] exampleArray6 = {5,3,7,6,22,5,9,8,2,1,4,3,6,7,16};
        System.out.println(Methods.duplicates(exampleArray6));

//      Sort an array of integers in ascending order.
        System.out.println("Task nr 7");
        int[] exampleArray7 = {5,3,7,6,22,5,9,8,2,1,4,3,6,7,16};
        System.out.println(Arrays.toString(Methods.sortAsc(exampleArray7)));

//      Sort the caption array alphabetically.
        System.out.println("Task nr 8");
        String[] exampleArray8 = {"Hello", "Wrold", "Example", "Array"};
        System.out.println(Arrays.toString(Methods.sortAlphab(exampleArray8)));

//      Move all zeros to the end of the integer array.
        System.out.println("Task nr 9");
        int [] exampleArray9 = {5,3,0,56,8,0,9,1,3,0};
        System.out.println(Arrays.toString(Methods.zeroToStart(exampleArray9)));

//      Find the most frequently occurring element in a given array.
        System.out.println("Task nr 10");
        int [] exampleArray10 = {5,3,0,56,8,0,9,1,3,0};
        System.out.println(Methods.mostFreq(exampleArray10));
    }
}