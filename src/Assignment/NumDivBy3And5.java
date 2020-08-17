package Assignment;

public class NumDivBy3And5 {

    public static void getNumbersDivededBy3And5(int num1, int num2){

        int sum = 0;
        int count = 0;

        if(num1 < num2)
        {
            for(int i = num1; i<=num2; i++){

                if(i%3 == 0 && i%5 == 0){
                    System.out.println(i);
                    sum+=i;
                    count++;
                }
                if(count == 5)
                    break;

            }
            System.out.println("Sum of three numbers which are divided by 3 and 5 is "+sum);

        }
        else
        {
            for(int i = num2; i >= num1; i--){
                if(i%3 == 0 && i%5 == 0)
                System.out.println(i);
            }

        }

    }
    
}