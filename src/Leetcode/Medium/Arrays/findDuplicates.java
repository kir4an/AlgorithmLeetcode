package Leetcode.Medium.Arrays;

import java.util.ArrayList;
import java.util.List;

public class findDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int n = Math.abs(nums[i]);
            if(nums[n - 1] < 0) {
                duplicates.add(n);
            } else {
                nums[n - 1] *= -1;
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,127,4,2};
        System.out.println(findDuplicates(arr));
    }
}
