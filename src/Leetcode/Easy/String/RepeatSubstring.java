package Leetcode.Easy.String;

public class RepeatSubstring {
        public boolean repeatedSubstringPattern(String s) {
            String doubleRepeatString = s+s;
            String result = doubleRepeatString.substring(1, doubleRepeatString.length() - 1);
            return result.contains(s);
    }
}
