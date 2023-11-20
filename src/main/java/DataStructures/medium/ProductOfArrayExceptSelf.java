package DataStructures.medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        ProductOfArrayExceptSelf p = new ProductOfArrayExceptSelf();
        p.productNumbers(new int[]{1,2,0,4,});

    }
    public void productNumbers(int[] num){
        int prod = 1;
        int[] ans = new int[num.length];
        for(int i=0;i< num.length;i++){
            prod = prod* num[i];
        }
        for(int i=0;i< num.length;i++){
            if(num[i]==0){
                ans[i] = ifZero(num, i, num.length);
                continue;
            }
            ans[i] = prod/num[i];
        }
        System.out.println(Arrays.toString(ans));

    }
    // Special Case
    public int ifZero(int[] nums,int index, int N){
        int answer = 1;
        for(int i=0; i<N; i++){
            if(i==index) continue;
            answer*=nums[i];
        }
        return answer;
    }
}
