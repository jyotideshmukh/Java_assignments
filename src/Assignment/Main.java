package Assignment;

public class Main {

    public static void main(String args[]){

      //check shared digit
      System.out.println("Test1="+SharedDigit.hasSharedDigit(12, 13));
      System.out.println("Test2="+SharedDigit.hasSharedDigit(12, 34));
      System.out.println("Test3="+SharedDigit.hasSharedDigit(25, 53));
      System.out.println("Test4="+SharedDigit.hasSharedDigit(11, 10));

      //get Even digitSum from number
     /* System.out.println("Sum="+ EvenDigitSum.getEvenDigitSum(123456789));
      System.out.println("Sum="+ EvenDigitSum.getEvenDigitSum(11));
      System.out.println("Sum="+ EvenDigitSum.getEvenDigitSum(-22));*/


      //checking of solution  return sum of first and last digit number

      //System.out.println("Sum of first and last digit of 5 is "+FirstLastDigitSum.sumFirstAndLastDigit(5));
      //System.out.println("Sum of first and last digit 121 is "+FirstLastDigitSum.sumFirstAndLastDigit(121));
      //System.out.println("Sum of first and last digit 100 is "+FirstLastDigitSum.sumFirstAndLastDigit(100));
      //System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(-100));
      //System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(11));


      //checking solution isPalindrome
      /*System.out.println( NumberPalindrome.isPalindrome(121));
      System.out.println( NumberPalindrome.isPalindrome(12));
      
      System.out.println( NumberPalindrome.isPalindrome(-1221));*/



      //checking for solution of sum of digits

     /*System.out.println(DigitSumChallenge.sumDigits(1));
     System.out.println(DigitSumChallenge.sumDigits(10));
     System.out.println(DigitSumChallenge.sumDigits(123));
     System.out.println(DigitSumChallenge.sumDigits(321));
     System.out.println(DigitSumChallenge.sumDigits(51));
     System.out.println(DigitSumChallenge.sumDigits(600));
     System.out.println(DigitSumChallenge.sumDigits(1236));*/

      //checking solution of sum odd

     /*System.out.println(SumOddRange.sumOdd(1,100));
     System.out.println(SumOddRange.sumOdd(-1,100));
     System.out.println(SumOddRange.sumOdd(13,13));
     System.out.println(SumOddRange.sumOdd(100,-100));
     System.out.println(SumOddRange.sumOdd(100,1000));*/



      //checking solution if number divided  by 3 and 5 within range

      //NumDivBy3And5.getNumbersDivededBy3And5(1, 110);

     // NumDivBy3And5.getNumbersDivededBy3And5(1000, 1);

      //checking solution of NumberOfDaysInMonth-year

     /* System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 1924));cls
      System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 3000));
      System.out.println(NumberOfDaysInMonth.getDaysInMonth(8, 2020));
      System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));

      System.out.println(NumberOfDaysInMonth.isLeapYear(-2020));
      System.out.println(NumberOfDaysInMonth.isLeapYear(2020));
      System.out.println(NumberOfDaysInMonth.isLeapYear(3000));*/

      //checking for switch case
     /* SwitchTest.getDayByNum(0);
      SwitchTest.getDayByNum(1);
      SwitchTest.getDayByNum(3);
      SwitchTest.getDayByNum(4);
      SwitchTest.getDayByNum(5);
      SwitchTest.getDayByNum(6);
      SwitchTest.getDayByNum(7);*/

      /*SwitchTest.testSwitchCase('A');
      SwitchTest.testSwitchCase('B');
      SwitchTest.testSwitchCase('C');
      SwitchTest.testSwitchCase('D');*/



      //checking solution of IntEqualityPrinter
     /* IntEqualityPrinter.printEqual(1, 1, 1);
      IntEqualityPrinter.printEqual(-1, 1, 1);
      IntEqualityPrinter.printEqual(1, -1, 1);
      IntEqualityPrinter.printEqual(1, 1, -1);
      IntEqualityPrinter.printEqual(1, 1, 2);
      IntEqualityPrinter.printEqual(1, 2, 2);
      IntEqualityPrinter.printEqual(1, 2, 1);
      */

      //checking solution of MinutesToYearsDaysCalculator- print year and days from minutes

     /* MinutesToYearsDaysCalculator.printYearsAndDays(1440);
      MinutesToYearsDaysCalculator.printYearsAndDays(-1440);
      MinutesToYearsDaysCalculator.printYearsAndDays((365*24*60)+1);*/

      //checking solution - overloading area of circle and rectangle Use of Math.PI and constant variable use for returning error

     /* System.out.println(AreaOverloading.area(10, 5));
      System.out.println(AreaOverloading.area(10));
      System.out.println(AreaOverloading.area(-10));
      System.out.println(AreaOverloading.area(-10,5));
      System.out.println(AreaOverloading.area(10,-5));
      */

      //checking solution of DurationString

     /* DurationString.getDurationString(3602,59);
      DurationString.getDurationString(3945);*/


      //checking solution for overloading

      //OverLoading.calculateFeetAndInchesToCentimeters(6,6);
      //OverLoading.calculateFeetAndInchesToCentimeters(78);


         //checking answers of EqualSumChecker
        /* System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2));
         System.out.println(EqualSumChecker.hasEqualSum(1, 2, 2));
         */


       //checking answers of DecimalComparator
        /*System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1751, -3.1756));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));*/


        //checking answers of SpeedConverter
        //SpeedConverter.toMilesPerHour(0);
       // SpeedConverter.toMilesPerHour(1.6);
        //SpeedConverter.printConversion(95.75);
       // SpeedConverter.printConversion(0);

         //checking answers of MegaBytesConverter
      // MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
      // MegaBytesConverter.printMegaBytesAndKiloBytes(200);
       //MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
       //MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);

       //checking answers of BarkingDog
       //System.out.println(BarkingDog.shouldWakeUp(true,23));
       //System.out.println(BarkingDog.shouldWakeUp(true,1));
       //System.out.println(BarkingDog.shouldWakeUp(true,10));
       //System.out.println(BarkingDog.shouldWakeUp(false,1));
       //System.out.println(BarkingDog.shouldWakeUp(false,-1));

         //checking answers of LeapYear
       /*System.out.println(LeapYear.isLeapYear(1700));
       System.out.println(LeapYear.isLeapYear(1800));
       System.out.println(LeapYear.isLeapYear(1900));
       System.out.println(LeapYear.isLeapYear(2100));
       System.out.println(LeapYear.isLeapYear(2200));
       System.out.println(LeapYear.isLeapYear(2300));
       System.out.println(LeapYear.isLeapYear(2500));
       System.out.println(LeapYear.isLeapYear(2600));
       System.out.println(LeapYear.isLeapYear(1600));
       System.out.println(LeapYear.isLeapYear(2000));
       System.out.println(LeapYear.isLeapYear(2400));
       System.out.println(LeapYear.isLeapYear(-2400));
       System.out.println(LeapYear.isLeapYear(0));
       System.out.println(LeapYear.isLeapYear(1924));*/
    }
}
