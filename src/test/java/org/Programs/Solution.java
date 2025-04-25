package org.Programs;

import java.util.HashMap;
//Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.
public class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> obj = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int number = target - nums[i];
            if (obj.containsKey(number)) {
                return new int[]{obj.get(number), i};
            }
            obj.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args){
        Solution solution =new Solution();
        int[] nums={2,5,7,5};
        int target=9;
        int[] result=solution.twoSum(nums,target);
        System.out.println("Indices "+result[0]+" ,"+result[1]);
    }
}
