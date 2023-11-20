package sortingAndSearching;

public class BinarySearch {
    public static void main(String[] args) {

    }
    public int binarySearch(int num[],int left, int right,int searchValue){
        while(left <= right){
            int mid = (int) (Math.floor(left+right)/2);
            int foundVal = num[mid];
            if(foundVal == searchValue){
                return mid;
            } else if (foundVal > searchValue) {
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }

    public int[] startAndEndIndexOfTarget(int num[],int searchValue){
        if(num.length == 0){
            return new int[]{-1,-1};
        }
        int firstPosition = binarySearch(num,0, num.length-1,searchValue);
        if(firstPosition == -1){
            return new int[]{-1,-1};
        }
        int startPosition  = firstPosition;
        int endPosition = firstPosition;
        int temp1 = 0,temp2=0;
        while(startPosition != -1){
            temp1 = startPosition;
            startPosition = binarySearch(num,0,startPosition-1,searchValue);
        }
        startPosition = temp1;
        while (endPosition != -1){
            temp2 = endPosition;
            endPosition = binarySearch(num,endPosition+1, num.length-1,searchValue);
        }
        temp2= endPosition;
        return new int[]{startPosition,endPosition};
    }
}
