package Assignment;
//import java.util.Arrays;
//import java.util.Scanner;

import Assignment.AbstractClass.MyItemList;
import Assignment.AbstractClass.Node;
import Assignment.AbstractClass.SearchTree;
import Assignment.Banking.Bank;
import Assignment.Innerclass.Album;
import Assignment.Innerclass.Song;
import study.java.example.Series;
import study.java.scope.X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class Main{
    public static void printArray(int [] nums){
        for(int i =0; i< nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

   public static void main(String args[]){

       //RunningSumOf1DArray
       int [] nums = {1,2,3,4};
       RunningSumOf1DArray r = new RunningSumOf1DArray();
       int[] sumarr = r.runningSum(nums);
       printArray(sumarr);
       int[] num2 = {1,1,1,1,1};
       printArray(r.runningSum(num2));
       //Richest man
       /*int [][] accounts = {{1,2,3},{3,2,1}};
       RichestMan r = new RichestMan();
       System.out.println(r.maximumWealth(accounts));
       int [][] account = {{1,5},{7,3},{3,5}};//];
       System.out.println(r.maximumWealth(account));
       int [][] acc = {{2,8,7},{7,1,3},{1,9,5}};
       System.out.println(r.maximumWealth(acc));*/


    /*X x = new X(5);
    x.x();
    x.printTable(3);
       System.out.println("************************************");
    X.Xinnercalss xinner = x.new Xinnercalss(5);
    xinner.x();
    xinner.printTable(4);
   /*
   Created jar  and tested in another project
    Series s = new Series();

    for(int i = 0; i<=10; i++){
     System.out.println(s.nSum(i));
    }
    for(int i = 0; i<=10; i++) {
     System.out.println("Factorial of " + i+"=" + s.factorial(i));
    }
    for(int i = 0; i<=10; i++) {
     System.out.println("Fibonacci of" + i+"=" + s.fibonacci(i));
    }
    */

    /*MyItemList list = new MyItemList(null);
    list.traverse(list.getRoot());*/

  /*  String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
    String[] data = stringData.split(" ");
    for(String s : data){
     list.addItem(new Node(s) );
    }
    list.traverse(list.getRoot());
*/
    /* search tree testing
    SearchTree list = new SearchTree(null);
    list.traverse(list.getRoot());
    String stringData = "8 9 6 3 0 1 2 5 4 7";
    String[] data = stringData.split(" ");
    for(String s : data){
     list.addItem(new Node(s) );
    }
    list.traverse(list.getRoot());
    list.traverse(list.getRoot());
    list.removeItem(new Node("5"));
    list.traverse(list.getRoot());
    list.removeItem(new Node("8"));
    list.traverse(list.getRoot());
    list.removeItem(new Node("3"));
    list.traverse(list.getRoot());
    list.removeItem(new Node("2"));
    list.traverse(list.getRoot());
    list.removeItem(new Node("0"));
    list.traverse(list.getRoot());
    list.removeItem(new Node("1"));
    list.traverse(list.getRoot());
    list.removeItem(new Node("9"));
    list.traverse(list.getRoot());
    list.removeItem(new Node("7"));
    list.removeItem(new Node("6"));
    list.traverse(list.getRoot());
    list.removeItem(new Node("4"));
    list.traverse(list.getRoot());

*/

  /*  Bank bank = new Bank("State Bank of India ");
    bank.addBranch("Baner");
    bank.addCustomer("Baner","Jyoti",50.100);
    bank.addCustomer("Baner","Swati",100.50);
    bank.addCustomer("Baner","Rutuja",155.20);
    bank.addCustomer("Baner","Rutuja",152.20);
    bank.addCustomerTransaction("Baner","Jyoti",22.44);
    bank.addCustomerTransaction("Baner","Jyoti",12.44);
    bank.addCustomerTransaction("Baner","Swati",2.44);
    bank.listCustomers("Baner",true);
    bank.listCustomers("Baner",false);
    */


     //testing reversed array
      /* int[] array = {1, 5, 8, 9,89,78,0, -8};
       //System.out.println(Arrays.toString(array));
       ReverseArray.reverse(array);
       //System.out.println(Arrays.toString(array));

       */


    //testing minimum element from array
   /* int count = MinimumElement.readInteger();
    int[] returnedArray = MinimumElement.readElements(count);
    System.out.println("Minimum element from array is "+MinimumElement.findMin(returnedArray));
    */

    //testing for sorting Array
   /* int arr[] = SortedArray.getIntegers(5);
    SortedArray.printArray(arr);
    int sortedArr[] = SortedArray.sortIntegers(arr);
    SortedArray.printArray(sortedArr);*/


      //check Rectangle, Cuboid and inhertance
     /* Rectangle rectangle  = new Rectangle(5, 10);
      System.out.println("Rectangle width ="+rectangle.getWidth());
      System.out.println("Rectangle length ="+rectangle.getLength());
      System.out.println("Rectangle Area ="+rectangle.getArea());

      Cuboid cuboid = new Cuboid(5, 10, 5);
      System.out.println("Cuboid width= " + cuboid.getWidth());
      System.out.println("Cuboid length= " + cuboid.getLength());
      System.out.println("Cuboid height= " + cuboid.getHeight());
      System.out.println("Cuboid Volume" + cuboid.getVolume());

      */
      //check Area , cylinder and inheritance

      /*Circle circle = new Circle(3.75);
      System.out.println("Circle radious"+ circle.getRadius());
      System.out.println("Circle Area"+ circle.getArea());

      Cylinder cylinder = new Cylinder(5.55, 7.25);
      System.out.println("Cylinder radious= "+ cylinder.getRadius());
      System.out.println("Cylinder height= "+ cylinder.getHeight());
      System.out.println("Cylinder area= "+ cylinder.getArea());
      System.out.println("Cylinder volume"+ cylinder.getVolume());
      */

      // the solution of InputCalculator

    //InputCalculator.inputThenPrintSumAndAverage();

      //checking solution of number to words assignment
  /*   int number;
      number = 0;
     System.out.println("Digit count of number"+number+"="+NumberToWords.getDigitCount(number));
     number = 123;
     System.out.println("Digit count of number"+number+"="+NumberToWords.getDigitCount(number));
     number = -12;
     System.out.println("Digit count of number"+number+"="+NumberToWords.getDigitCount(number));
     number = 100;
     System.out.println("Digit count of number"+number+"="+NumberToWords.getDigitCount(number));
     number = 1234;
     System.out.println("Digit count of number"+number+"="+NumberToWords.getDigitCount(number));

    number = 123;
    System.out.println("Reverse number of "+number+" is "+NumberToWords.reverse(number));
    
    number = 123;
    System.out.println("Reverse number of "+number+" is "+NumberToWords.reverse(number));

       
    number = -121;
    System.out.println("Reverse number of "+number+" is "+NumberToWords.reverse(number));

    number = 1212;
    System.out.println("Reverse number of "+number+" is "+NumberToWords.reverse(number));

    number = 100;
    System.out.println("Reverse number of "+number+" is "+NumberToWords.reverse(number));

    
    NumberToWords.numberToWords(123);
    System.out.println("****");
    NumberToWords.numberToWords(100);
    System.out.println("****");
    NumberToWords.numberToWords(1010);
    System.out.println("****");
    NumberToWords.numberToWords(-12);

*/

      //checking for solution of is perfect number

      /*System.out.println(PerfectNumber.isPerfectNumber(1));
      System.out.println(PerfectNumber.isPerfectNumber(6));
      System.out.println(PerfectNumber.isPerfectNumber(-1));
      System.out.println(PerfectNumber.isPerfectNumber(12));
      System.out.println(PerfectNumber.isPerfectNumber(5));
      System.out.println(PerfectNumber.isPerfectNumber(28));*/



      //checking for print factors of number

      /*FactorPrinter.printFactors(1);
      System.out.println("************");
      FactorPrinter.printFactors(0);
      System.out.println("************");
      FactorPrinter.printFactors(7);
      System.out.println("************");
      FactorPrinter.printFactors(16);
      System.out.println("************");
      FactorPrinter.printFactors(45);*/



      //check value of greatest divisor
     /* System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(18, 9));
      System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(20, -15));
      System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
      System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));
      System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));*/



      //check if  two numbers last digit number is same out of three numbers LastDigitChecker

     /* System.out.println(LastDigitChecker.hasSameLastDigit(10, 100, 23));
      System.out.println(LastDigitChecker.hasSameLastDigit(10, 100, 9));
      System.out.println(LastDigitChecker.hasSameLastDigit(19, 25, 959));
      System.out.println(LastDigitChecker.hasSameLastDigit(18, 236, 586));*/

      //check shared digit
      //System.out.println("Test1="+SharedDigit.hasSharedDigit(12, 13));
      //System.out.println("Test2="+SharedDigit.hasSharedDigit(12, 34));
      //System.out.println("Test3="+SharedDigit.hasSharedDigit(25, 53));
      //System.out.println("Test4="+SharedDigit.hasSharedDigit(11, 10));

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
