package Arrays;
//Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
//
//The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
//
//You may assume the integer does not contain any leading zero, except the number 0 itself.



//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.

public class PlusOne {
    public static int[] plusOne(int[] digits) {

        int len = digits.length;

        for(int i = len-1; i != 0 ; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;//
            }
            digits[i] = 0;// i> 9

        }

        //if all the digits 9
        // create a new (array.len +1 )because we need place for 1
        //all digits will 0
        //set the first digit as 1
        //return it
        int[] newArray = new int[len + 1];//
        newArray[0] = 1;
        return newArray;

    }

    public static void main(String[] args) {

        int[] digits = {9,9,9};
        int[] array = plusOne(digits);

        for (int j : array) {
            System.out.print(j + " ");

        }
    }
}
