package DsaAssignments;

public class Warmup {

   /* Q1. Given an array of N integers. Your task is to print the sum of all of the integers.
    Example 1: Input: 41 2 3 4
    Output: 10
    Example 2:
    Input: 65 8 3 10 22 45
    Output: 93
    */

    public static void sumOfNIntegers(int[] arr,int n){
        long sum =0;
        for(int i =0; i <n; i++){
            sum+=arr[i];
        }
        System.out.println("Sum of inputs ="+sum);
    }

    /*
    Q2. Given an array A[] of N integers and an index Key.
    Your task is to print the element present at index key in the array.
    Example 1:
    Input:  2
    10 20 30 40 50
    Output: 30
    Example 2:
    Input: 4
    10 20 30 40 50 60 70
    Output: 50
     */

    public static void printValueAtIndexK(int[] arr,int k){
        int n = arr.length;
        if(k < 0 && k > k ){
            System.out.println("Invalid index key");
        }
        System.out.println("Value at index" + k + "is in input arr is"+arr[k]);
    }

    /*
    Q3. Given an sorted array A of size N.
    Find number of elements which are less than or equal to given element X.
    Example 1: Input: N = 6 A[] = {1, 2, 4, 5, 8, 10} X = 9 Output: 5
    Example 2: Input: N = 7 A[] = {1, 2, 2, 2, 5, 7, 9} X = 2 Output: 4
     */
    public static int findNumOfElementsLessThanValue(int[] arr, int n, int x){
        int count = 0;
        for(int i = 0; i< n; i++){
            if(arr[i] < x){
                count++;
            }
            else{
                break;
            }
        }
        return count;

    }

    /*
    Q4. You are given an array A of size N.
    You need to print elements of A in alternate order (starting from index 0).
    Example 1: Input: N = 4 A[] = {1, 2, 3, 4} Output: 1 3
    Example 2: Input: N = 5 A[] = {1, 2, 3, 4, 5} Output: 1 3 5
     */
}
