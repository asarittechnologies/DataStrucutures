package DataStructures;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class WordLadder1 {
    public static void main(String[] args) {
        String start = "hit";
        String end = "cog";

        Set<String> s = new HashSet<>();
        s.add("hot");s.add("dot");s.add("dog");s.add("lot");s.add("log");
        WordLadder1 wd = new WordLadder1();
        int a = wd.ladderLength(start,end,s);
        System.out.println(a);
    }

        public  int ladderLength(String beginWord, String endWord, Set<String>
                wordDict) {
            wordDict.add(endWord);
            LinkedList<WordNode> queue = new LinkedList<>();
            WordNode wordNode = new WordNode(beginWord,1);
            queue.add(wordNode);
            while(!queue.isEmpty()){
                WordNode node = queue.pop();
                if(wordDict.contains(node)){
                    return node.numSteps;
                }

                char[] arr = node.word.toCharArray();
                for(int i=0;i<node.word.length();i++){
                    for(char h='a';h<'z'; h++){
                        char temp = arr[i];
                        if(arr[i] != h){
                            arr[i] = h; // ait
                        }
                        String s = new String(arr);
                        if(queue.contains(s)){
                            WordNode wordNode1 = new WordNode(s,node.numSteps+1);
                            queue.add(wordNode1);
                            wordDict.remove(s);
                        }
                        arr[i] = temp;

                    }
                }
            }
        return 0;
        }


}
class WordNode{
    String word;
    int numSteps;
    public WordNode(String word, int numSteps){
        this.word = word;
        this.numSteps = numSteps;
    }
}
