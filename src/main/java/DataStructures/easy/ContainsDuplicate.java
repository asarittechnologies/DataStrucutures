package DataStructures.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {

    }
    public boolean containsDuplicate(int[] num){
        Map map= new HashMap<>();
       for(int i=0;i< num.length;i++){
           if(map.containsKey(num[i])){
               return true;
           }
           map.put(num[i],i);
       }
       return false;
    }
}
