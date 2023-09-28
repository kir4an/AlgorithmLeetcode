package Leetcode.Easy.TwoPointers;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            while(left<right && nums[left] %2 == 0){
                left++;
            }while(left<right && nums[right]%2==1){
                right--;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] nums = new int[]{3,1,2,4};
        System.out.println(sortArrayByParity(nums));
    }
}
