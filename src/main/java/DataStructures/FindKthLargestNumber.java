package DataStructures;

import java.util.PriorityQueue;

public class FindKthLargestNumber {
    public static void main(String[] args) {
        int[] nums = {3,2,10,5,6,4};
        int k=2;
        FindKthLargestNumber findKthLargestNumber = new FindKthLargestNumber();
        System.out.println(findKthLargestNumber.kthLargestNumber(nums,k));
    }
    public int kthLargestNumber(int[] nums, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i =0;i<nums.length;i++){
            queue.add(nums[i]);
            if(queue.size() > k){
                queue.remove();
            }
        }
        return queue.remove();
    }
}
