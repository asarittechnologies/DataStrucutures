package sortingAndSearching;

public class Quicksort {
    public static void main(String[] args) {
        int[] nums = {3,4,1,6,7,2};
        quicksort(nums,0,nums.length-1);
        for(int i : nums){
            System.out.println(i);
        }

    }
    public static void quicksort(int[] nums, int left , int right){
        if(left < right){
            int partitionId = partition(nums,left,right);
            quicksort(nums,left,partitionId-1);
            quicksort(nums,partitionId+1,right);
        }

    }
    public static int partition(int[] nums, int left , int right){
        int pivot = nums[right];
        int i = left;
        for(int j=left;j<right;j++){
            if(nums[j] < pivot){
                swap(nums,i,j);
                i++;
            }

        }
        swap(nums,i,right);
        return i;
    }
    public static void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
