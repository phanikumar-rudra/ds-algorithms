package src.arraysandstrings.slidingwindow;

public class MaxConsecutiveOnesIII {


    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        MaxConsecutiveOnesIII maxConsecutiveOnesIII = new MaxConsecutiveOnesIII();
        System.out.printf(String.valueOf(maxConsecutiveOnesIII.longestOnes(nums, k)));
    }

    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int right ;

        for( right=0; right < nums.length; right++){

            if( nums[right] == 0 ){
                k--;
            }

            if ( k < 0){
                k += 1-nums[left];
                left++;
            }


        }
        return right - left;
    }

}
