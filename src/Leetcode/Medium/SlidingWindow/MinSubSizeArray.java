package Leetcode.Medium.SlidingWindow;

public class MinSubSizeArray {
    public static int minSubArrayLen(int target, int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        int left = 0;
        //int right = 0;
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;
        for(int right = 0;right<nums.length;right++){
            currentSum +=nums[right];

            while(currentSum>=target){
                minLength = Math.min(minLength,right-left+1);
                currentSum -= nums[left];
                left++;
            }
        }
        if(minLength!=Integer.MAX_VALUE){
            return minLength;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        int [] nums = new int[]{2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7,nums));
    }
}

