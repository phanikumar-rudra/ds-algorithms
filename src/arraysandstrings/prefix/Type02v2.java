package src.arraysandstrings.prefix;

/*
Example 2: 2270. Number of Ways to Split Array

Given an integer array nums, find the number of ways to split the array into two parts so that the first section
has a sum greater than or equal to the sum of the second section. The second section should have at least one number.

*/
public class Type02v2 {

    public static void main(String[] args) {
        int[] nums = {10,4,-8,7};

        Type02v2 type02v2 = new Type02v2();
        System.out.printf(String.valueOf(type02v2.waysToSplitArray(nums)));
    }

    public int waysToSplitArray(int[] nums) {

        int n = nums.length;
        int totalSum=nums[0];
        int leftSum =0;
        for (int i = 1; i < n; i++) {
            totalSum += nums[i];
        }

        int ans = 0;
        for (int i = 0; i < n-1; i++) {
            leftSum += nums[i];
            int rightSum = totalSum - leftSum;

            if ( leftSum >= rightSum ){
                ans++;
            }
        }

        return ans;
    }
}
