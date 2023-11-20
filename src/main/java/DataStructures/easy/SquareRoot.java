package DataStructures.easy;

public class SquareRoot {
    public static void main(String[] args) {
        SquareRoot sq = new SquareRoot();
        System.out.println(sq.mySqrt(9));
    }
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        int first = 1; int last = x;
        while(first <= last){
            int mid = first + (last-first)/2;
            if(mid * mid == x){
                return mid;
            }else if(mid * mid > x){
                last = mid -1;
            }else{
                first = mid+1;
            }
        }
        return last;
    }
}
