package Mix;//Palindrome Number

//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
//
//Follow up: Could you solve it without converting the integer to a string?

//Input: x = 121
////Output: true

//Input: x = 10
//Output: false


public class Problem3 {
    public boolean isPalindrome(int x) {
        int same = x;
        int y = 0;
        if(x<0)
            return false;
        while(x != 0){
            int digit = x % 10 ;
            y = y *10 +digit;
            x /= 10;

        }

        if( same == y ){
            return true;
        }

        return false;

    }
}
