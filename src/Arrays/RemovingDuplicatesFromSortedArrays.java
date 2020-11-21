package Arrays;
//Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
//
//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.



public class RemovingDuplicatesFromSortedArrays {
    static int removeDuplicates(int[] nums) {
        if(nums.length == 0 )return 0 ;

        int i =0;//nums[i] = 1
        for(int j = 1; j< nums.length ; j++){
            if(nums[j] != nums[i]){//nums[0] == nums[1] x    //nums[0] == nums[2]
                //when values are not equal 'i' must have the same value
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] array = {1,1,2};
        int len = removeDuplicates(array);
        System.out.println(len);
    }
}
