//Two Sum

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
////
////You may assume that each input would have exactly one solution, and you may not use the same element twice.
////
////You can return the answer in any order.

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Output: Because nums[0] + nums[1] == 9, we return [0, 1].
public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        for (int i = 0 ; i< nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                if (nums[i] + nums[j] == target){
                    array[0] = i;
                    array[1] = j;

                }
            }

        }
        return array;

    }

}
