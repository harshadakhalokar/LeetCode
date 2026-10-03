class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        int n=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            ans[n+1]=nums[i];
            n++;
        }
        return ans;
    }
}