package Assignment;

public class IntEqualityPrinter {

    public static void printEqual(int num1, int num2, int num3){

        if(num1 < 0 || num2 < 0 || num3 < 0)
            System.out.println("Invalid Value");
        else{

          String printText = (num1 == num2) && (num2 == num3) ? "All numbers are equal" :((num1 == num2) || (num2 == num3) || (num1 ==num3) ? "Neither all are equal or different" :"All numbers are different");

          System.out.println(printText);
        }
    }
    
}