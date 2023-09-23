package Leetcode.Easy.Map;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>> keyAnagramMap = new HashMap<>();

        for(String s:strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(!keyAnagramMap.containsKey(key)){
                keyAnagramMap.put(key,new ArrayList<>());
            }
            keyAnagramMap.get(key).add(s);
        }
        return new ArrayList(keyAnagramMap.values());
    }

    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String [] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams.groupAnagrams(strs));
    }
}
