package DataStructures;

import java.util.*;

public class WordLadder2 {
    public static void main(String[] args) {
        String start = "hit";
        String end = "cog";

        Set<String> s = new HashSet<>();
        s.add("hot");s.add("dot");s.add("dog");s.add("lot");s.add("log");
        WordLadder2 wd = new WordLadder2();
        List<List<String>> ladders = wd.findLadders(start, end, s);
        System.out.println(ladders);
    }

    public List<List<String>> findLadders(String start, String end, Set<String> dict) {
        int minStep = 0, preNumSteps = 0;
        List<List<String>> result = new ArrayList<List<String>>();
        LinkedList<WordNode2> queue = new LinkedList<>();
        queue.add(new WordNode2(start, 1, null));
        dict.add(end);
        HashSet<String> visited = new HashSet<String>();
        HashSet<String> unvisited = new HashSet<String>();
        unvisited.addAll(dict);

        while (!queue.isEmpty()) {
            WordNode2 top = queue.remove();
            String word = top.word;
            int currNumSteps = top.numSteps;
            if (word.equals(end)) {
                if (minStep == 0) {
                    minStep = top.numSteps;
                }
                if (top.numSteps == minStep && minStep != 0) {
                    ArrayList<String> t = new ArrayList<String>();
                    t.add(top.word);
                    while (top.pre != null) {
                        t.add(0, top.pre.word);
                        top = top.pre;
                    }
                    result.add(t);
                    continue;
                }
            }
            if (preNumSteps < currNumSteps) {
                unvisited.removeAll(visited);
            }
            preNumSteps = currNumSteps;
            char[] arr = word.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    char temp = arr[i];
                    if (arr[i] != c) {
                        arr[i] = c;
                        String newWord = new String(arr);
                        if (unvisited.contains(newWord)) {
                            queue.add(new WordNode2(newWord, top.numSteps + 1, top));
                            visited.add(newWord);
                        }
                        arr[i] = temp;
                    }
                }
            }
        }
        return result;

    }
}

        class WordNode2 {
            String word;
            int numSteps;
            WordNode2 pre;

            WordNode2(String word, int numSteps, WordNode2 pre) {
                this.pre = pre;
                this.word = word;
                this.numSteps = numSteps;
            }
        }


