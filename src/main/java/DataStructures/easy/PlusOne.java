package DataStructures.easy;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[]  digits = {1,2,3};
        PlusOne p = new PlusOne();
        int[] res = p.plusOne(digits);
        System.out.println(Arrays.toString(res));
    }
    public int[] plusOne(int[] num){
        for(int i=num.length-1;i>=0;i--){
            if(num[i] < 9){
                num[i]++;
                return num;
            }
            num[i] =0;
        }
        num = new int[num.length+1];
        num[0]=1;
        return num;
    }
}
