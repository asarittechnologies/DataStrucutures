package DataStructures.easy;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        MoveZeroes m = new MoveZeroes();
        m.moveZeros(new int[]{0,0,12,3,4,0,9,0,8,3,2,0});
    }
    public void moveZeros(int[] nums){
        int n =nums.length;
        int zero = 0;
        int numberPosition = 0;
        for(int i=0;i<n;i++){
            while (numberPosition<n && nums[numberPosition] == 0){
                numberPosition++;
                zero++;
            }
            if(numberPosition<n){
                nums[i] = nums[numberPosition];
            }
            numberPosition++;
        }
        for(int i=n-zero;i<n;i++){
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

}

