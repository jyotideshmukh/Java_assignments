package DsaAssignments;

import java.util.Arrays;

public class Warmup {

   /* Q1. Given an array of N integers. Your task is to print the sum of all of the integers.
    Example 1: Input: 4
    1 2 3 4
    Output: 10
    Example 2:
    Input: 6
    5 8 3 10 22 45
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
        System.out.println("Value at index " + k + " is in input arr is "+arr[k]);
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
            if(arr[i] <= x){
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

    public static void printAlternateValuesfromArray(int[] arr, int n ){
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
    }

    /*
    Q5. Given an array Arr of N positive integers.
    Your task is to find the elements whose value is equal to that of
    its index value ( Consider 1-based indexing ).
     Example 1: Input: N = 5 Arr[] = {15, 2, 45, 12, 7} Output: 2
     Explanation: Only Arr[2] = 2 exists here.
     Example 2: Input: N = 1 Arr[] = {1} Output: 1 Explanation: Here Arr[1] = 1 exists.
     */
    public static int findValueEqualstoIndexinArr(int[] arr, int n){
        int index =-1;
        for(int i = 0; i < n; i++){
            //System.out.println(arr[i]+","+ i);
            if(i+1 == arr[i]){
                return i+1;
            }
        }
        return index;
    }

    /*
    Q6. Given an array of size N and you have to tell whether the array is perfect or not.
     An array is said to be perfect if it's reverse array matches the original array.
      If the array is perfect then print "PERFECT" else print "NOT PERFECT".
      Example 1: Input : Arr[] = {1, 2, 3, 2, 1} Output : PERFECT
      Explanation: Here we can see we have [1, 2, 3, 2, 1] if we reverse it we can find [1, 2, 3, 2, 1]
      which is the same as before. So, the answer is PERFECT.
     Example 2: Input : Arr[] = {1, 2, 3, 4, 5} Output : NOT PERFECT
    * */
    public static void isPerfectArray(int[] arr){
        int n = arr.length;
        int j = n/2;
        n--;
        int i;
        for( i = 0; i <= j; i++, n--){
            if(arr[i] != arr[n]){
                break;
            }
        }
        if(i >= j){
            System.out.println("PERFECT");
        }else
        {
            System.out.println("NOT PERFECT");
        }
    }

    /*
    7. Given an array of length N, at each step it is reduced by 1 element.
    In the first step the maximum element would be removed,
    while in the second step minimum element of the remaining array would be removed,
    in the third step again the maximum and so on.
    Continue this till the array contains only 1 element.
    And find the final element remaining in the array.
    Example 1: Input: N = 7 A[] = {7, 8, 3, 4, 2, 9, 5}
Ouput: 5
Explanation: In first step '9' would be removed, in 2nd step '2' will be removed,
 in third step '8' will be removed and so on. So the last remaining element would be '5'.
 Example 2: Input: N = 8 A[] = {8, 1, 2, 9, 4, 3, 7, 5} Ouput: 4
     */
    public static int returnLastElementInReducedArray(int[] arr, int n){
        Arrays.sort(arr);
        //sorting of array
        int j =n/2;
        if(n%2 !=0) //2,3,3,5,7,8,9
            return arr[j];
        else //1,2,3,4,5,7,8,9
            return arr[j-1];

    }

    /*
    Q8. Given an array of N distinct elements, the task is to find all elements in
    array except two greatest elements in sorted order.
    Example 1: Input : a[] = {2, 8, 7, 1, 5} Output : 1 2 5
    Explanation : The output three elements have two or more greater elements.
    Example 2: Input : a[] = {7, -2, 3, 4, 9, -1} Output : -2 -1 3 4
    * */
    public static void printElementsInArrayExcept2greatest(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 0 ; i<n-2; i++){
            System.out.print(arr[i]+" ");
        }
    }

    /*
    Q9. Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms)
    Example 1: Input: N = 1 Output: 1 Explanation: For n = 1, sum will be 1.
     Example 2: Input: N = 5 Output: 15 Explanation: For n = 5, sum will be 1 + 2 + 3 + 4 + 5 = 15.
     */

    public static long sumOfSeries(int n){
        int sum = 0;

        for(int i = 1; i <= n; i++){
             sum += i;

        }
        return sum;
    }

    /*
    Q10. Given a number N. Your task is to check whether it is fascinating or not.
     Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3 ,
     and when both these products are concatenated with the original number,
     then it results in all digits from 1 to 9 present exactly once.
      Example 1: Input: N = 192 Output: Fascinating Explanation:
       After multiplication with 2 and 3, and concatenating with original number,
        number will become 192384576 which contains all digits from 1 to 9.
     */

    public static boolean isFascinatingNumber(int num){
        if(num >= 100){
          long productBy2 = num * 2;
            long productBy3 = num * 3;
            //System.out.println("product by 2 "+productBy2);
            //System.out.println("product by 3 "+productBy3);
            String s = new String( num+""+productBy2+""+productBy3);
           // System.out.println("concatenated  string"+s);
            char[] arr= s.toCharArray();
            Arrays.sort(arr);
            //Warmup.printArray(arr,arr.length);
            //System.out.println();
            int i = 0;
            for( ; i < arr.length; i++ ){
              //  System.out.println((i+1)+"=arr[i]="+arr[i]+(i+1));
                if(Character.getNumericValue(arr[i])   != (i+1) )
                    break;
            }
            //System.out.println("i="+i);
            //System.out.println(" arry len ="+arr.length);
            if(i == arr.length)
                return true;
        }
        return false;
    }
    /*static void printArray(char[] arr, int size) {

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }*/

    /*Bonus Question Given an array of even size N, task is to find minimum value
     that can be added to an element so that array become balanced. An array is balanced
     if the sum of the left half of the array elements is equal to the sum of right half.
     Example 1: Input: N = 4 arr[] = {1, 5, 3, 2} Output: 1
     Explanation: Sum of first 2 elements is 1 + 5 = 6, Sum of last 2 elements is 3 + 2 = 5,
     To make the array balanced you can add 1. Example 2: Input: N = 6 arr[] = { 1, 2, 1, 2, 1, 3 } Output: 2
     Explanation: Sum of first 3 elements is 1 + 2 + 1 = 4, Sum of last three
     */

    public static long balanceArray(int[] arr){
        long num = -1;
        int len = arr.length;
        int n = len;
        n--;
        long leftSum = 0;
        long rightSum = 0;
        if(len % 2 == 0){
            for(int i =0 ; i< len/2; i++, n--){
                leftSum += arr[i];
                rightSum += arr[n];
            }

            if(leftSum > rightSum)
                return (leftSum - rightSum);
            else if(rightSum > leftSum)
                return rightSum -leftSum;
            else
                return 0;
        }
        return num;
    }


    public static void main(String[] args) {
        int[] arr = {1, 20, 3, 4, 5};
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


       // Input : Arr[] = {1, 2, 3, 2, 1} Output : PERFECT
        int arr5[] = {1, 2, 3, 2, 1};
        Warmup.isPerfectArray(arr5);

        //Input : Arr[] = {1, 2, 3, 4, 5} Output : NOT PERFECT
        int arr6[] = {1, 2, 3, 4, 5};
        Warmup.isPerfectArray(arr6);


      //Input: N = 7 A[] = {7, 8, 3, 4, 2, 9, 5}
        //Ouput: 5
       int  A7[] = {7, 8, 3, 4, 2, 9, 5};
        N = 7;
       //sorted arr {2,3,4,5,7,8,9}
        System.out.println(Warmup.returnLastElementInReducedArray(A7,N));
        //Example 2: Input: N = 8 A[] = {8, 1, 2, 9, 4, 3, 7, 5} Ouput: 4
        int  A8[] = {8, 1, 2, 9, 4, 3, 7, 5};
         N = 8;
         //sorted arr {1,2,3,4,5,7,8,9}
        System.out.println(Warmup.returnLastElementInReducedArray(A8,N));


       // Example 1: Input : a[] = {2, 8, 7, 1, 5} Output : 1 2 5*/
        int a[] = {2, 8, 7, 1, 5};
        Warmup.printElementsInArrayExcept2greatest(a);

        //Input : a2[] = {7, -2, 3, 4, 9, -1}
        System.out.println();
        int a2[] = {7, -2, 3, 4, 9, -1};
        Warmup.printElementsInArrayExcept2greatest(a2);

        /*
        sum of series
            Example 1: Input: N = 1 Output: 1 Explanation: For n = 1, sum will be 1.
     Example 2: Input: N = 5 Output: 15 Explanation: For n = 5, sum will be 1 + 2 + 3 + 4 + 5 = 1
         */
         n =1;
        System.out.println(Warmup.sumOfSeries(n));
        n = 5;
        System.out.println(Warmup.sumOfSeries(n));


        n = 192;
        System.out.println(n+" is "+(Warmup.isFascinatingNumber(n) == true ? "Fascinating" : "Not Fascinating"));
        n = 193;
        System.out.println(n+" is "+(Warmup.isFascinatingNumber(n) == true ? "Fascinating" : "Not Fascinating"));
        n = 90;
        System.out.println(n+" is "+(Warmup.isFascinatingNumber(n) == true ? "Fascinating" : "Not Fascinating"));

        /*
         Example 1: Input: N = 4 arr[] = {1, 5, 3, 2} Output: 1
     Explanation: Sum of first 2 elements is 1 + 5 = 6, Sum of last 2 elements is 3 + 2 = 5,
     To make the array balanced you can add 1. Example 2: Input: N = 6 arr[] = { 1, 2, 1, 2, 1, 3 } Output: 2
     Explanation: Sum of first 3 elements is 1 + 2 + 1 = 4,
         */
        int arr3[] = {1, 5, 3, 2};
        System.out.println(Warmup.balanceArray(arr3));
        int arr4[] = { 1, 2, 1, 2, 1, 3 };
        System.out.println(Warmup.balanceArray(arr4));

    }
}
