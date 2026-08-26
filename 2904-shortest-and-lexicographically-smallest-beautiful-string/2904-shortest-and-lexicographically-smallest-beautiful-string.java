class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int ones=0;
        int left=0;
        int minlength=Integer.MAX_VALUE;
        String ans="";
        for(int right=0;right<s.length();right++){
            if(s.charAt(right)=='1'){
                ones++;
            }
            
            while(ones>k){
                if(s.charAt(left)=='1'){
                    ones--;
                }
                left++;
            }

            if(ones==k){
                while(s.charAt(left)=='0'){
                    left++;
                }  

                int length=right-left+1;

                if(minlength>length || (length==minlength && s.substring(left,right+1).compareTo(ans)<0)){
                    minlength=length;
                    ans=s.substring(left,right+1);
                }
            }
        }
        return ans;
    }
}