package src.arraysandstrings.prefix;

/*
Example 2: 2270. Number of Ways to Split Array

Given an integer array nums, find the number of ways to split the array into two parts so that the first section
has a sum greater than or equal to the sum of the second section. The second section should have at least one number.

*/
public class Type02 {

    public static void main(String[] args) {
        int[] nums = {10,4,-8,7};

        Type02 type02 = new Type02();
        System.out.printf(String.valueOf(type02.waysToSplitArray(nums)));
    }

    public int waysToSplitArray(int[] nums) {

        int n = nums.length;
        int[] prefix = new int[n];
              prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }

        int ans = 0;
        for (int i = 0; i < n-1; i++) {
            int leftSum = prefix[i];
            int rightSum = prefix[n-1] - prefix[i];

            if ( leftSum >= rightSum ){
                ans++;
            }
        }

        return ans;
    }
}
