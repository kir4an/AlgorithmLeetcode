package Leetcode.Easy.XOR;

public class MissingNumber {
    static int missingNumber(int[] nums) {

        int allXOR = 0;

        // XOR all numbers in range [0, n]
        for (int i = 0; i <= nums.length; i++) {
            allXOR = allXOR ^ i;
        }

        // XOR all numbers in the given array
        for (int num : nums) {
            allXOR = allXOR ^ num;
        }

        // The missing number
        return allXOR;
    }

    public static void main(String[] args) {
        int [] nums = new int[]{9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
}
