package Leetcode.Medium.Arrays;

public class ProductOfArray {
    public static int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int temp = 1;
        for(int i:nums){
            temp*=i;
        }
        for(int i = 0;i<nums.length;i++){
            ans[i] = temp/nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int ans[] = new int[]{1,2,3,4};
        System.out.println(productExceptSelf(ans));
    }
}
