package Leetcode.Easy.TwoPointers;

public class moveZeroes {
    public static void moveZeroes(int[] nums) {
        int noneZeroIndex = 0;
        for(int num:nums){
            if(num!=0){
                nums[noneZeroIndex] = num;
                noneZeroIndex++;
            }
        }
        while(noneZeroIndex<nums.length){
            nums[noneZeroIndex] = 0;
            noneZeroIndex++;
        }

    }
}
