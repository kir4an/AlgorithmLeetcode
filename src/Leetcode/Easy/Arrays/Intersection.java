package Leetcode.Easy.Arrays;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> output = new HashSet<>();
        for(int i = 0;i<nums1.length;i++){
            hashSet.add(nums1[i]);
        }
        for(int i = 0;i<nums2.length;i++){
            if(hashSet.contains(nums2[i])){
                output.add(nums2[i]);
            }
        }
        int n = output.size();
        int arr[] = new int[n];
        int i = 0;
        for(int x:output){
            arr[i++] = x;
        }
        return arr;
    }
}
