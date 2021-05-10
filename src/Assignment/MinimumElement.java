package Assignment;
import java.util.Scanner;

public class MinimumElement {

    public static Scanner scanner = new Scanner(System.in);

    public static int readInteger(){
        System.out.println("Enter count");
        int count = scanner.nextInt();
        return count;
    }

    public static int[] readElements(int number){
        int arr[] = new int[number];
        //System.out.println(" Please enter "+number+ " integer numbers");

        for(int i=0 ; i < arr.length; i++){
            System.out.println("Enter Number");
            arr[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return arr;

    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i< array.length; i++){
            if(min >  array[i]){
                min = array[i];
            }
        }
        return min;
    }


}
