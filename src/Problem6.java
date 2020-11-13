//Valid Parentheses

//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.

//Input: s = "([)]"
//Output: false

//()[]{}

import java.util.*;

public class Problem6 {
    public boolean isValid(String inputSt) {
        Stack<Character> stack = new Stack<Character>();
        for(char c : inputSt.toCharArray()){
            if(c =='('){
                stack.push(')');
            }
            else if(c =='{') {
                stack.push('}');
            }
            else if(c == '['){
                stack.push(']');
            }
            else if(stack.isEmpty() || c != stack.pop()){//pop() takes the value and deletes
                return false;
            }
        }
        return stack.isEmpty();




    }
}
