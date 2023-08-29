package Leetcode.Arrays;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char [] arraysOne = s.toCharArray();
        char [] arraysTwo = t.toCharArray();

        Arrays.sort(arraysOne);
        Arrays.sort(arraysTwo);



        if(arraysOne.length!=arraysTwo.length){
            return false;
        }

        String newStringOne = new String(arraysOne);
        String newStringTwo = new String(arraysTwo);


        if(!newStringOne.equals(newStringTwo)){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("anagram","nagaram"));
    }
}
