package DataStructures.easy;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement r = new RemoveElement();
        System.out.println(r.removeElement(new int[]{1,2,2,3,4,5,6},2));

    }
    public int removeElement(int[] nums,int target){
        int count =0;
        for(int i=0; i<nums.length-1;i++){
            if(nums[i] != target){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
