package Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1=m-1;
        int tail2 = nums2.length-1;
        int lastElement = nums1.length-1;
        int j = 0;
        while(tail1 >=0 && tail2 >=0){
            if(nums2[tail2] > nums1[tail1]){
                nums1[lastElement] = nums2[tail2];
                tail2--;
                lastElement--;
            }
            else if(nums1[tail1] > nums2[tail2]){
                nums1[lastElement] = nums1[tail1];
                tail1--;
                lastElement--;
            }
            else if(nums1[tail1] == nums2[tail2]){
                nums1[lastElement] = nums2[tail2];
                tail2--;
                lastElement--;
            }
        }
    }
    public static void main(String[] args) {
        int[] array1 = {1,2,3,0,0,0};
        int[] array2 = {2,5,6};

        merge(array1,3,array2 ,3);

        for(int i: array1){
            System.out.print( i + " " );
        }
    }
}
