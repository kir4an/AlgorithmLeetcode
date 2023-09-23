package Leetcode.Easy.Arrays;

public class majorityElement {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int count  = 1;
        int majority = nums[0];

        for (int i = 1;i<n;++i){
            if(nums[i]==majority){
                count++;
            }else{
                count -=1;
            }
            if(count == 0){
                majority = nums[i];
                count++;
            }
        }
        return majority;
    }

    public static void main(String[] args) {
        int [] nums = new int[]{3,2,3};
        System.out.println(majorityElement(nums));
    }
}
