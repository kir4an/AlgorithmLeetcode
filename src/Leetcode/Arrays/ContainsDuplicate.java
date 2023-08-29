package Leetcode.Arrays;

import java.util.Arrays;
class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int sizeArray = nums.length;
        for (int i = 1; i < sizeArray; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}