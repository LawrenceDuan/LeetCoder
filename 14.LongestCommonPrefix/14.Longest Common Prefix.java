//Write a function to find the longest common prefix string amongst an array of strings.

//Accepted
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        
        String prefix = strs[0];
        
        for(int i = 1;i < strs.length;i++){
            String temPrefix = "";
            if(prefix.length() < strs[i].length()){
                for(int j = 0;j < prefix.length();j++){
                    if(prefix.charAt(j) == strs[i].charAt(j)) temPrefix = temPrefix + prefix.charAt(j);
                    else{
                        prefix = temPrefix;
                        break;
                    }
                }
            }else{
                for(int j = 0;j < strs[i].length();j++){
                    if(prefix.charAt(j) == strs[i].charAt(j)) temPrefix = temPrefix + prefix.charAt(j);
                    else{
                        prefix = temPrefix;
                        break;
                    }
                }
            }
            prefix = temPrefix;
        }
        
        return prefix;
    }
}

//Approach #1 (Horizontal scanning)
public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++)
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.isEmpty()) return "";
        }        
    return prefix;
}

