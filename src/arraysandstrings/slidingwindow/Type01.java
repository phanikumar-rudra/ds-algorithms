package src.arraysandstrings.slidingwindow;

/*
Let's say that we are given a positive integer array nums and an integer k. We need to find the length of the longest subarray
that has a sum less than or equal to k. For this example, let nums = [3, 2, 1, 3, 1, 1] and k = 5

*/
public class Type01 {

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 7, 4, 2, 1, 1, 5};
        int k = 8;
        Type01 type01 = new Type01();
        System.out.printf(String.valueOf(type01.findLength(nums,k)));
    }

    public int findLength(int[] nums, int k) {

        int left =0;
        int curr =0;
        int ans =0;

        for (int right = 0; right < nums.length; right++) {

            curr += nums[right];

            while ( curr > k ){
                curr -= nums[left];
                left++;
            }

            ans = Math.max(ans, right - left + 1 );


        }
        return ans;

    }
}
