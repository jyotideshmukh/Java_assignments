package Assignment;
import java.util.Scanner;

public class SortedArray {

    public static Scanner scanner = new Scanner(System.in);

    public static void printArray(int[] arr){
        for(int i =0; i< arr.length; i++){
            System.out.println("Element "+ i + " contents "+ arr[i]);
        }
    }

    public static int[] sortIntegers(int[] integerArr){
        int sortedArr[] = new int[integerArr.length];
        sortedArr = integerArr;
        for(int k =0; k < sortedArr.length; k++) {
            for (int i = k; i < sortedArr.length; i++) {
                if (sortedArr[i] > sortedArr[k]) {
                    int temp = sortedArr[i];
                    sortedArr[i] = sortedArr[k];
                    sortedArr[k] = temp;
                }
            }
        }

        return sortedArr;
    }

    public static int[] getIntegers(int number){
        int arr[] = new int[number];
        //System.out.println(" Please enter "+number+ " integer numbers");

        for(int i=0 ; i < arr.length; i++){
            arr[i] = scanner.nextInt();
            //scanner.nextLine();
        }

        return arr;

    }

    
}


