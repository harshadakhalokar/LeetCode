class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null){
            return "";
        }

        String pre="";
        for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || ch!=strs[j].charAt(i)){
                    return pre;
                }
            }
            pre+=ch;
        }
        return pre;
    }
}