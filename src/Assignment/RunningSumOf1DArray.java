package Assignment;

public class RunningSumOf1DArray {

    public int[] runningSum(int[] nums) {
        int[] runningSumArr = new int[nums.length];
        if(nums.length > 0 )
            runningSumArr[0] =nums[0];
        for(int i = 1; i < nums.length ; i++){
            for(int j =0; j <= i; j++){
                runningSumArr[i] += nums[j];
            }
        }
        return runningSumArr;
    }
}
