package Arrays;

//Given a sorted array of distinct integers and a target value,
//return the index if the target is found. If not, return the index where it would be if it were inserted in order.

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if(nums.length == 0 || target == 0){
            return 0;
        }

        int i = 0 ;
        for( int j = 0 ; j<nums.length ; j++){
            if(nums[j]== target ){
                return j;
            }
            else if(nums[j] < target  && nums[j+1] >target) return j+1;
            else if (target > nums[nums.length-1]) return nums.length;

        }
        return i;
    }

    public static void main(String[] args) {
        int[] array = {2,5};
        System.out.println(searchInsert(array ,1));
    }
}
