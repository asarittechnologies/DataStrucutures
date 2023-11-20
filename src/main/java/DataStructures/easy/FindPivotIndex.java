package DataStructures.easy;

public class FindPivotIndex {
    public static void main(String[] args) {

    }
    public int findPivotIndex(int[] nums){

        int leftSum = 0; int rightSum =0;
        for(int i=0;i< nums.length;i++){
            rightSum = rightSum + nums[i];
        }
        for(int i=0;i< nums.length;i++){
            rightSum = rightSum - nums[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum = leftSum + nums[i];
        }
        return  -1;
    }
}
