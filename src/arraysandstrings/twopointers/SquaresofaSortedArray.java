package src.arraysandstrings.twopointers;

import java.util.Arrays;

/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100]
*/
public class SquaresofaSortedArray {

    public void sortedSquares(int[] nums){
        int n = nums.length -1;
        int left = 0;
        int right = n;
        int[] res = new int[nums.length];


        for (int i=n; i >= 0 ; i-- ){
            int square;
            if (Math.abs(nums[left]) < Math.abs(nums[right])){
                square = nums[right];
                right --;
            }else{
                square = nums[left];
                left ++;
            }

            res[i] = square * square;

        }
        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {

        SquaresofaSortedArray squaresofaSortedArray = new SquaresofaSortedArray();

       int[] nums1 = {-4,-1,0,3,10};


        squaresofaSortedArray.sortedSquares(nums1);

        int[] nums2 = {-7,-3,2,3,11};


        squaresofaSortedArray.sortedSquares(nums2);

    }
}
