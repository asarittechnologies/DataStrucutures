package existingclasses;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        rotateArrayUsingArrayCopyOrUsingNewArray(new int[]{1,2,3,4,5,6,7},3);
        rotateUsingBubbleSort(new int[]{1,2,3,4,5,6,7},3);
    }
    // create new array with num size
    // num=7 [1,2,3,4,5,6,7]  k =3
    // after rotating it should be = [4,5,6,7,1,2,3]
    public static void rotateArrayUsingArrayCopyOrUsingNewArray(int[] num, int k){
        if(k > num.length)
            k=k%num.length;
        int[] results= new int[num.length];
        for(int i=0;i< k;i++){
            results[i]= num[num.length-k+i];
        }
        // 4,5,6,7
        int j=0;
        for(int i=k;i< num.length;i++){
            results[i] = num[j];
            j++;
        }
        Arrays.stream(results).forEach(System.out::print);
        System.out.println();
        System.arraycopy(results,0,num,0,num.length);
        Arrays.stream(num).forEach(System.out::print);
        System.out.println();
    }

    public static void  rotateUsingBubbleSort(int[] arr,int k){
        for (int i = 0; i < k; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        Arrays.stream(arr).forEach(System.out::print);
    }
}
