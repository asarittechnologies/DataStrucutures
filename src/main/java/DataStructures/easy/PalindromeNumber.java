package DataStructures.easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalidromNumber(1121));

    }
    public boolean isPalidromNumber(int num){
        int x = num;
        int reverse =0;
        while(num > 0){
            reverse = reverse * 10 + (num % 10);
            num = num/10;
        }
        return x == reverse;
    }
}
