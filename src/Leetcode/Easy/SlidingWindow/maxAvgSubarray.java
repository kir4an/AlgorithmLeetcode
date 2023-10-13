package Leetcode.Easy.SlidingWindow;

public class maxAvgSubarray {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0;i<k;i++){
            sum+=nums[i];
        }

        int maxSum = sum;

        //sliding window
        int startIndex = 0;
        int endIndex = k;
        while(endIndex < nums.length){
            sum-=nums[startIndex];
            startIndex++;

            sum+=nums[endIndex];
            endIndex++;

            maxSum = Math.max(maxSum,sum);
        }
        return maxSum/(double)k;
    }
}
