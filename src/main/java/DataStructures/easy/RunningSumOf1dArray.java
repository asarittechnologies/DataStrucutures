package DataStructures.easy;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        RunningSumOf1dArray r = new RunningSumOf1dArray();
        System.out.println(Arrays.toString(r.runningSum(new int[]{1,2,3,4,5})));
    }
    public int[] runningSum(int[] nums){
        for(int i=1;i< nums.length;i++){
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }
}
