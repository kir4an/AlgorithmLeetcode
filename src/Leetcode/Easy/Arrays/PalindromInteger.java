package Leetcode.Easy.Arrays;

public class PalindromInteger {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String value = Integer.toString(x);
        for(int i = 0;i<value.length();i++){
            if(!(value.charAt(i)==value.charAt(value.length()-i-1))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromInteger palindromInteger = new PalindromInteger();
        System.out.println(palindromInteger.isPalindrome(121));
    }
}
