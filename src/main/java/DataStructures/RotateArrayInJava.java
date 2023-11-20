package DataStructures;

import java.util.Arrays;

public class RotateArrayInJava {


    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6,7,8,9};
        int k =3;

        rotate(n,k);
    }
    public static void rotate(int[] n, int k){
        k = k % n.length;
        reverseNumber(n,0,n.length-k-1);
        reverseNumber(n,n.length-k,n.length-1);
        reverseNumber(n,0,n.length-1);
        Arrays.stream(n).forEach(System.out::println);

    }

    private static void reverseNumber(int[] n, int begining, int end) {
        int temp =0;
        while(begining < end){
            temp = n[begining];
            n[begining] = n[end];
            n[end] = temp;
            begining++;
            end--;
        }
    }
}
