package Leetcode.Easy.Map;

import java.util.HashSet;

public class isHappy {
    public static boolean isHappy(int n) {
        HashSet<Integer> st = new HashSet<>();
        while(true){
            int sum = 0;
            while(n!=0){
                sum+=Math.pow(n%10,2.0);
                n = n/10;
            }
            if(sum==1){
                return true;
            }
            n = sum;
            if(st.contains(n)){
                return false;
            }
            st.add(n);
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
