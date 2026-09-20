class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int reverse_index=0;
        int index=0;
        for(int i=0 ; i<s.length() ; i++){
            char ch=s.charAt(i);
            reverse_index= 26 - (ch - 'a');
            index=i+1;
            sum=sum+(reverse_index*index);
        }
        return sum;
    }
}