package Leetcode.Easy.String;

public class longCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder longPrefix = new StringBuilder();

        if(strs == null){
            return longPrefix.toString();
        }
        int minimumLength = strs[0].length();
        for(int i = 1; i<strs.length;i++){
            minimumLength = Math.min(minimumLength,strs[i].length());
        }
        for(int i = 0;i<minimumLength;i++){
            char current = strs[0].charAt(i);

            for(String str:strs){
                if(str.charAt(i) != current){
                    return longPrefix.toString();
                }

            }
            longPrefix.append(current);
        }
        return longPrefix.toString();
    }
}
