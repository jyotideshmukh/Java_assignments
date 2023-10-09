package Dsa;
import DsaAssignments.Warmup;

import java.util.Arrays.*;

// "static void main" must be defined in a public class.
public class Main {

    /*
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
*/
    public static void main(String[] args) {
        //jewels stone count
        JewelsAndStones obj = new JewelsAndStones();
        String jewels = "aA", stones = "aAAbbbb";
        System.out.println(obj.numJewelsInStones(jewels,stones ));
        String jewels2 = "z", stones2 = "ZZ";
        System.out.println(obj.numJewelsInStones(jewels2,stones2 ));
        System.out.println(obj.numJewelsInStones("z","Zz" ));
        System.out.println(obj.numJewelsInStones("ABa","AB" ));
        System.out.println(obj.numJewelsInStones("ABC","pqr" ));
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

     /*int[] arr = {0,4,2,0};
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
        */

/*      int[] arr = {1, 20, 3, 4, 5};
        int n = arr.length;
        Warmup.sumOfNIntegers(arr,n);
        int[] arr2 = {5, 8, 3, 10, 22, 45};
        n = arr2.length;
        Warmup.sumOfNIntegers(arr2,n);

        Warmup.printValueAtIndexK(arr,2);
        int A[] = {1, 2, 4, 5, 8, 10};
        System.out.println(Warmup.findNumOfElementsLessThanValue(A,A.length,9));
        int N = 7;
        int A2[] = {1, 2, 2, 2, 5, 7, 9};
       int  X = 2;

        System.out.println(Warmup.findNumOfElementsLessThanValue(A2,N,X));
        N = 4;
       int A3[] = {1, 2, 3, 4};
       // Input: N = 4 A[] = {1, 2, 3, 4}
        Warmup.printAlternateValuesfromArray(A3,N);
        //Input: N = 5 A[] = {1, 2, 3, 4, 5}
        N = 5;
        int A4[] = {1, 2, 3, 4, 5};
        System.out.println();
        Warmup.printAlternateValuesfromArray(A4,N);

        //N = 5 Arr[] = {15, 2, 45, 12, 7} Output: 2
        int[] A5 = {15, 2, 45, 12, 7};
        N = 5;
        System.out.println();
        System.out.println(Warmup.findValueEqualstoIndexinArr(A5, N));

        //N = 1 Arr[] = {1} Output: 1
        int[] A6 = {1};
        N = 1;
        System.out.println(Warmup.findValueEqualstoIndexinArr(A6, N));
        */
/*
       // Input : Arr[] = {1, 2, 3, 2, 1} Output : PERFECT
        int arr[] = {1, 2, 3, 2, 1};
        Warmup.isPerfectArray(arr);

        //Input : Arr[] = {1, 2, 3, 4, 5} Output : NOT PERFECT
        int arr2[] = {1, 2, 3, 4, 5};
        Warmup.isPerfectArray(arr2);
        */
/*
      //Input: N = 7 A[] = {7, 8, 3, 4, 2, 9, 5}
        //Ouput: 5
       int  A[] = {7, 8, 3, 4, 2, 9, 5};
       int N = 7;
       //sorted arr {2,3,4,5,7,8,9}
        System.out.println(Warmup.returnLastElementInReducedArray(A,N));
//Example 2: Input: N = 8 A[] = {8, 1, 2, 9, 4, 3, 7, 5} Ouput: 4
        int  A2[] = {8, 1, 2, 9, 4, 3, 7, 5};
         N = 8;
         //sorted arr {1,2,3,4,5,7,8,9}
        System.out.println(Warmup.returnLastElementInReducedArray(A2,N));
*/
/*
        Example 1: Input : a[] = {2, 8, 7, 1, 5} Output : 1 2 5*/
       /* int a[] = {2, 8, 7, 1, 5};
        Warmup.printElementsInArrayExcept2greatest(a);

        //Input : a2[] = {7, -2, 3, 4, 9, -1}
        System.out.println();
        int a2[] = {7, -2, 3, 4, 9, -1};
        Warmup.printElementsInArrayExcept2greatest(a2);
        */
        /*
        sum of series
            Example 1: Input: N = 1 Output: 1 Explanation: For n = 1, sum will be 1.
     Example 2: Input: N = 5 Output: 15 Explanation: For n = 5, sum will be 1 + 2 + 3 + 4 + 5 = 1
         */
      /*  int n =1;
        System.out.println(Warmup.sumOfSeries(n));
        n = 5;
        System.out.println(Warmup.sumOfSeries(n));

       */
       /* int n = 192;
        System.out.println(n+" is "+(Warmup.isFascinatingNumber(n) == true ? "Fascinating" : "Not Fascinating"));
        n = 193;
        System.out.println(n+" is "+(Warmup.isFascinatingNumber(n) == true ? "Fascinating" : "Not Fascinating"));
        n = 90;
        System.out.println(n+" is "+(Warmup.isFascinatingNumber(n) == true ? "Fascinating" : "Not Fascinating"));*/

        /*
         Example 1: Input: N = 4 arr[] = {1, 5, 3, 2} Output: 1
     Explanation: Sum of first 2 elements is 1 + 5 = 6, Sum of last 2 elements is 3 + 2 = 5,
     To make the array balanced you can add 1. Example 2: Input: N = 6 arr[] = { 1, 2, 1, 2, 1, 3 } Output: 2
     Explanation: Sum of first 3 elements is 1 + 2 + 1 = 4,
         */
        /*int arr[] = {1, 5, 3, 2};
        System.out.println(Warmup.balanceArray(arr));
        int arr2[] = { 1, 2, 1, 2, 1, 3 };
        System.out.println(Warmup.balanceArray(arr2));

         */
    }
}
