package src.arraysandstrings.slidingwindow;

/*
Example 4: Given an integer array nums and an integer k, find the sum of the subarray with the largest sum whose length is k.

k=4
nums = [3,-1,4,12,-8,5,6]
*/
public class Type04 {

    public static void main(String[] args) {
        int[] nums = {3,-1,4,12,-8,5,6};
        int k = 4;

        Type04 type03 = new Type04();
        System.out.printf(String.valueOf(type03.findBestSubArray(nums, k)));
    }

    public int findBestSubArray(int[] nums, int k) {

        int ans = 0;
        int curr = 0;

        for (int i=0; i< k; i++){
            curr += nums[i];
        }

        ans = curr;
        for (int i = k; i < nums.length; i++){
            curr += nums[i] - nums[i-k];
            ans = Math.max(ans, curr);

        }

        return ans;

    }
}
