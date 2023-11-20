package DataStructures.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
    }
    public int romanToInt(String s) {
        // Map to store romans numerals
        Map<Character, Integer> romanMap = new HashMap<>();
        // Fill the map
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int n = s.length();
        int num = romanMap.get(s.charAt(n-1));
        //MCMXCIV // num = 5
        for(int i=n-2;i >=0 ;i--){
            if(romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i+1))){
                num = num + romanMap.get(s.charAt(i));
            }else{
                num = num - romanMap.get(s.charAt(i));
            }
        }
        return num;
    }
}
