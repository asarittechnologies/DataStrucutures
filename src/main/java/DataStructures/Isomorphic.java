package DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Isomorphic {
    public static void main(String[] args) {
        //egg  foo
        // e - f
      //  System.out.println(isIsomorphic("egg","add"));
        System.out.println(isIsomorphic("egg","bar"));
    }
    public static boolean isIsomorphic(String s,String t){
        Map<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            checkInMap(map,tChar);
            if(map.containsKey(sChar)){
                if(tChar != map.get(sChar)){
                    return false;
                }else{
                    map.put(sChar,tChar);
                }
            }
        }
        return true;

    }

    private static Character checkInMap(Map<Character, Character> map, Character tChar) {
        Character key=null;
        Set<Map.Entry<Character, Character>> entries = map.entrySet();
        for(Map.Entry<Character, Character> entry:entries){
            if(entry.getValue().equals(tChar)){
                 key =  entry.getKey();
            }
        }
        return key;
    }

}
