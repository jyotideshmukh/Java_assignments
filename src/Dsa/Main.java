package Dsa;
import java.util.Arrays.*;

// "static void main" must be defined in a public class.
public class Main {

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static long sumOfArray(int[] arr, int size) {
        long sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void printArray2(int[] arr, int size) {
        for (int val : arr)
            System.out.print(val + " ");
    }

    static void find2Max(int[] arr, int n){


    }

    static void reverse(int[] arr, int n){

        for(int i = 0; i< n/2; i++){
            int temp = arr[n-i-1];
            arr[n-i-1] = arr[i];
            arr[i]= temp;
        }
        printArray(arr, n);
    }

    public static void main(String[] args) {

        //int[] arr = {1, 2, 3, 4, 5};
        //int n = arr.length;
        /*printArray(arr, n);
        System.out.println("\n");
        printArray2(arr, n);
        System.out.println("\nSum of array=" + sumOfArray(arr, n));

        System.out.println("Pascle tringle");
        Pattern.printPascleTringle(5);*/

       // reverse(arr, n);

       // String s = "abcoe";
        //System.out.println(ReverseVowelsInString.reverseVowels(s));

     int[] arr = {0,4,2,0};
        int arr2[] = TwoSum.twoSum(arr, 0);
        printArray2(arr, arr.length);
        System.out.println("Target="+0+"["+arr2[0]+","+arr2[1]+"]");
        int arr3[] = {2,7,11,15};
         arr2 = TwoSum.twoSum(arr3, 9);
        printArray2(arr3, arr.length);
        System.out.println("Target="+9+"["+arr2[0]+","+arr2[1]+"]");

        int arr4[] = {3,2,4};
        arr2 = TwoSum.twoSum(arr4, 6);
        printArray2(arr4, arr.length);
        System.out.println("Target="+6+"["+arr2[0]+","+arr2[1]+"]");

        int arr5[] = {3,3};
        arr2 = TwoSum.twoSum(arr5, 6);
        printArray2(arr5, arr.length);
        System.out.println("Target="+6+"["+arr2[0]+","+arr2[1]+"]");

    }
}
