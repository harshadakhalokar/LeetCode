class Solution {
    public String largestEven(String s) {
        char[] arr=s.toCharArray();
        int index=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]%2==0){
                index=i;
                break;
            }
        }

        String ans="";
        for(int i=0;i<=index;i++){
            ans=ans+arr[i];
        }
        return ans;
    }
}