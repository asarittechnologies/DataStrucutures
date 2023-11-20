package DataStructures.medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
       System.out.println(letterCombinations("23"));
    }
    public static List<String> letterCombinations(String digits) {
        String digitletter[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<String>();
        result.add("");
        if (digits.length() == 0) return result;
        for(int i =0;i<digits.length();i++){
            result = findResult(digitletter[digits.charAt(i) - '0'],result);
        }

        return result;
    }

    private static List<String> findResult(String s, List<String> l) {
        List<String> res = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(String x:l){
                res.add(x+s.charAt(i));
            }
        }
        return res;
    }

}
