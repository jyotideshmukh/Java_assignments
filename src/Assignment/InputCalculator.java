package Assignment;
import java.util.Scanner;
 
public class InputCalculator {
    // Write your code here
    
    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        //long avarage = 0;
        int counter = 0 ;

        while(true){

            boolean hasInt = scanner.hasNextInt();
            if(hasInt){
                int number = scanner.nextInt();
                sum += number;
                counter++;

            }else{
                break;
            }
            scanner.nextLine();

        }
        scanner.close();
        System.out.println("SUM="+sum+" AVG="+(sum/counter));
    }
    
}