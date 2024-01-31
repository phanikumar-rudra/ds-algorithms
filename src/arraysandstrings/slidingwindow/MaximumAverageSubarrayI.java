package src.arraysandstrings.slidingwindow;

public class MaximumAverageSubarrayI {


    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
//Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
        MaximumAverageSubarrayI maximumAverageSubarrayI = new MaximumAverageSubarrayI();
        System.out.printf(String.valueOf(maximumAverageSubarrayI.findMaxAverage(nums, k)));
    }
        public double findMaxAverage(int[] nums, int k) {

            float curr =0;
            float ans =0;

            for ( int i =0; i< k; i++){
                curr += nums[i];

            }

            ans = curr/k;

            for( int j = k; j < nums.length ; j ++ ){
                curr += nums[j] - nums [j - k];

                ans = Math.max(ans, curr/k);
            }


            return ans;
        }

}
