//Reverse Integer


//Given a 32-bit signed integer, reverse digits of an integer.
//
//Note:
// Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range:
// [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.


//Input: x = 123
//Output: 321


public class Problem2 {
    public int reverse(int input ){
        if(input >= Integer.MAX_VALUE -1 || input <= Integer.MIN_VALUE ) {
            return 0;
        }
        long reversNo = 0;
        while(input != 0){
            int digit = input%10;
            reversNo = reversNo*10 + digit;// skip digits 65  * 10 + 5
            input/=10;
        }
        if(reversNo >= Integer.MAX_VALUE -1 || reversNo <= Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) reversNo;
        }
    }


}
