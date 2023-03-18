package Dsa;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        int cnt = 0;
        int[] index = new int[2];
        int index1 = 0;
        int index2 = 1;

        //System.out.println("Index1 = "+index1+" Index2 = "+index2+ "array length="+nums.length);

        while( index1 < nums.length-1){

            if((nums[index1] + nums[index2]) == target){
               // System.out.println("Index1 = "+index1+" Index2 = "+index2);
                index[0] = index1;
                index[1] = index2;
                break;
            }
            else{
                index2++;
          //      System.out.println("Index1 = "+index1+" Index2 = "+index2);
            }
            if( index2 == (nums.length)){
                index1++;
                index2 = index1+1;

            }

        }
        return index;
    }

}