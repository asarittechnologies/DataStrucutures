package DataStructures.easy;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
        System.out.println(r.removeDuplicatesFromSortedArray(new int[]{1,1,2,2,3,3,4,4,4,5,5,6}));
    }
    public int removeDuplicatesFromSortedArray(int[] nums){
        int count = 0;
        for(int i =0;i<nums.length;i++){
            if(i< nums.length-1 && nums[i] == nums[i+1]){
                continue;
            }
            nums[count] = nums[i];
            count++;
        }
        return count;
    }
}
