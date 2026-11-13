class Solution {
    public int countAsterisks(String s) {
        int count=0;
        int count_ast=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
                count++;
            }              
            else if(count%2==0 && s.charAt(i)=='*'){
                count_ast++;
            }
        }
        return count_ast;
    }
}