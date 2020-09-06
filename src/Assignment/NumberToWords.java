package Assignment;

public class NumberToWords {

    
    public static int getDigitCount(int number){

        int count = 0;
        if(number < 0){
            return -1;
        }

        if(number == 0){
            return 1;
        }


        while(number > 0){

            number = number / 10;
            //System.out.println("Place value="+placeValue+" Unit digit ="+unitDigit);
                        
            count++;
           
              
        }

        return count;

    }

    public static int reverse(int number){

        int reverseNumber = 0;
        int unitDigit = 0;
        boolean isNegative = false;
       
        if(number < 0){

            number = -(number);
            isNegative = true;

        }
      
       
        while(number > 0){

            unitDigit =(int)(number % 10) ;
           

            number = number / 10;
            //System.out.println("Place value="+placeValue+" Unit digit ="+unitDigit);
                        
            reverseNumber=(reverseNumber * 10)+unitDigit;
           
           
           
        }
        if(isNegative)
        reverseNumber = 0 - reverseNumber;

        return reverseNumber;
    }

    public static void numberToWords(int number){

        boolean isNegative = false;
        int unitDigit = 0;
        int i =0;
        if(number < 0){
            System.out.println("Invalid Value");
        }
        else{
        
            if(number < 0){

                number = -(number);
                isNegative = true;

            }

            int numberCount = 0;
            numberCount = getDigitCount(number);
            
            number = reverse(number);
            

            for(i=0; number >0 ; i++){

                unitDigit =(int)(number % 10) ;

                printNumberInWord(unitDigit);

                System.out.print(" ");

                number = number / 10;

            }

            //System.out.println("I value="+ i +" numberCount =" + numberCount);
            if(i < numberCount) {
                for(;i<numberCount;i++){

                    System.out.print("ZERO"+" ");
                    //System.out.println("**I value="+ i +" numberCount =" + numberCount);

                }
            }
        }

    }

    public static void printNumberInWord(int num){

        switch(num){

            case 0:
            System.out.print("ZERO");
            break;
           
            case 1:
            System.out.print("ONE");
            break;

            case 2:
            System.out.print("TWO");
            break;

            case 3:
            System.out.print("THREE");
            break;

            case 4:
            System.out.print("FOUR");
            break;

            case 5:
            System.out.print("FIVE");
            break;

            case 6:
            System.out.print("SIX");
            break;

            case 7:
            System.out.print("SEVEN");
            break;

            case 8:
            System.out.print("EIGHT");
            break;

            case 9:
            System.out.print("NINE");
            break;

            default:
            System.out.print("OTHER");
            break;



        }
    }
    
}