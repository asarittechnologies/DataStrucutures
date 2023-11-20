package DataStructures.easy;

public class FindIndexOfFirstOccurenceOfString {
    public static void main(String[] args) {
        String  haystack = "leetcode", needle = "leeto";
        FindIndexOfFirstOccurenceOfString f= new FindIndexOfFirstOccurenceOfString();
        System.out.println(f.firstIndexOfString(haystack,needle));
    }
    public int firstIndexOfString(String haystack, String needle){
        if(needle == null || haystack == null){
            return -1;
        }
        if(haystack.equals(needle)){
            return 0;
        }
        int needleLength = needle.length();
        for(int i=0;i<haystack.length()-needleLength+1;i++){
            if(haystack.substring(i,i+needleLength).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
