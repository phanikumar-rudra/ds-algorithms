package src.arraysandstrings.prefix;

import java.util.Arrays;

public class RunningSumof1dArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        RunningSumof1dArray runningSumof1dArray = new RunningSumof1dArray();
        System.out.printf(Arrays.toString(runningSumof1dArray.runningSum(nums)));
    }

    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            res[i]  = sum;
        }

        return res;
    }
}
