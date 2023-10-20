package Leetcode.Medium.LinkedList;

public class findTheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        slow = 0;
        while(slow!= fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int [] nums = new int[]{2,6,4,1,3,1,5};
        System.out.println(findDuplicate(nums));
    }
}
