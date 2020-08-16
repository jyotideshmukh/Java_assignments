package Assignment;


public class SwitchTest {

    public static void testSwitchCase(char testChar) {

        switch(testChar){
            case 'A':
               System.out.println("Char A");
               break;
            case 'B':
               System.out.println("Char B");
               break;   
            case 'C':
               System.out.println("Char C");
               break;  
            default:
               System.out.println("Char is not A, B or C");
               break;                                  
        }
    }

    public static void getDayByNum(int dayNum){

        switch(dayNum){
            case 0:
               System.out.println("Sunday");
               break;
            case 1:
               System.out.println("Monday");
               break;   
            case 2:
               System.out.println("Tuesday");
            case 3:
               System.out.println("Wednesday");               
               break;  
            case 4:
               System.out.println("Thursday");               
               break; 
            case 5:
               System.out.println("Friday"); 
               break;      
            case 6:
               System.out.println("Saturday");                         
               break;                               
            default:
               System.out.println("Not valid day");
               break;                                  
        }
        

    }

    
}