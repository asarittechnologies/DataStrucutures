package DataStructures.easy;

public class PalindromeString {
    public static void main(String[] args) {
        PalindromeString p = new PalindromeString();
        System.out.println(p.isPalindrome("abca"));
    }
    public boolean isPalindrome(String s){
        boolean isPalindrome = true;
        int start  = 0;
        int end = s.length()-1;
        while(start <= end){
            char[] c = s.toCharArray();
            if(c[start] == c[end]){
                start++;
                end--;
                continue;
            }
            isPalindrome = false;
            break;

        }
        return isPalindrome;

    }
}
