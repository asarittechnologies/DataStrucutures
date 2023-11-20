package DataStructures.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6,7} ;
        int target = 12;
        TwoSum twoSum = new TwoSum();
        int[] sum = twoSum.sum(n, target);
        for (int i = 0;i<sum.length;i++){
            System.out.println(sum[i]);
        }
        Arrays.stream(sum).forEach(System.out::println);

    }

    public int[] sum(int[] n, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n.length;i++){
            int secondNum = target - n[i]; // 12-5 = 7
            if(map.containsKey(secondNum)){
                return new int[]{ map.get(secondNum),i};
            }
            map.put(n[i],i);
        }
        return new int[]{-1,-1};
    }
}
