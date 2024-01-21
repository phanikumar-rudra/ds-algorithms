package src.arraysandstrings.twopointers;

/*
Example 2: Given a sorted array of unique integers and a target integer, return true
if there exists a pair of numbers that sum to target, false otherwise. This problem is similar to Two Sum.
(In Two Sum, the input is not sorted).

For example, given nums = [1, 2, 4, 6, 8, 9, 14, 15] and target = 13, return true because 4 + 9 = 13.
*/
public class TwoSumIsTarget {

    public boolean checkForTarget(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;

        while(left<right){
          int sum =  nums[left] + nums[right];
          if(sum == target)
              return true;

          if(sum > target)
              right--;
          else
              left++;
        }

        return false;
    }

    public static void main(String[] args) {

        TwoSumIsTarget twoSumIsTarget = new TwoSumIsTarget();

       int[] nums1 = {1, 2, 4, 6, 8, 9, 14, 15};
       int target1 = 13;

        System.out.println(twoSumIsTarget.checkForTarget(nums1,target1));

        int[] nums2 = {1, 2, 4, 6};
        int target2 = 13;

        System.out.println(twoSumIsTarget.checkForTarget(nums2,target2));

    }
}
