package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {


    public static int[] returnReverserdarray(int[] array){
        int reversedArray[] = new int[array.length];
        int k = 0;
        for(int i = array.length-1; i >= 0 ; i--,k++){
            reversedArray[k] = array[i];
        }
        return reversedArray;

    }

    public static void reverse(int[] array){
        System.out.println("Array = "+Arrays.toString(array));
        int maxIndex = array.length-1;
        int halfIndex = maxIndex/2;

        for(int i =0 ; i <= halfIndex; i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
        System.out.println("Reversed array = "+Arrays.toString(array));
    }
}
