package existingclasses;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class WordBreak2 {
    public static void main(String[] args) {
        String s = "catsanddog";
        Set<String> dict =  Set.of("cat", "cats", "and", "sand", "dog");
        wordBreak(s,dict);
    }

    public static List<String> wordBreak(String s, Set<String> dict) {
    //create an array of ArrayList<String>
        List<String> dp[] = new ArrayList[s.length()+1];
        dp[0] = new ArrayList<String>();
        for(int i=0; i<s.length(); i++){
            if( dp[i] == null )
                continue;
            for(String word:dict){
                int len = word.length();
                int end = i+len;
                if(end > s.length())
                    continue;
                if(s.substring(i,end).equals(word)){
                    if(dp[end] == null){
                        dp[end] = new ArrayList<String>();
                    }
                    dp[end].add(word);
                }
            }
        }
        List<String> result = new LinkedList<String>();
        if(dp[s.length()] == null)
            return result;
        ArrayList<String> temp = new ArrayList<String>();
        dfs(dp, s.length(), result, temp);
        return result;
    }
    public static void dfs(List<String> dp[],int end,List<String> result,
                           ArrayList<String> tmp){
        if(end <= 0){
            String path = tmp.get(tmp.size()-1);
            for(int i=tmp.size()-2; i>=0; i--){
                path += " " + tmp.get(i) ;
            }
            result.add(path);
            return;
        }
        for(String str : dp[end]){
            tmp.add(str);
            dfs(dp, end-str.length(), result, tmp);
            tmp.remove(tmp.size()-1);
        }
    }



    }
