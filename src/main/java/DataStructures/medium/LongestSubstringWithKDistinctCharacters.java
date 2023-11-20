package DataStructures.medium;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class LongestSubstringWithKDistinctCharacters {
    private static int findLengthOfLongestSubstringWithKUniqueCharacters(String s, int k) {
        int n = s.length();

        int maxLen = -1; // Stores the length of the longest substring with k unique characters found so far.
        Map<Character, Integer> windowCharCount = new HashMap<>(); // Stores the character count for each character in the current window
        int windowStart = 0;

        for(int windowEnd = 0; windowEnd < n; windowEnd++) {
            // Add the next character to the sliding window
            char c = s.charAt(windowEnd);
            windowCharCount.put(c, windowCharCount.getOrDefault(c, 0) + 1);

            // Shrink the sliding window, until we have exactly 'k' distinct characters in the window
            while(windowCharCount.size() > k) {
                char leftChar = s.charAt(windowStart);

                // Discard the character at windowStart since we're gonna move it out of the window now.
                windowCharCount.put(leftChar, windowCharCount.get(leftChar) - 1);
                if(windowCharCount.get(leftChar) == 0) {
                    windowCharCount.remove(leftChar);
                }

                windowStart++; // Shrink the window
            }

            if(windowCharCount.size() == k) {
                // Update maximum length found so far
                maxLen = Math.max(maxLen, windowEnd-windowStart+1);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String s = keyboard.next();
        int k = keyboard.nextInt();
        keyboard.close();

        System.out.printf("Longest substring with %d unique characters = %d%n", k, findLengthOfLongestSubstringWithKUniqueCharacters(s, k));
    }
}