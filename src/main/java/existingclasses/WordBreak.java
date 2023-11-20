package existingclasses;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public static void main(String[] args) {
        String s = "goodteacher";
        Set<String> dict = new HashSet<>();
        dict.add("good");dict.add("teacher");dict.add("tea");
        System.out.println(wordBreak(s,dict));

        List<String> wordDict = List.of("good","teac","her");
        System.out.println(wordBreak2(s,wordDict));
    }

    public static boolean wordBreak2(String s, List< String > wordDict) {
        boolean[] b = new boolean[s.length()+1];
        b[0] = true;
        Set words = new HashSet(wordDict);
        for(int i=0;i<s.length()+1;i++){
            for(int j=0;j<i;j++){
                if(b[j] && words.contains(s.substring(j,i))){
                    b[i]=true;
                    break;
                }
            }
        }
        return b[s.length()];
    }

    public static boolean wordBreak(String s, Set<String> dict) {
        boolean[] t = new boolean[s.length()+1];
        t[0] = true; //set first to be true, why?
//Because we need initial state
        for(int i=0; i<s.length(); i++){
            if(!t[i])
                continue;
            for(String a: dict){
                int len = a.length();
                int end = i + len;
                if(end > s.length())
                    continue;
                if(t[end]) continue;
                if(s.substring(i, end).equals(a)){
                    t[end] = true;
                }
            }
        }
        return t[s.length()];
    }
}
