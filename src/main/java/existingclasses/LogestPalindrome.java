package existingclasses;

public class LogestPalindrome {
    int resultStart;
    int resultLength;
    public String longestPolindrome(String s){
       if(s.length() < 2){
           return s;
       }
       for(int start=0;start<s.length()-1;start++){
           expandRange(s,start,start);
           expandRange(s,start,start+1);
       }
       return s.substring(resultStart,resultStart+resultLength);

    }

    private void expandRange(String s, int begin, int end) {
       while(begin >= 0 && end < s.length()-1 && s.charAt(begin) == s.charAt(end)){
           begin--;
           end++;
       }
       if(resultLength < end-begin-1){
           resultStart = begin + 1;
           resultLength = end-begin-1;
       }
    }

    public static void main(String[] args) {
        LogestPalindrome logestPalindrome = new LogestPalindrome();
        System.out.println(logestPalindrome.longestPolindrome("abcecbfcba"));
    }
}
