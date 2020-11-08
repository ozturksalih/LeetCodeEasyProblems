//Roman to Integer


//        Symbol       Value
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000

//Input: s = "IX"
//Output: 9

import java.util.HashMap;
import java.util.Map;

/*Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3*/
public class Problem4 {
    public int romanToInt(String input) {
        Map<Character,Integer> m = new HashMap<>();
        m.put('I' , 1) ;
        m.put('V' , 5) ;
        m.put('X' , 10) ;
        m.put('L' , 50) ;
        m.put('C' , 100) ;
        m.put('D' , 500) ;
        m.put('M' , 1000) ;
        char[] array = input.toCharArray();
        int out=0;
        int i=0;
        int j=1;
        int first = m.get(array[i]);
        int second = m.get(array[j]);
        for(; j<array.length ; i++ , j++){

            if(first >= second){
                out += first;
            }
            else{
                out += (second-first);
                i++;
                j++;
            }
            if(j==array.length){
                i++;
                if(first >= second){
                    out += first;
                }
                else{
                    out += (second-first);
                    i++;
                    j++;
                }
                return out;
            }

        }

        return out;






    }

}
