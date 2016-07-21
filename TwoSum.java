import java.io.*;
import java.util.*;

/**

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/


class Solution {
  
    public static int[] twoSum(int[] nums, int target) {
        
        int sum = 0;
        int[] index = new int[2];
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if(sum == target) {
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        
        return index;
    }

  
    public static void main(String[] args) {

        int[] input = {2, 7, 11, 15};
        
        System.out.println(Arrays.toString(twoSum(input, 22)));
        
    
    }
}

