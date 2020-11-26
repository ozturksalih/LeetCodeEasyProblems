package Arrays;
//Given an integer array nums, find the contiguous subarray
//(containing at least one number) which has the largest sum and return its sum.


//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.


public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int currentMax =nums[0] ;
        int globalMax = nums[0];
        for(int i = 1 ; i< nums.length ; i++){
            currentMax = Math.max(nums[i], currentMax+nums[i]);
            if(currentMax>globalMax) globalMax = currentMax;
        }
        return globalMax;
    }
    public static void main(String[] args) {
        int[] array = {2,3,45,1};
        System.out.println(maxSubArray(array));

    }
}
