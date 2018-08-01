import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NthLargestFrequency {
    public static void findNthLargestFrequency(String string,int n){
        int max =0;
        int secondmax= -1;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<string.length();i++){
            if(map.containsKey(string.charAt(i))){
                map.put(string.charAt(i),map.get(string.charAt(i))+1);
                if(max > map.get(string.charAt(i))){
                    max++;
                }
                else {
                    max = map.get(string.charAt(i));
                }
            }
            else {
                map.put(string.charAt(i), 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        map.forEach((k,v) ->list.add(v));
        Collections.sort(list);
        System.out.println(list);
        }

    public static void main(String args[]){
        String test = "aabbaacaadb";
        findNthLargestFrequency(test,3);
    }
}
