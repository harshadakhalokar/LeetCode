class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0){
            return true;
        }

        String string=s.toLowerCase();
        int left=0;
        int right=string.length()-1;

        while(left<right){
            while(left<right && !Character.isLetterOrDigit(string.charAt(left))) {
                left++;
            }

            while(left<right && !Character.isLetterOrDigit(string.charAt(right))) {
                right--;
            }

            if(string.charAt(left)!=string.charAt(right)){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}