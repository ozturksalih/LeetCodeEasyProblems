package Mix;//Longest Common Prefix


//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".

//example
//Input: strs = ["flower","flow","flight"]
//Output: "fl"

public class Problem5 {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length ==0)  return "";

        String common = strs[0];

        for(int i = 1 ; i<strs.length; i++){

            for(;strs[i].indexOf(common) != 0 ;){

                common = common.substring(0,common.length()-1);
            }
        }
        return common;
}}
